package codigo;

import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
        //**********************************************
        //definicion de variables
        //**********************************************
        int cantidadFacturas;
        double subtotalFactura, ivaFactura, reteFuente, reteIva, reteIca;
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
            System.out.println("Ingrese el subtotal de la factura " + i + ": ");
            subtotalFactura = teclado.nextDouble();
            
            System.out.println("Ingrese el iva de la factura " + i + ": ");
            ivaFactura = teclado.nextDouble();
            
            reteFuente = calcularReteFuente(subtotalFactura);
            reteIva = calcularReteIva(ivaFactura);
            reteIca = calcularReteIca(subtotalFactura);
            
            imprimirValores(subtotalFactura, ivaFactura, reteFuente, reteIva, reteIca);
        }
    }
    
    public static double calcularReteFuente(double subtotal){
        double valorRetefuente;
        valorRetefuente = subtotal * 3.5 / 100;
        return valorRetefuente;
    }
    
    public static double calcularReteIva(double iva){
        double valorReteIva;
        valorReteIva = iva * 15 / 100;
        return valorReteIva;
    }
    
    public static double calcularReteIca(double subtotal){
        double valorReteIca;
        valorReteIca = subtotal * 5 / 1000;
        return valorReteIca;
    }
    
    public static void imprimirValores(double subtotal, double iva, double reteFuente, double reteIva, double reteIca){
        String mensaje;
        mensaje = "************************************************************\n";
        mensaje += "DETALLE DE LAS RETENCIONES DE LA FACTURA\n";
        mensaje += "************************************************************\n";
        mensaje += "SUBTOTAL FACTURA: " + subtotal + "\n";
        mensaje += "IVA FACTURA: " + iva + "\n";
        mensaje += "RETE FUENTE FACTURA: " + reteFuente + "\n";
        mensaje += "RETE IVA FACTURA: " + reteIva + "\n";
        mensaje += "RETE ICA FACTURA: " + reteIca + "\n";
        mensaje += "************************************************************\n";
        System.out.println(mensaje);
    }
    
}
