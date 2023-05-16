package clases;

public class Estudiante {

    private String nombre;
    private Double nota1;
    private Double nota2;
    private Double nota3;
    private Double definitiva;

    public Estudiante() {
        System.out.println("Objeto creado sin sobrecarga de datos");
    }

    public Estudiante(String nombre, Double nota1, Double nota2, Double nota3) {
        System.out.println("Objeto creado con sobrecarga de datos");
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getNota1() {
        return nota1;
    }

    public void setNota1(Double nota1) {
        this.nota1 = nota1;
    }

    public Double getNota2() {
        return nota2;
    }

    public void setNota2(Double nota2) {
        this.nota2 = nota2;
    }

    public Double getNota3() {
        return nota3;
    }

    public void setNota3(Double nota3) {
        this.nota3 = nota3;
    }
    
    public Double calcularDefinitiva() {
        Double notaFinal1, notaFinal2, notaFinal3;
        notaFinal1 = nota1 * 30 / 100;
        notaFinal2 = nota2 * 30 / 100;
        notaFinal3 = nota3 * 40 / 100;
        definitiva = notaFinal1 + notaFinal2 + notaFinal3;
        return definitiva;
    }

    public void imprimirMensaje() {
        String mensaje;
        mensaje = "******************************************************\n";
        mensaje += "RESUMEN DE NOTAS DEL ESTUDIANTE " + nombre + "\n";
        mensaje += "******************************************************\n";
        mensaje += "NOTA 1: " + nota1 + "\n";
        mensaje += "NOTA 2: " + nota2 + "\n";
        mensaje += "NOTA 3: " + nota3 + "\n";
        mensaje += "DEFINITIVA: " + definitiva + "\n";
        mensaje += "******************************************************\n";
        System.out.println(mensaje);
    }

}
