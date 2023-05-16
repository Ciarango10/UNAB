package codigo;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        //******************************************************
        //definicion de variables
        //******************************************************
        int cantidadEstudiantes;
        String nombreEstudiante;
        double nota1, nota2, nota3, notaFinal;
        Scanner teclado;
        //*******************************************************
        //*******************************************************
        //creacion de objetos
        //*******************************************************
        teclado = new Scanner(System.in);
        //*******************************************************
        System.out.println("¿A cuantos estudiantes desea calcular la nota final?: ");
        cantidadEstudiantes = teclado.nextInt();

        for (int i = 1; i <= cantidadEstudiantes; i++) {
            System.out.println("Ingrese el nombre del estudiante: " + i + ": ");
            nombreEstudiante = teclado.next();
            
            nota1 = leerNota(1);
            nota2 = leerNota(2);
            nota3 = leerNota(3);
            
            notaFinal = calcularNotaFinal(nota1,nota2,nota3,nombreEstudiante);
            imprimirResultados(nota1,nota2,nota3,notaFinal,nombreEstudiante);
            

        }
    }

    public static double leerNota(int numeroNota) {
        double nota;
        Scanner teclado;
        teclado = new Scanner(System.in);

        System.out.println("Ingrese la nota " + numeroNota + ": ");
        nota = teclado.nextDouble();

        while (nota < 0 || nota > 5) {
            System.out.println("Error: el rango de la nota debe ser entre 0 y 5.");
            System.out.println("Ingrese la nota " + numeroNota + ": ");
            nota = teclado.nextDouble();
        }
        return nota;
    }
    
    public static Double calcularNotaFinal(Double nota1, Double nota2, Double nota3, String estudiante){
       Double notaFinal1, notaFinal2,notaFinal3,definitivaNota;
       
       notaFinal1 = nota1 *30 / 100;
       notaFinal2 = nota2 *30 / 100;
       notaFinal3 = nota3 *30 / 100;
       definitivaNota = notaFinal1 + notaFinal2 + notaFinal3;
       
       return definitivaNota;
    }
    
    public static void imprimirResultados(Double nota1, Double nota2, Double nota3, Double definitiva, String estudiante){
        String mensaje;
        mensaje = "******************************************************\n";
        mensaje += "REPORTE DE NOTAS DEL ESTUDIANTE " + estudiante + "\n";
        mensaje += "*****************************************************\n";
        mensaje += "NOTA 1: : " + nota1 + "\n";
        mensaje += "NOTA 2: : " + nota2 + "\n";
        mensaje += "NOTA 3: : " + nota3 + "\n";
        mensaje += "DEFINITIVA: " + definitiva + "\n";
        if(definitiva >= 3){
            mensaje +="APROBO LA MATERIA\n";
        }
        else{
            mensaje+="NO APROBO LA MATERIA\n";
        }
        mensaje+= "******************************************************\n";
        System.out.println(mensaje);
        
        
    }

}
