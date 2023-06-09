package com.example.ProyectoBoot.InterServices;

import com.example.ProyectoBoot.Entidad.Reserva;

import java.util.List;
import java.util.Optional;

public interface InterReservaSer {
    public List<Reserva> listar();
    public Optional<Reserva> listarId(int cita);
    public int save(Reserva r);
    public  void delete(int cita);
}
