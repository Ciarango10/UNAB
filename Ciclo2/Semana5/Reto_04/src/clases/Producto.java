package clases;

public abstract class Producto {
    protected double costo;
    protected double gananciaMostrador;
    protected double gananciaMinorista;
    protected double gananciaMayorista;
    public Producto() {
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public double getGananciaMostrador() {
        return gananciaMostrador;
    }

    public void setGananciaMostrador(double gananciaMostrador) {
        this.gananciaMostrador = gananciaMostrador;
    }

    public double getGananciaMinorista() {
        return gananciaMinorista;
    }

    public void setGananciaMinorista(double gananciaMinorista) {
        this.gananciaMinorista = gananciaMinorista;
    }

    public double getGananciaMayorista() {
        return gananciaMayorista;
    }

    public void setGananciaMayorista(double gananciaMayorista) {
        this.gananciaMayorista = gananciaMayorista;
    }
    
    public Producto(double costo, double gananciaMostrador, double gananciaMinorista, double gananciaMayorista) {
        this.costo = costo;
        this.gananciaMostrador = gananciaMostrador;
        this.gananciaMinorista = gananciaMinorista;
        this.gananciaMayorista = gananciaMayorista;
    }
    

   
    
}
