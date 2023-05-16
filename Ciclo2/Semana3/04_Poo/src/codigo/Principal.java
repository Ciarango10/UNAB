package codigo;

import clases.Administrador;
import clases.Contador;

public class Principal {

    public static void main(String[] args) {
        //******************************************
        //definicion de variables
        //******************************************
        Administrador objAdministrador;
        Contador objContador;
        //******************************************
        //******************************************
        //definicion de objetos
        //****************************************** 
        objAdministrador = new Administrador();
        objContador = new Contador();
        //******************************************
        //******************************************
        //agregar permisos al administrador
        //******************************************
        objAdministrador.iniciarSesion();

        if (objAdministrador.logueado == true) {
            objAdministrador.agregarPermiso("Crear");
            objAdministrador.agregarPermiso("Editar");
            objAdministrador.agregarPermiso("Eliminar");

            objAdministrador.imprimirPermisos();
        } else {
            System.out.println("No se pudo iniciar sesión");
            objAdministrador.borrarPermisos();
        }
        
        //******************************************
        System.out.println("");
        //******************************************
        //agregar permisos para el contador
        //******************************************
        objContador.agregarPermiso("Pagar");
        objContador.agregarPermiso("Informes");

        objContador.imprimirPermisos();
        //******************************************

    }
}
