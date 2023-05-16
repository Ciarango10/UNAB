package clases;

public class Factura {

    public static double calcularReteFuente(Double subtotal) {
        Double reteFuente;
        reteFuente = subtotal * 3.5 / 100;
        return reteFuente;
    }

    public static double calcularReteIva(Double iva) {
        Double reteIva;
        reteIva = iva * 15 / 100;
        return reteIva;
    }

    public static double calcularReteIca(Double subtotal) {
        Double reteIca;
        reteIca = subtotal * 5 / 1000;
        return reteIca;
    }

    public static void imprimirValores(Double subtotal, Double iva, Double reteFuente, Double reteIva, Double reteIca) {
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
