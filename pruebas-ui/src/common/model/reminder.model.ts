export class Reminder {
    id: number = 0;
    nombre: string | null = null;
    estado: Status | null = null;
    categoria: string | null = null;
    orden: number = 0;
    prioridad: Priority | null = null;
  }
  
  export enum Status {
    OPEN = 'Abierta',
    ON_PROGRESS = 'En progreso',
    FINISHED = 'Finalizada'
  }
  
  export enum Priority {
    LOW = 'Baja',
    MEDIUM = 'Media',
    HIGH = 'Alta',
    CRITICAL = "Crítico",
    BLOCKING = "Bloqueante"
  }