
package codigo;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
    //*****************************************
    //definicion de variables
    //*****************************************
    Scanner teclado;
    String cadena;
    //*****************************************
    //*****************************************
    //creacion de objetos
    //*****************************************
    teclado = new Scanner(System.in);
    //*****************************************
    System.out.println("Ingrese una cadena");
    cadena = teclado.nextLine();
    //*****************************************
    //*****************************************
    //Obtener la logitud de una cadena
    System.out.println("Longitud Cadena: " + cadena.length());
    //*****************************************
    //*****************************************
    //convertir cadena a minuscula
    System.out.println("Cadena a Minuscula: " + cadena.toLowerCase());
    //*****************************************
    //*****************************************
    //convertir cadena a mayuscula
    System.out.println("Cadena a Mayuscula: " + cadena.toUpperCase());
    //*****************************************
    //*****************************************
    //valida si la cadena  está vacia
    System.out.println("Cadena vacia: " + cadena.isEmpty());
    //*****************************************
    //*****************************************
    //extrae una subcadena de la cadena principal
    System.out.println("Subcadena : " + cadena.substring(0,3));
    //*****************************************
    //*****************************************
    //concatenar cadenas
    System.out.println("Concatenar Cadenas: " + cadena.concat(" otra cadena"));
    //*****************************************
    //*****************************************
    //valida si existe una subcadena en la cadena principal
    System.out.println("Contiene ho: " + cadena.contains("ho"));
    //*****************************************
    //*****************************************
    //reemplazar caracteres en una cadena
    System.out.println("remplazar o: " + cadena.replace("o","X"));
    //*****************************************
    //*****************************************
    //dividir las cadenas
    String[] arregloFecha = cadena.split("/");
    System.out.println("Posicion 0:" + arregloFecha[0]);
    //*****************************************
    //*****************************************
    //obtener posicion de un caracter en la cadena
    System.out.println("Posicion o: " + cadena.indexOf("o") );
    //*****************************************
    //*****************************************
    //quitar espacios al inicio y final de la cadena
    System.out.println("Quitar espacio en blanco: " + cadena.trim());
    //*****************************************
    //*****************************************
    //las cadenas son inmutables
    String cadena2 = "HOLA";
    String cadena3 = new String("CARLOS");
    cadena2 = "COMO ESTAS";
    System.out.println(cadena3);
    //*****************************************
    //*****************************************
    //recorrer cadenas con ciclo for
    for (int i = 0; i < cadena.length(); i++) {
        System.out.println(i + "= " + cadena.charAt(i));
    }
    //*****************************************
    //*****************************************
    }
    
}
