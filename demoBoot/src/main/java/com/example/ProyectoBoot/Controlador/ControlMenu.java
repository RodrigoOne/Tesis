package com.example.ProyectoBoot.Controlador;

import com.example.ProyectoBoot.Entidad.Reserva;
import com.example.ProyectoBoot.InterServices.InterReservaSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class ControlMenu {

    @Autowired
    private InterReservaSer servRes;

    @RequestMapping("/ircita")
    public String IrAgreCita(Model model){
        model.addAttribute("agrereser",new Reserva());
        return "AgreCita";
    }


}
