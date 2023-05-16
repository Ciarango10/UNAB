package clases;

public class Perfil {
    protected int codPerfil;
    protected String nombrePerfil;

    public Perfil() {
    }

    public Perfil(int codPerfil, String nombrePerfil) {
        this.codPerfil = codPerfil;
        this.nombrePerfil = nombrePerfil;
    }

    public int getCodPerfil() {
        return codPerfil;
    }

    public void setCodPerfil(int codPerfil) {
        this.codPerfil = codPerfil;
    }

    public String getNombrePerfil() {
        return nombrePerfil;
    }

    public void setNombrePerfil(String nombrePerfil) {
        this.nombrePerfil = nombrePerfil;
    }
    
    public String mostrarPermisos(){
        String permisos;
        permisos = "CREAR, EDITAR, ELIMINAR, CONSULTAR";
        return permisos;
    }
    
    
}
