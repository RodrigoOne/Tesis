package com.example.ProyectoBoot.Interfas;

import com.example.ProyectoBoot.Entidad.Paciente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IntPaciente extends CrudRepository<Paciente,Integer> {
}
