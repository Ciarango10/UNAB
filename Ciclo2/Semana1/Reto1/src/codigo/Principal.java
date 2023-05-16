package codigo;

import java.util.Scanner;


public class Principal {
    public static void main(String[] args) {
    //******************************************        
    //definicion de variables
    //******************************************
    Scanner teclado;
    String fechaApertura;
    int numeroDeCuentas;
    long numeroCuenta;
    int tipoCuenta;
    double saldoCuenta;
    double interesMensual = 0;
    double interes;
    double incremento;
    double acumulador = 0;
    double acumuladorSaldos = 0;
    //*******************************************
    //creacion objetos
    //*******************************************
    teclado = new Scanner(System.in);
    //*******************************************
    //capturar datos por teclado
    //*******************************************
        System.out.println("Ingrese el numero de cuentas");
        numeroDeCuentas = teclado.nextInt();
        
        for (int i = 0; i < numeroDeCuentas; i++) {
        System.out.println("Ingrese su numero de cuenta");
        numeroCuenta = teclado.nextLong();
        
        System.out.println("Ingrese su fecha de apertura");
        fechaApertura = teclado.next();
        
        System.out.println("Valor de interes mensual de la cuenta");
        tipoCuenta = teclado.nextInt();
        if(tipoCuenta == 1){
            interesMensual = 1.5;
        }
        else if(tipoCuenta == 2){
            interesMensual = 1.7;
        }
        else if(tipoCuenta == 3 ){
            interesMensual  = 1.6;
        } 
        System.out.println("Ingrese el saldo de la cuenta");
        saldoCuenta = teclado.nextDouble();   
        
        interes = interesMensual * saldoCuenta /100;
        incremento = interes + saldoCuenta; 
        acumulador += interes;
        acumuladorSaldos += incremento;
        //********************************************************
        //Impresion de datos por pantalla
        System.out.println(numeroCuenta);
        System.out.println(interes);
        System.out.println(incremento);
        }
        
        System.out.println(acumulador);
        System.out.println(acumuladorSaldos);
    }
}
