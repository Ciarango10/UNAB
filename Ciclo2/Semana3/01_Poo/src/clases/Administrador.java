package clases;

public class Administrador extends Perfil{

    public Administrador(int codPerfil, String nombrePerfil) {
        super(codPerfil, nombrePerfil);
    }

    @Override
    public String toString() {
       return "Administrador{" + codPerfil + "," + nombrePerfil + "}";
    }

}
