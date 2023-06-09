package com.example.ProyectoBoot.Controlador;

import com.example.ProyectoBoot.Entidad.Reserva;
import com.example.ProyectoBoot.InterServices.InterReservaSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping
public class ControlMenu {

    @Autowired
    private InterReservaSer servRes;

    @RequestMapping(value = "/ircita", method = RequestMethod.GET)
    public String IrAgreCita(Model model){
        model.addAttribute("agrereser",new Reserva());
        return "AgreCita";
    }


}
