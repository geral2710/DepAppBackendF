package com.example.ApiG25.Repositorios;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.ApiG25.Modelos.PartidosModelo;

@Repository
public interface PartidosRepositorio extends MongoRepository<PartidosModelo, Long> {
    
}
