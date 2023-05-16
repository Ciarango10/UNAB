package clases;

import java.util.Scanner;

public class Numero {

    //*********************************************
    //atributos o propiedades
    //*********************************************
    private int valor1;
    private int valor2;
    private int valor3;
    private final Scanner teclado;
    //*********************************************

    //*********************************************
    //constructor
    //*********************************************
    public Numero() {
        System.out.println("Alguien acaba de crear un objeto de tipo clase numero.");
        teclado = new Scanner(System.in);
    }
    //**********************************************

    //**********************************************
    //metodos
    //**********************************************
    public int sumar() {
        int resultado;
        resultado = valor1 + valor2 + valor3;
        return resultado;
    }

    public void leerPrimerNumero() {
        System.out.println("Ingrese el numero 1: ");
        valor1 = teclado.nextInt();
    }

    public void leerSegundoNumero() {
        System.out.println("Ingrese el numero 2: ");
        valor2 = teclado.nextInt();
    }

    public void leerTercerNumero() {
        System.out.println("Ingrese el numero 3: ");
        valor3 = teclado.nextInt();
    }
    //**********************************************

}
