package clases;

public class Cuenta extends Cliente{
    
    private long numeroCuenta;
    private String fechaApertura;
    private int tipoCuenta;
    private double saldoCuenta;
    
    public Cuenta(long numeroCuenta, String fechaApertura, int tipoCuenta, double saldoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.fechaApertura = fechaApertura;
        this.tipoCuenta = tipoCuenta;
        this.saldoCuenta = saldoCuenta;
    }

    public Cuenta(long numeroCuenta, String fechaApertura, int tipoCuenta, double saldoCuenta, long documentoIdentidad, String nombre, String correoElectronico, int numeroCelular, String direccion) {
        super(documentoIdentidad, nombre, correoElectronico, numeroCelular, direccion);
        this.numeroCuenta = numeroCuenta;
        this.fechaApertura = fechaApertura;
        this.tipoCuenta = tipoCuenta;
        this.saldoCuenta = saldoCuenta;
    }
    
    public long getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(long numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(String fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public int getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(int tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public double getSaldoCuenta() {
        return saldoCuenta;
    }

    public void setSaldoCuenta(double saldoCuenta) {
        this.saldoCuenta = saldoCuenta;
    }
    
    public double calcular_interes(){
        double valorInteres = 0;
        switch (tipoCuenta) {
            case 1:
                valorInteres = saldoCuenta * 1.5 / 100;
                break;
            case 2:
                valorInteres = saldoCuenta * 1.7 / 100;
                break;
            case 3:
                valorInteres = saldoCuenta * 1.6 / 100;
                break;
            
        }
        return valorInteres;
    }
     
}