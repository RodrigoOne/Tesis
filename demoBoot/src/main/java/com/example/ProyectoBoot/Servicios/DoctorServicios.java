package com.example.ProyectoBoot.Servicios;

import com.example.ProyectoBoot.Entidad.Doctor;
import com.example.ProyectoBoot.InterServices.InterDoctorSer;
import com.example.ProyectoBoot.Interfas.IntDoctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DoctorServicios implements InterDoctorSer {


    @Autowired
    private IntDoctor IntDoc;
    @Override
    public List<Doctor> listar() {

        return (List<Doctor>)IntDoc.findAll();
    }

    @Override
    public Optional<Doctor> listarId(int rut) {
        return Optional.empty();
    }

    @Override
    public void save(Doctor d) {

    }

    @Override
    public void delete(String rut) {

    }

}
