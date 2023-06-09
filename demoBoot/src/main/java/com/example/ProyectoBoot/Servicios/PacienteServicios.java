package com.example.ProyectoBoot.Servicios;

import com.example.ProyectoBoot.Entidad.Doctor;
import com.example.ProyectoBoot.Entidad.Paciente;
import com.example.ProyectoBoot.InterServices.InterPacienteSer;
import com.example.ProyectoBoot.Interfas.IntPaciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PacienteServicios implements InterPacienteSer {

    @Autowired
    private IntPaciente IntPac;

    @Override
    public List<Paciente> listar() {
        return (List<Paciente>)IntPac.findAll();
    }

    @Override
    public String save(Paciente p) {
        return null;
    }

    @Override
    public void delete(String p) {

    }
    @Override
    public Optional<Paciente> listarId(String rut) {
        return Optional.empty();
    }


}
