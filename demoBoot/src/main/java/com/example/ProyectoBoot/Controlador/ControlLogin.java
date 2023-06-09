package com.example.ProyectoBoot.Controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping
public class ControlLogin {

    @RequestMapping("/")
    public String Login(){

        return "Login";

    }

    @RequestMapping(value = "/menu", method = RequestMethod.GET)
    public String menu(){

        return "menu";

    }

}
