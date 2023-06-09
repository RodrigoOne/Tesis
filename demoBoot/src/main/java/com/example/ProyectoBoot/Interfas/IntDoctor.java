package com.example.ProyectoBoot.Interfas;

import com.example.ProyectoBoot.Entidad.Doctor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IntDoctor extends CrudRepository<Doctor,Integer> {
}
