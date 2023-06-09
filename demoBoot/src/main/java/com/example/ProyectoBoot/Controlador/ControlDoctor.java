package com.example.ProyectoBoot.Controlador;

import com.example.ProyectoBoot.Entidad.Doctor;
import com.example.ProyectoBoot.Entidad.Reserva;
import com.example.ProyectoBoot.InterServices.InterDoctorSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping
public class ControlDoctor {

    @Autowired
    private InterDoctorSer InDocSer;

    @GetMapping(value = "/listarD")
    public String listarD(Model model){
        List<Doctor> doctores=InDocSer.listar();
        model.addAttribute("doctores",doctores);
        return "ListaDoctor";
    }

}
