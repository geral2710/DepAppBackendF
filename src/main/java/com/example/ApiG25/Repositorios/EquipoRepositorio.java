package com.example.ApiG25.Repositorios;

import java.util.ArrayList;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.ApiG25.Modelos.EquipoModelo;

@Repository
public interface EquipoRepositorio extends MongoRepository<EquipoModelo, Long> {
    ArrayList<EquipoModelo> findByNombre(String nombre);
}
