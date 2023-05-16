
package codigo;

import java.util.Collection;
import java.util.HashMap;

public class Principal {
    
    public static void main(String[] args) {
        //********************************************************
        //definicion de arreglo tipo map
        //********************************************************
        HashMap miMapa;
        //********************************************************
        //********************************************************
        //creacion de objetos
        //********************************************************
        miMapa = new HashMap();
        //********************************************************
        //********************************************************
        //agregar elementos
        //********************************************************
        miMapa.put("nombre_persona", "Carlos Andres");
        miMapa.put("edad_persona", 33);
        miMapa.put("celular_persona", 3167899900L);
        miMapa.put("email_persona", "carlosarango3101@gmail.com");
        //********************************************************
        //********************************************************
        //acceder a valores del arreglo
        //********************************************************
        String nombrePersona = (String) miMapa.get("nombre_persona");
        int edadPersona = (int) miMapa.get("edad_persona");
        long celularPersona = (long) miMapa.get("celular_persona");
        String emailPersona = (String) miMapa.get("email_persona");
        //*********************************************************
        //*********************************************************
        //recorrer elementos del arreglo con un ciclo
        //*********************************************************
        System.out.println("Esto imprime las claves del arreglo");
        imprimir(miMapa.keySet());
        System.out.println("Imprime los valores del arreglo");
        imprimir(miMapa.values());
        //*********************************************************
            
    }
    
    public static void imprimir(Collection coleccion){
        coleccion.forEach(elemento ->{
            System.out.println("elemento = " + elemento);
    });
    }
}
