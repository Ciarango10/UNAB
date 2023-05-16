package codigo;

import clases.Pedido;
import clases.Producto;

public class Principal {

    public static void main(String[] args) {
        //**********************************************************
        //definicion de variables
        //**********************************************************
        Pedido pedido1;
        Producto producto1, producto2, producto3;
        //**********************************************************
        //**********************************************************
        //creacion de objetos
        //**********************************************************
        pedido1 = new Pedido();
        
        producto1 = new Producto();
        producto2 = new Producto();
        producto3 = new Producto();
        //***********************************************************
        //***********************************************************
        //pedido
        //***********************************************************
        pedido1.setCliente("JHON JAIRO");
        pedido1.setNumeroPedido("P0001");
        //***********************************************************
        //***********************************************************
        //productos
        //***********************************************************
        producto1.setCodigo(001);
        producto1.setNombre("memoria usb");
        producto1.setPrecio(20000);
        pedido1.agregarProductoPedido(producto1);
        
        producto2.setCodigo(002);
        producto2.setNombre("disco duro");
        producto2.setPrecio(200000);
        pedido1.agregarProductoPedido(producto2);
        
        producto3.setCodigo(003);
        producto3.setNombre("pantalla");
        producto3.setPrecio(600000);
        pedido1.agregarProductoPedido(producto3);
        //************************************************************
        System.out.println(pedido1.toString());
        
    }

}
