package clases;

public class AuxiliarContable extends Perfil {

    public AuxiliarContable(int codPerfil, String nombrePerfil) {
        super(codPerfil, nombrePerfil);
    }

    @Override
    public String mostrarPermisos() {
        String permisos;
        permisos = "EDITAR, REPORTES";
        return permisos;
    }
    
    @Override
    public String toString() {
        return "Contador{" + codPerfil + "," + nombrePerfil + '}';
    }

}
