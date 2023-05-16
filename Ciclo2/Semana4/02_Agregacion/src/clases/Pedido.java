package clases;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private String cliente;
    private String numeroPedido;
    private List<Producto> arregloProductos;

    public Pedido() {
        arregloProductos = new ArrayList<>();
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(String numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public void agregarProductoPedido(Producto producto) {
        arregloProductos.add(producto);
    }

    @Override
    public String toString() {
        String mensaje;
        mensaje = "Los productos del pedido Nro: " + numeroPedido + " Son: \n";
        for (Producto objProducto : arregloProductos) {
            mensaje += "Codigo Producto: " + objProducto.getCodigo() + "\n";
            mensaje += "Nombre Producto: " + objProducto.getNombre() + "\n";
            mensaje += "Precio Producto: " + objProducto.getPrecio() + "\n";
        }
        return mensaje;
    }

}
