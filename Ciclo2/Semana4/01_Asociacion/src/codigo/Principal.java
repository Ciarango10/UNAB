package codigo;

import clases.Categoria;
import clases.Producto;

public class Principal {
    
    public static void main(String[] args) {
        //****************************************************
        //definicion de variables
        //****************************************************
        Categoria categoria1, categoria2, categoria3;
        Producto producto1, producto2;
        //****************************************************
        //****************************************************
        //creacion de objetos
        //****************************************************
        categoria1 = new Categoria();
        categoria2 = new Categoria();
        categoria3 = new Categoria();
        
        producto1 = new Producto();
        producto2 = new Producto();
        //*****************************************************
        //*****************************************************
        //categorias
        //*****************************************************
        categoria1.setCodCategoria(1);
        categoria1.setNombreCategoria("Lacteos");
        
        categoria2.setCodCategoria(2);
        categoria2.setNombreCategoria("Aseo Personal");
        
        categoria3.setCodCategoria(3);
        categoria3.setNombreCategoria("Tecnologia");
        //*****************************************************
        //*****************************************************
        //productos
        //*****************************************************
        producto1.setCodProducto(1);
        producto1.setNombreProducto("Leche Entera");
        producto1.setPrecioProducto(2000);
        producto1.setCantidadProducto(10);
        producto1.setMiCategoria(categoria1);
        
        producto2.setCodProducto(2);
        producto2.setNombreProducto("Memoria Usb");
        producto2.setPrecioProducto(20000);
        producto2.setCantidadProducto(5);
        producto2.setMiCategoria(categoria3);
        //****************************************************
        System.out.println("El producto 1 es: \n" + producto1.toString());
        System.out.println("El producto 2 es: \n" + producto2.toString());
        
    }
    
}
