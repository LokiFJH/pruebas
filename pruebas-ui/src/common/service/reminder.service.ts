import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Reminder } from '../model';
import { ConfigService } from './config.service';

@Injectable({
  providedIn: 'root'
})
export class ReminderService {
  private subMappingUrl = 'reminder/'; // Adjust the API endpoint as needed
  private apiUrl: string = 'http://localhost:4200/api/';

  constructor(private http: HttpClient, private configService: ConfigService) {
      this.apiUrl = this.apiUrl + this.subMappingUrl;
  }

  // Function to fetch reminders from the API
  getReminders(): Observable<Reminder[]> {
    return this.http.get<Reminder[]>(this.apiUrl);
  }

  // Function to create a new reminder
  createReminder(reminder: Reminder): Observable<Reminder> {
    return this.http.post<Reminder>(this.apiUrl, reminder);
  }

  // Function to update an existing reminder
  updateReminder(reminder: Reminder): Observable<Reminder> {
    const url = `${this.apiUrl}/${reminder.id}`;
    return this.http.put<Reminder>(url, reminder);
  }

  // Function to delete a reminder
  deleteReminder(id: number): Observable<void> {
    const url = `${this.apiUrl}/${id}`;
    return this.http.delete<void>(url);
  }
}
