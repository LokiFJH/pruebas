package com.prueba.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="recordatorios")

public class Reminder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="nombre")
    private String nombre=null;

    @Column(name="estado")
    private Status estado=null;

    @Column(name="categoria")
    private String categoria=null;

    @Column(name="orden")
    private int orden=0;

    @Column(name="prioridad")
    private Priority prioridad=null;


}
