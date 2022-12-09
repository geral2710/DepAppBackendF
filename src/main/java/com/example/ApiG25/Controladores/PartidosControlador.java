package com.example.ApiG25.Controladores;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ApiG25.Modelos.PartidosModelo;
import com.example.ApiG25.Servicios.PartidosServicios;

@RestController
//http://localhost:8080/partidos
@RequestMapping("/partidos")
@CrossOrigin("*")
public class PartidosControlador {
    
    @Autowired
    PartidosServicios servicio;
    //http://localhost:8080/partidos/guardar
    @PostMapping("/guardar")
    public PartidosModelo guardarPartidos(@RequestBody  PartidosModelo partidos){
        return servicio.guardarPartido(partidos);
    }

    //http://localhost:8080/partidos/consultar
    @GetMapping("/consultar")
    public ArrayList<PartidosModelo> consultarPartidos(){
        return servicio.consultarPartidos();
    }


}
