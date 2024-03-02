package com.prueba.model;

import lombok.Data;

import jakarta.persistence.*;

@Data
@Entity
@Table(name="gitano")
public class Gitano {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre")
    private String nombre = null;

    @Column(name = "apellido")
    private String apellido = null;

    @Column(name = "edad")
    private int edad = 0;

    @Column(name = "hijos")
    private int hijos = 0;

    @Column(name = "delitos")
    private int delitos = 0;
}
