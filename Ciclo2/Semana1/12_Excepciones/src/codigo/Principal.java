package codigo;

import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
        //**************************************************
        //definicion de variables
        //**************************************************
        int numero1, numero2, resultado;
        Scanner teclado;
        //**************************************************
        //**************************************************
        //creacion de objetos
        //**************************************************
        teclado = new Scanner(System.in);
        //**************************************************
        try {
            System.out.println("Ingrese el numero 1: ");
            numero1 = teclado.nextInt();
            
            System.out.println("Ingrese el numero 2: ");
            numero2 = teclado.nextInt();
            
            resultado = numero1 / numero2;
            
        } catch (Exception e) {
            System.out.println("Ocurrio un error en la operacion.");
            e.printStackTrace(System.out);
        } finally {
            System.out.println("se ejecuta siempre.");
        }
        
    }
    
}
