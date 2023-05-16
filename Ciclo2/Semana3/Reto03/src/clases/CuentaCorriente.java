package clases;

public class CuentaCorriente extends Cliente{
    
    private long numeroCuenta;
    private String fechaApertura;
    private double saldo;
    private double porcentajeInteres;
    private double valorSobregiro;

    public CuentaCorriente(long numeroCuenta, String fechaApertura, double saldo, double porcentajeInteres, double valorSobregiro) {
        this.numeroCuenta = numeroCuenta;
        this.fechaApertura = fechaApertura;
        this.saldo = saldo;
        this.porcentajeInteres = porcentajeInteres;
        this.valorSobregiro = valorSobregiro;
    }

    public CuentaCorriente(long numeroCuenta, String fechaApertura, double saldo, double porcentajeInteres, double valorSobregiro, long documentoIdentidad, String nombre, String correoElectronico, int numeroCelular, String direccion) {
        super(documentoIdentidad, nombre, correoElectronico, numeroCelular, direccion);
        this.numeroCuenta = numeroCuenta;
        this.fechaApertura = fechaApertura;
        this.saldo = saldo;
        this.porcentajeInteres = porcentajeInteres;
        this.valorSobregiro = valorSobregiro;
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

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getPorcentajeInteres() {
        return porcentajeInteres;
    }

    public void setPorcentajeInteres(double porcentajeInteres) {
        this.porcentajeInteres = porcentajeInteres;
    }

    public double getValorSobregiro() {
        return valorSobregiro;
    }

    public void setValorSobregiro(double valorSobregiro) {
        this.valorSobregiro = valorSobregiro;
    }
    
    public double calcular_interes(){
        double interes;
        interes = saldo * porcentajeInteres / 100;
        return interes;
    }
    
    
    

}
    

