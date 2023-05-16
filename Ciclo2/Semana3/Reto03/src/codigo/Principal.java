package codigo;

import clases.Cuenta;
import clases.CuentaCorriente;

public class Principal {
    public static void main(String[] args) {
       Cuenta objCuenta = new Cuenta(123, "2022/08/09", 1, 100000);
       System.out.println("El valor de interes de la cuenta 1 es: " + objCuenta.calcular_interes());
       
       CuentaCorriente objCuentaCorriente = new CuentaCorriente(1542, "2022/08/09", 50000, 10, 20000);
       System.out.println("El valor de interes de la cuenta 2 es: " + objCuentaCorriente.calcular_interes());
    }
}
