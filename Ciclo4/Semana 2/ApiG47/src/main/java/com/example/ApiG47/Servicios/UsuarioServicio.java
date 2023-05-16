package com.example.ApiG47.Servicios;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ApiG47.Modelos.UsuarioModelo;
import com.example.ApiG47.Repositorio.UsuarioRepositorio;

@Service
public class UsuarioServicio {
    @Autowired
    UsuarioRepositorio repositorio;

    public UsuarioModelo guardaUsuario(UsuarioModelo usuario){
        return repositorio.save(usuario);
    }

    public ArrayList<UsuarioModelo> consultar(){
        return (ArrayList<UsuarioModelo>) repositorio.findAll();
    }

    public Optional<UsuarioModelo> consultarDocumento(Long documento){ 
        return repositorio.findById(documento);
    }

    public boolean eliminarUsuario(Long documento){
        if(repositorio.existsById(documento)){
            repositorio.deleteById(documento);
            return true;
        }else{
            return false;
        }
    }//cierre eliminar usuario

    public ArrayList<UsuarioModelo> buscarXApellido(String apellido){
        return repositorio.findByApellido(apellido);
    }

    public ArrayList<UsuarioModelo> buscarXNombre(String nombre){
        return repositorio.findByNombre(nombre);
    }

    public ArrayList<UsuarioModelo> buscarXCorreo(String correo){
        return repositorio.findByCorreo(correo);
    }

}