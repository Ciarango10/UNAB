package codigo;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        //*******************************************
        //definicion de variables
        //*******************************************
        Scanner teclado;
        double nota1, nota2, nota3, promedio;
        //*******************************************
        //*******************************************
        //creacion de objetos
        //*******************************************
        teclado = new Scanner(System.in);
        //*******************************************
        //*******************************************
        //capturar datos por teclado
        //*******************************************
        System.out.println("Ingrese la nota 1: ");
        nota1 = teclado.nextDouble();

        System.out.println("Ingrese la nota 2: ");
        nota2 = teclado.nextDouble();

        System.out.println("Ingrese la nota 3: ");
        nota3 = teclado.nextDouble();
        //********************************************
        //********************************************
        //logica de negocio
        //********************************************
        promedio = (nota1 + nota2 + nota3) / 3;

        if (promedio >= 3) {
            System.out.println("La nota final es: " + promedio);
            System.out.println("APROBO");
        } else {
            System.out.println("La nota final es: " + promedio);
            System.out.println("PERDIO");
        }
        //********************************************

    }

}
