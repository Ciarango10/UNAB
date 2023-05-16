
package clases;

public class Contador extends Perfil{

    public Contador(int codPerfil, String nombrePerfil) {
        super(codPerfil, nombrePerfil);
    }

    @Override
    public String mostrarPermisos() {
        String permisos;
        permisos = "CONSULTAR, PAGAR";
        return permisos;
    }

    @Override
    public String toString() {
        return "Contador{" + codPerfil + "," + nombrePerfil + '}';
    }
    
}
