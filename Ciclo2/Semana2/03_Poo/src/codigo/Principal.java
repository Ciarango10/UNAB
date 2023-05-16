package codigo;

import clases.Factura;
import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
        //**********************************************
        //definicion de variables
        //**********************************************
        int cantidadFacturas;
        double subtotalFactura, ivaFactura;
        Scanner teclado;
        //**********************************************
        //**********************************************
        //creacion de objetos
        //**********************************************
        teclado = new Scanner(System.in);
        //**********************************************
        System.out.println("¿A cuantas deseas calcular las retenciones: ?");
        cantidadFacturas = teclado.nextInt();
        
        for (int i = 1; i <= cantidadFacturas; i++) {
            Factura objFactura = objFactura = new Factura();
            
            System.out.println("Ingrese el subtotal de la factura " + i + ": ");
            subtotalFactura = teclado.nextDouble();
            objFactura.setSubtotal(subtotalFactura);
            
            System.out.println("Ingrese el iva de la factura " + i + ": ");
            ivaFactura = teclado.nextDouble();
            objFactura.setIva(ivaFactura);
            
            objFactura.calcularReteFuente();
            objFactura.calcularReteIva();
            objFactura.calcularReteIca();
            
            objFactura.imprimirValores();
            
        }
    }
    
    
}
