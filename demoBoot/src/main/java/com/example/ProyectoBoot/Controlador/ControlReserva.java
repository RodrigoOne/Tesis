package com.example.ProyectoBoot.Controlador;

import com.example.ProyectoBoot.Entidad.Reserva;
import com.example.ProyectoBoot.InterServices.InterReservaSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import java.util.Optional;


@Controller
@RequestMapping
public class ControlReserva {


    @Autowired
    private InterReservaSer servRes;

    @GetMapping("/listar")
    public String listar(Model model){
        List<Reserva> reservas=servRes.listar();
        model.addAttribute("reservas",reservas);
        return "ListaReserva";
    }
    @PostMapping("/save")
    public String agregar(@Validated Reserva r, Model model){
        servRes.save(r);
        return "Menu";
    }
    @GetMapping("/editar/{cita}")
    public String EditarRes(@PathVariable int cita, Model model){
        Optional<Reserva>RE=servRes.listarId(cita);
        model.addAttribute("editreser",RE);
        return "EditCita";
    }
    @GetMapping("/eliminar/{cita}")
    public String EliReser(Model model, @PathVariable int cita){
        servRes.delete(cita);
        return "Menu";
    }






}
