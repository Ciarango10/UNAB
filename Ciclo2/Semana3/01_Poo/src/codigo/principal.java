
package codigo;

import clases.Administrador;
import clases.AuxiliarContable;
import clases.Contador;
import clases.Perfil;
import oracle.jrockit.jfr.tools.ConCatRepository;

public class principal {
    
    public static void main(String[] args) {
        //*****************************************
        //definicion de variables
        //*****************************************
        Administrador objAdministrador; 
        Contador objContador;
        AuxiliarContable objAuxiliarContable;
        //*****************************************
        //*****************************************
        //creacion de objetos
        //*****************************************
        objAdministrador = new Administrador(1,"Administrador");
        objContador = new Contador(2,"Contador");
        objAuxiliarContable = new AuxiliarContable(3, "Auxiliar Contable");
        //*****************************************
        
        System.out.println("Nombre Perfil: " + objAdministrador.getNombrePerfil());
        System.out.println("Permisos: " + objAdministrador.mostrarPermisos());
        System.out.println(objAdministrador.toString());
        System.out.println("");
        
        System.out.println("Nombre Perfil: " + objContador.getNombrePerfil());
        System.out.println("Permisos: " + objContador.mostrarPermisos());
        System.out.println(objContador.toString());
        System.out.println("");
        
        System.out.println("Nombre Perfil: " + objAuxiliarContable.getNombrePerfil());
        System.out.println("Permisos: " + objAuxiliarContable.mostrarPermisos());
        System.out.println(objAuxiliarContable.toString());
        System.out.println("");
    }
}
