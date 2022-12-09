package com.example.ApiG25.Controladores;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ApiG25.Modelos.EquipoModelo;
import com.example.ApiG25.Servicios.EquipoServicio;

@RestController
//http://localhost:8080/equipo
@RequestMapping("/equipo")
@CrossOrigin("*")
public class EquipoControlador {
    
    @Autowired
    EquipoServicio servicio;
    //http://localhost:8080/equipo/guardar
    @PostMapping("/guardar")
    public EquipoModelo guardaEquipo(@RequestBody EquipoModelo equipo){
        return servicio.guardarEquipo(equipo);
    }

    //http://localhost:8080/equipo/consultar
    @GetMapping("/consultar")
    public ArrayList<EquipoModelo> consultarEquipo(){
        return servicio.consultarEquipos();
    }

    //http://localhost:8080/equipo/consultarcodigo
    @GetMapping("/consultarcodigo/{codigo}")
    public Optional<EquipoModelo> consultaCodigo(@PathVariable("codigo") Long codigo){
        return servicio.buscarPorCodigo(codigo);
    }
    //http://localhost:8080/equipo/consultarnombre
    @GetMapping("/consultarnombre/{nombre}")
    public ArrayList<EquipoModelo> consultaNombre(@PathVariable("nombre") String nombre){
        return servicio.buscarPorNombre(nombre);
    }
    //http://localhost:8080/equipo/eliminar
    @DeleteMapping("/eliminar/{codigo}")
    public Boolean eliminar(@PathVariable("codigo") Long codigo){
        return servicio.eliminarEquipo(codigo);
    }

}
