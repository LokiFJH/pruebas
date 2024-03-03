import { Component } from '@angular/core';
import { PrimeNGConfig } from 'primeng/api';
import { ReminderService } from '../common/service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'] // Use styleUrls instead of styleUrl
})
export class AppComponent {
  title = 'pruebas-ui';

  products = [
    {"code": 123, "name": "Nombre", "category": "Categoria", "quantity": 213},
    {"code": 123, "name": "Nombre", "category": "Categoria", "quantity": 213}
  ];

  reminders: any = [];

  constructor(private primengConfig: PrimeNGConfig, private reminderService: ReminderService) {}

  ngOnInit() {
    this.primengConfig.ripple = true;
    this.loadReminders();
  }

  loadReminders() {
    this.reminderService.getReminders().subscribe(
      (reminders) => {
        this.reminders = reminders;
      },
      (error) => {
        console.error('Error loading reminders:', error);
      }
    );
  }
}
