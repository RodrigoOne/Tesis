package com.example.ProyectoBoot.Entidad;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Secretaria {

    @Id
    private String rut;
    private String nombre;
    private String apellido;
    private String usuario;
    private String clave;

    public Secretaria() {
    }

    public Secretaria(String rut, String nombre, String apellido, String usuario, String clave) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuario = usuario;
        this.clave = clave;
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

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
}
