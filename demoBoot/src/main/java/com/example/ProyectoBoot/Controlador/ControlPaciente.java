package com.example.ProyectoBoot.Controlador;


import com.example.ProyectoBoot.Entidad.Paciente;
import com.example.ProyectoBoot.InterServices.InterPacienteSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping
public class ControlPaciente {

    @Autowired
    private InterPacienteSer InPacSer;


    @GetMapping(value = "/listarP")
    public String listarP(Model model){
        List<Paciente> pacientes=InPacSer.listar();
        model.addAttribute("pacientes",pacientes);
        return "ListaPaciente";
    }
}
