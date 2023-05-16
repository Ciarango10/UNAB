
package clases;

import interfaces.precios;


public class ListaMayorista extends Producto implements precios{

    public ListaMayorista() {
        super();
    }

    @Override
    public double calcularPrecioVenta() {
       
        double valorGanancia;
        double precioVenta;
        valorGanancia = costo * gananciaMayorista / 100;
        precioVenta = costo + valorGanancia;
        return precioVenta;
    }
    
}
