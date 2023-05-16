package modelos;

public class Producto {

    private long codProducto;
    private String nombre;
    private String id;
    private double temperatura;
    private double valorBase;

    public Producto() {
    }

    public long getCodProducto() {
        return codProducto;
    }

    public void setCodProducto(long codProducto) {
        this.codProducto = codProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public double getValorBase() {
        return valorBase;
    }

    public void setValorBase(double valorBase) {
        this.valorBase = valorBase;
    }

}
