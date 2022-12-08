package com.example.ApiG25.Servicios;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ApiG25.Modelos.PartidosModelo;
import com.example.ApiG25.Repositorios.PartidosRepositorio;

@Service
public class PartidosServicios {
    @Autowired
    PartidosRepositorio repositorio;

    public PartidosModelo guardarPartido(PartidosModelo partidos){
        return repositorio.save(partidos);
    }

    public ArrayList<PartidosModelo> consultarPartidos(){
        return (ArrayList<PartidosModelo>) repositorio.findAll();
    }
}
