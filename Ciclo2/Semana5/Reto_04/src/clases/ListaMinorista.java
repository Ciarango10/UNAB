package clases;

import interfaces.precios;


public class ListaMinorista extends Producto implements precios{
     
    public ListaMinorista() {
        super();
    }

    @Override
    public double calcularPrecioVenta() {
        double valorGanancia;
        double precioVenta;
        valorGanancia = costo * gananciaMinorista / 100;
        precioVenta = costo + valorGanancia;
        return precioVenta;
    }
    
}
