package com.example.ProyectoBoot.Interfas;

import com.example.ProyectoBoot.Entidad.Secretaria;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IntSecretaria extends CrudRepository<Secretaria,Integer> {
}
