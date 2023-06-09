package com.example.ProyectoBoot.Interfas;

import com.example.ProyectoBoot.Entidad.Reserva;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IntReserva extends CrudRepository<Reserva, Integer> {
}
