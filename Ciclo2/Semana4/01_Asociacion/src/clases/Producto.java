package clases;

public class Producto {

    private int codProducto;
    private String nombreProducto;
    private double precioProducto;
    private int cantidadProducto;
    private Categoria miCategoria;

    public Producto() {
    }

    public int getCodProducto() {
        return codProducto;
    }

    public void setCodProducto(int codProducto) {
        this.codProducto = codProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public Categoria getMiCategoria() {
        return miCategoria;
    }

    public void setMiCategoria(Categoria miCategoria) {
        this.miCategoria = miCategoria;
    }

    @Override
    public String toString() {
        String mensaje;
        mensaje = "Codigo Producto: " + codProducto + "\n";
        mensaje += "Nombre Producto: " + nombreProducto + "\n";
        mensaje += "Precio Producto: " + precioProducto + "\n";
        mensaje += "Codigo Categoria: " + miCategoria.getCodCategoria() + "\n";
        mensaje += "Nombre Categoria: " + miCategoria.getNombreCategoria() + "\n";
        return mensaje;
    }

}
