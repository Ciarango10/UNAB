package com.example.ApiG47.Repositorio;

import java.util.ArrayList;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.ApiG47.Modelos.UsuarioModelo;

@Repository
public interface UsuarioRepositorio extends MongoRepository<UsuarioModelo,Long>{
    ArrayList<UsuarioModelo> findByApellido(String apellido);
    ArrayList<UsuarioModelo> findByNombre(String nombre);
    ArrayList<UsuarioModelo> findByCorreo(String correo);
}
