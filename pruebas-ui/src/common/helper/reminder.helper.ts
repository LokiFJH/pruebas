import { Reminder } from "../model";

export class ReminderHelper {
  // Function to create a new Reminder instance
  static createReminder(data: any): Reminder {
    const reminder = new Reminder();
    reminder.id = data.id || null;
    reminder.nombre = data.nombre || '';
    reminder.estado = data.estado || null;
    reminder.categoria = data.categoria || '';
    reminder.orden = data.orden || 0;
    reminder.prioridad = data.prioridad || null;
    return reminder;
  }
}
