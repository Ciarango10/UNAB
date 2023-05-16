package clases;

public class Moto extends Vehiculo {

    private int cilindraje;

    public Moto(int cilindraje, String placa) {
        super(placa);
        this.cilindraje = cilindraje;
    }

    public int calcularImpuesto() {
        int impuesto;

        if (cilindraje > 150) {
            impuesto = 90000;
        } else {
            impuesto = 45000;
        }
        return impuesto;
    }

}
