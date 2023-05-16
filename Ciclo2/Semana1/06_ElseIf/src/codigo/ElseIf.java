package codigo;

import java.util.Scanner;

public class ElseIf {

    public static void main(String[] args) {
        //**************************************
        //definicion de variables
        //**************************************
        Scanner teclado;
        int numero;
        String numeroTexto;
        //**************************************
        //**************************************
        //creacion de objetos
        //**************************************
        teclado = new Scanner(System.in);
        //**************************************
        //**************************************
        //capturar datos por teclado
        //**************************************
        System.out.println("Ingrese un numero entero: ");
        numero = teclado.nextInt();
        //**************************************
        //**************************************
        //logica de negocio
        //**************************************
        if (numero == 1) {
            numeroTexto = "Numero Uno";
        } else if (numero == 2) {
            numeroTexto = "Numero Dos";
        } else if (numero == 3) {
            numeroTexto = "Numero Tres";
        } else if (numero == 4) {
            numeroTexto = "Numero Cuatro";
        } else if (numero == 5) {
            numeroTexto = "Numero Cinco";
        }
        else{
            numeroTexto = "Opción no valida";
        }
        System.out.println(numeroTexto);
    }

}
