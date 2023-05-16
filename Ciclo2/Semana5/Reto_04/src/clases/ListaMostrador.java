
package clases;

import interfaces.precios;


public class ListaMostrador extends Producto implements precios {
     
    public ListaMostrador() {
        super();
    }

    @Override
    public double calcularPrecioVenta() {
        double valorGanancia;
        double precioVenta;
        valorGanancia = costo * gananciaMostrador / 100;
        precioVenta = costo + valorGanancia;
        return precioVenta;
    }
}
