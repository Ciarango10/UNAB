package codigo;

import clases.Numero;

public class Principal {
    
    public static void main(String[] args) {
        //********************************************************
        //definicion de variables
        //********************************************************
        int resultado, resultado2;
        Numero objNumero, objNumero2;
        //********************************************************
        //********************************************************
        //creacion de objetos
        //********************************************************
        objNumero = new Numero();
        objNumero2 = new Numero();
        //********************************************************
        //********************************************************
        //capturar datos por teclado
        //*********************************************************
        objNumero.leerPrimerNumero();
        objNumero.leerSegundoNumero();
        objNumero.leerTercerNumero();
        
        objNumero2.leerPrimerNumero();
        objNumero2.leerSegundoNumero();
        objNumero2.leerTercerNumero();
        //*********************************************************
        //*********************************************************
        //logica de negocio
        //*********************************************************
        resultado = objNumero.sumar();
        resultado2 = objNumero2.sumar();
        //*********************************************************
        //*********************************************************
        //imprimir el resultado
        //*********************************************************
        System.out.println("El resultado de la suma es: " + resultado);
        System.out.println("El resultado de la suma es: " + resultado2);
        //*********************************************************
    }
    
}
