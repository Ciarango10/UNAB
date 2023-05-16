package codigo;

import clases.Estudiante;
import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
        //******************************************************
        //definicion de variables
        //******************************************************
        String nombre, mensaje;
        Double nota1, nota2, nota3, definitiva, notaFinal1, notaFinal2, notaFinal3;
        Scanner teclado;
        Estudiante objEstudiante1, objEstudiante2;
        //******************************************************
        //******************************************************
        //creacion de objetos
        //******************************************************
        teclado = new Scanner(System.in);
        objEstudiante1 = new Estudiante("CARLOS ANDRES", 5D, 4D, 4D);
        objEstudiante2 = new Estudiante();
        //******************************************************
        //******************************************************
        //capturar datos por teclado
        //******************************************************
        System.out.println("Ingrese su nombre: ");
        nombre = teclado.nextLine();
        objEstudiante2.setNombre(nombre);
        System.out.println("---> " + objEstudiante2.getNombre());
                
        System.out.println("Ingrese la nota 1: ");
        nota1 = teclado.nextDouble();
        objEstudiante2.setNota1(nota1);
        
        System.out.println("Ingrese la nota 2: ");
        nota2 = teclado.nextDouble();
        objEstudiante2.setNota2(nota2);
        
        System.out.println("Ingrese la nota 3: ");
        nota3 = teclado.nextDouble();
        objEstudiante2.setNota3(nota3);
        //*******************************************************
        //*******************************************************
        //logica de negocio
        //*******************************************************
        objEstudiante1.calcularDefinitiva();
        objEstudiante2.calcularDefinitiva();
        //********************************************************
        //********************************************************
        //impresion de datos de salida
        //********************************************************
        objEstudiante1.imprimirMensaje();
        objEstudiante2.imprimirMensaje();
        //*********************************************************

    }
    
}
