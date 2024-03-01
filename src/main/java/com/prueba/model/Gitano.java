package com.prueba.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;

@Data
@Table(name="gitano")
public class Gitano {

    @Column(name = "nombre")
    String nombre = null;

    @Column(name = "apellido")
    String appelido = null;

    @Column(name = "edad")
    int edad = 0;

    @Column(name = "hijos")
    int hijos = 0;

    @Column(name = "delitos")
    int delitos = 0;
}
