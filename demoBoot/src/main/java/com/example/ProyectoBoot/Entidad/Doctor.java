package com.example.ProyectoBoot.Entidad;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Doctor {
    @Id
    private String rut;
    private String nombre;
    private String apellido;
    private String numero;
    private String direccion;
    private String especialidad;

    public Doctor() {
    }

    public Doctor(String rut, String nombre, String apellido, String numero, String direccion, String especualidad) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.numero = numero;
        this.direccion = direccion;
        this.especialidad = especualidad;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEspecualidad() {
        return especialidad;
    }

    public void setEspecualidad(String especualidad) {
        this.especialidad = especualidad;
    }
}
