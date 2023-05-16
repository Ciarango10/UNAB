package codigo;

import clases.Moto;

public class Principal {
    
    public static void main(String[] args) {
        //***********************************************
        //definicion de variables
        //***********************************************
        Moto moto1, moto2;
        //***********************************************
        //***********************************************
        //creacion de objetos
        //***********************************************
        moto1 = new Moto(200, "ASD15F");
        System.out.println("El impuesto de la moto 1 es: " + moto1.calcularImpuesto());
        
        moto2 = new Moto(100, "PYR93J");
        System.out.println("El impuesto de la moto 2 es: " + moto2.calcularImpuesto());
        
    }
    
}
