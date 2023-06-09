package com.example.ProyectoBoot.Entidad;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cita;
    private  String hora;
    private  String fecha;
    private  String estado;
    private  String observacion;
    private  String nompac;
    private  String apellipas;
    private  String doctor;



    public Reserva() {

    }

    public Reserva(int cita, String hora, String fecha, String estado, String observacion, String nompac, String apellipas, String doctor) {
        this.cita = cita;
        this.hora = hora;
        this.fecha = fecha;
        this.estado = estado;
        this.observacion = observacion;
        this.nompac = nompac;
        this.apellipas = apellipas;
        this.doctor = doctor;
    }

    public int getCita() {
        return cita;
    }

    public void setCita(int cita) {
        this.cita = cita;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getNompac() {
        return nompac;
    }

    public void setNompac(String nompac) {
        this.nompac = nompac;
    }

    public String getApellipas() {
        return apellipas;
    }

    public void setApellipas(String apellipas) {
        this.apellipas = apellipas;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }
}
