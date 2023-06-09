package com.example.ProyectoBoot.Controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class ControlLogin {

    @RequestMapping("/")
    public String Login(){

        return "Login";

    }

    @RequestMapping("/menu")
    public String menu(){

        return "menu";

    }

}
