package com.example.ApiG47.Controladores;

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

import com.example.ApiG47.Modelos.UsuarioModelo;
import com.example.ApiG47.Servicios.UsuarioServicio;

@RestController
//https://lcoalhost:8080/usuario
@RequestMapping("/usuario")
@CrossOrigin("*")
public class UsuarioControlador {
    @Autowired
    UsuarioServicio servicio;
    //http://localhost:8080/usuario/guardar
    @PostMapping("/guardar")
    public UsuarioModelo guardaUsuario(@RequestBody UsuarioModelo usuario){
        return servicio.guardaUsuario(usuario);
    }

    //http://localhost:8080/usuario/consultar
    @GetMapping("/consultar")
    public ArrayList<UsuarioModelo> consultarUsuarios(){
        return servicio.consultar();
    }

    //http://localhost:8080/usuario/consultardocumento/12345
    @GetMapping("/consultardocumento/{documento}")
    public Optional<UsuarioModelo> consultarDocumento(@PathVariable("documento") Long documento){
        return servicio.consultarDocumento(documento);
    }

    //http://localhost:8080/usuario/eliminar/12345
    @DeleteMapping("/eliminar/{documento}")
    public boolean eliminar(@PathVariable Long documento){
        return servicio.eliminarUsuario(documento);
    }

    //http://localhost:8080/usuario/filtrarxapellido
    @GetMapping("/filtrarxapellido/{apellido}")
    public ArrayList<UsuarioModelo> filtrarXApellido(@PathVariable("apellido") String apellido){
        return servicio.buscarXApellido(apellido);
    }

     //http://localhost:8080/usuario/filtrarxnombre
    @GetMapping("/filtrarxnombre/{nombre}")
    public ArrayList<UsuarioModelo> filtrarXNombre(@PathVariable("nombre") String nombre){
        return servicio.buscarXNombre(nombre);
    }

     //http://localhost:8080/usuario/filtrarxcorreo
     @GetMapping("/filtrarxcorreo/{correo}")
    public ArrayList<UsuarioModelo> filtrarXCorreo(@PathVariable("correo") String correo){
        return servicio.buscarXCorreo(correo);
    }
}   
