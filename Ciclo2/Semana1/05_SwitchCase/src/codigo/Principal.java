package codigo;

import java.util.Scanner;

public class Principal {
    
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
        switch (numero) {
            case 1:
                numeroTexto = "Numero Uno";
                break;
                
            case 2:
                numeroTexto = "Numero Dos";
                break;
                
            case 3:
                numeroTexto = "Numero Tres";
                break;
                
            case 4:
                numeroTexto = "Numero Cuatro";
                break;
                
            case 5:
                numeroTexto = "Numero Cinco";
                break;
                
            default:
                numeroTexto = "Opcion no valida";
        }
        
        System.out.println(numeroTexto);
    }
    
}
