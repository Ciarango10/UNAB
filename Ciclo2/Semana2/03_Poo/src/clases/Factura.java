package clases;

public class Factura {

    private Double subtotal;
    private Double iva;
    private Double reteFuente;
    private Double reteIva;
    private Double reteIca;

    public Factura() {
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }

    public Double getIva() {
        return iva;
    }

    public void setIva(Double iva) {
        this.iva = iva;
    }

    public double calcularReteFuente() {
        reteFuente = subtotal * 3.5 / 100;
        return reteFuente;
    }

    public double calcularReteIva() {
        reteIva = iva * 15 / 100;
        return reteIva;
    }

    public double calcularReteIca() {
        reteIca = subtotal * 5 / 1000;
        return reteIca;
    }

    public void imprimirValores() {
        String mensaje;
        mensaje = "************************************************************\n";
        mensaje += "DETALLE DE LAS RETENCIONES DE LA FACTURA\n";
        mensaje += "************************************************************\n";
        mensaje += "SUBTOTAL FACTURA: " + subtotal + "\n";
        mensaje += "IVA FACTURA: " + iva + "\n";
        mensaje += "RETE FUENTE FACTURA: " + reteFuente + "\n";
        mensaje += "RETE IVA FACTURA: " + reteIva + "\n";
        mensaje += "RETE ICA FACTURA: " + reteIca + "\n";
        mensaje += "************************************************************\n";
        System.out.println(mensaje);
    }

}
