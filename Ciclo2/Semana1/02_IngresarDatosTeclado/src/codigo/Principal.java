package codigo;

import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
        //*********************************************
        //definicion de variables
        //*********************************************
        Scanner teclado;
        String nombreEstudiante, apellidoEstudiante, direccionEstudiante, emailEstudiante, mensaje;
        Long celularEstudiante;
        byte edadEstudiante;
        //*********************************************
        //*********************************************
        //creacion de objetos
        //*********************************************
        teclado = new Scanner(System.in);
        //*********************************************
        //*********************************************
        //capturar datos por teclado
        //*********************************************
        System.out.println("Ingrese sus nombres: ");
        nombreEstudiante = teclado.nextLine();
        
        System.out.println("Ingrese los apellidos: ");
        apellidoEstudiante = teclado.nextLine();
        
        System.out.println("Ingrese su direccion: ");
        direccionEstudiante = teclado.nextLine();
        
        System.out.println("Ingrese su email: ");
        emailEstudiante = teclado.nextLine();
        
        System.out.println("Ingrese su numero de celular: ");
        celularEstudiante = teclado.nextLong();
        
        System.out.println("Ingrese su edad: ");
        edadEstudiante = teclado.nextByte();
        //*********************************************
        //*********************************************
        //impresion de lo datos por pantalla
        //*********************************************
        mensaje = "******************************************************\n";
        mensaje += "DATOS DEL ESTUDIANTE\n";
        mensaje += "******************************************************\n";
        mensaje += "NOMBRE ESTUDIANTE: " + nombreEstudiante + " " + apellidoEstudiante + "\n";
        mensaje += "DIRECCION ESTUDIANTE: " + direccionEstudiante + "\n";
        mensaje += "EMAIL ESTUDIANTE: " + emailEstudiante + "\n";
        mensaje += "CELULAR ESTUDIANTE: " + celularEstudiante + "\n";
        mensaje += "EDAD ESTUDIANTE: " + edadEstudiante + "\n";
        mensaje += "******************************************************\n";
        System.out.println(mensaje);
    }
    
}
