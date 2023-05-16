package codigo;

import clases.Administrador;
import clases.AuxiliarContable;
import clases.Contador;
import clases.Perfil;

public class Principal {
    
    public static void main(String[] args) {
        //*******************************************************
        //definicion de variables
        //*******************************************************
        Perfil objAdministrador, objContador, objAuxiliarContable;
        //*******************************************************
        //*******************************************************
        //creacion de objetos
        //*******************************************************
        objAdministrador = new Administrador(1, "Administrador");
        objContador = new Contador(2, "Contador");
        objAuxiliarContable = new AuxiliarContable(3, "Auxiliar Contable");
        //*******************************************************
        //*******************************************************
        //agregar permisos administrador
        //*******************************************************
        objAdministrador.agregarPermiso("Crear Usuarios");
        objAdministrador.agregarPermiso("Crear Perfiles");
        objAdministrador.agregarPermiso("Crear Auditoria");
        //*******************************************************
        //*******************************************************
        //agregar permisos contador
        //*******************************************************
        objContador.agregarPermiso("Pagar");
        objContador.agregarPermiso("Contabilizar");
        //*******************************************************
        //*******************************************************
        //agregar permisos auxiliar contable
        //*******************************************************
        objAuxiliarContable.agregarPermiso("Editar Asientos");
        objAuxiliarContable.agregarPermiso("Crear Asientos");
        //*******************************************************
        System.out.println("Nombre Perfil: " + objAdministrador.getNombrePerfil());
        objAdministrador.imprimirPermisos();
        
        System.out.println("");
        
        System.out.println("Nombre Perfil: " + objContador.getNombrePerfil());
        objContador.imprimirPermisos();
        
        System.out.println("");
        
        System.out.println("Nombre Perfil: " + objAuxiliarContable.getNombrePerfil());
        objAuxiliarContable.imprimirPermisos();
        
    }
    
}
