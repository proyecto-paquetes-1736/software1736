package com.example.proyecto1736.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class aplicacionControlador {
    @GetMapping("/calcularTarifa")
    public String calcularTarifa(Model modelo){
        int pesoGramos = 300;
        int valorGramo = 25;
        int valorTarifa = pesoGramos * valorGramo;
        modelo.addAttribute("valTarifa", valorTarifa) ; 
        return "tarifa";
    }
}
