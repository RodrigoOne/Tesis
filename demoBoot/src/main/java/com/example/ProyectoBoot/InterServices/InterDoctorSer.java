package com.example.ProyectoBoot.InterServices;

import com.example.ProyectoBoot.Entidad.Doctor;
import com.example.ProyectoBoot.Entidad.Reserva;

import java.util.List;
import java.util.Optional;

public interface InterDoctorSer {

    public List<Doctor> listar();
    public Optional<Doctor> listarId(int rut);
    public void save(Doctor d);
    public  void delete(String rut);
}
