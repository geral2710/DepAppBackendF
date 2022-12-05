package com.example.ApiG25.Servicios;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ApiG25.Modelos.EquipoModelo;
import com.example.ApiG25.Repositorios.EquipoRepositorio;

@Service
public class EquipoServicio {
    @Autowired
    EquipoRepositorio repositorio;

    public EquipoModelo guardarEquipo(EquipoModelo equipo){
        return repositorio.save(equipo);
    }

    public ArrayList<EquipoModelo> consultarEquipos(){
        return (ArrayList<EquipoModelo>) repositorio.findAll();
    }

    public Optional<EquipoModelo> buscarPorCodigo(Long codigo){
        return repositorio.findById(codigo);
    }
    public ArrayList<EquipoModelo> buscarPorNombre(String nombre){
        return repositorio.findByNombre(nombre);
    }

    public boolean eliminarEquipo(Long codigo){
        if (repositorio.existsById(codigo)){
            repositorio.deleteById(codigo);
            return true;
        }
        else {
            return false;
        }
    }
}
