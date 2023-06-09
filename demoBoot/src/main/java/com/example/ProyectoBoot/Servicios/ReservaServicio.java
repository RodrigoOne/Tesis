package com.example.ProyectoBoot.Servicios;

import com.example.ProyectoBoot.Entidad.Reserva;
import com.example.ProyectoBoot.InterServices.InterReservaSer;
import com.example.ProyectoBoot.Interfas.IntReserva;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class ReservaServicio implements InterReservaSer {

    @Autowired
    private IntReserva dataRes;
    public List<Reserva> listar() {

        return (List<Reserva>)dataRes.findAll();

    }

    @Override
    public Optional<Reserva> listarId(int cita) {

        return dataRes.findById(cita);
    }

    @Override
    public int save(Reserva r) {
        int RE= 0;
        Reserva res= dataRes.save(r);
        if (!res.equals(null)){
            RE=1;
        }
        return 0;
    }

    @Override
    public void delete(int cita) {
        dataRes.deleteById(cita);
    }
}
