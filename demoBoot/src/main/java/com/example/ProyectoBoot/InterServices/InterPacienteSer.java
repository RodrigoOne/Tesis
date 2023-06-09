package com.example.ProyectoBoot.InterServices;

import com.example.ProyectoBoot.Entidad.Paciente;
import com.example.ProyectoBoot.Entidad.Reserva;

import java.util.List;
import java.util.Optional;

public interface InterPacienteSer {

    public List<Paciente> listar();
    public Optional<Paciente> listarId(String rut);
    public String save(Paciente p);
    public  void delete(String p);

}
