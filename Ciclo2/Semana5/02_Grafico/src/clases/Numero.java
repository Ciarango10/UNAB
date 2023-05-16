package clases;

import interfaces.OperacionesBasicas;

public class Numero implements OperacionesBasicas {

    private Integer numero1;
    private Integer numero2;

    public Numero() {
    }

    public Integer getNumero1() {
        return numero1;
    }

    public void setNumero1(Integer numero1) {
        this.numero1 = numero1;
    }

    public Integer getNumero2() {
        return numero2;
    }

    public void setNumero2(Integer numero2) {
        this.numero2 = numero2;
    }

    @Override
    public Integer sumar() {
        return numero1 + numero2;
    }

    @Override
    public Integer restar() {
        return numero1 - numero2;
    }

    @Override
    public Integer multiplicar() {
        return numero1 * numero2;
    }

    @Override
    public Integer dividir() {
        return numero1 / numero2;
    }

    @Override
    public Integer modulo() {
        return numero1 % numero2;
    }

    public Integer calcularOperacion(String opcion) {
        Integer resultado = 0;

        switch (opcion) {
            case "SUMAR":
                resultado = sumar();
                break;

            case "RESTAR":
                resultado = restar();
                break;

            case "MULTIPLICAR":
                resultado = multiplicar();
                break;

            case "DIVIDIR":
                resultado = dividir();
                break;

            case "MODULO":
                resultado = modulo();
                break;
        }

        return resultado;
    }

}
