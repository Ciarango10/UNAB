package Prueba;

import clases.Cuenta;

public class Principal {

    public static void main(String[] args) {
        //*******************************************
        //DEFINICION DE VARIABLES
        //*******************************************
        Cuenta cuenta1, cuenta2;
        //*******************************************
        //*******************************************
        //CREACION DE OBJETOS
        //*******************************************
        cuenta1 = new Cuenta(123456, "2022/08/03", 1, 50000);
        cuenta2 = new Cuenta(14785,"2022/05/05",3,100000);
        //*******************************************
        
        cuenta2.setNumeroCuenta(14785);
        cuenta2.setFechaApertura("2022/05/05");
        cuenta2.setTipoCuenta(3);
        cuenta2.setSaldoCuenta(100000);
                
        System.out.println("El interes de la cuenta 1 es: " + cuenta1.calcular_interes());
        System.out.println("El interes de la cuenta 2 es: " + cuenta2.calcular_interes());
                
    }

}
