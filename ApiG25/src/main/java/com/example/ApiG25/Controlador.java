package com.example.ApiG25;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Controlador {

    @GetMapping("/saludo")
    public String hola(){
        return "Hola a Todos";
    }

    @GetMapping("/bienvenida")
    public String bienvenida(){
        return "Bienvenidos a MISION TIC 2022";
    }
    
}
