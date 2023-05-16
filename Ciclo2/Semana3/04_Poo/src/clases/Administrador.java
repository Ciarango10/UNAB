package clases;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import interfaces.Borrado;
import interfaces.Seguridad;
import java.util.ArrayList;

public class Administrador extends Perfil implements Seguridad, Borrado{

    public Administrador() {
        super();
        arregloPermisos = new ArrayList<>();
    }

    @Override
    public void agregarPermiso(String nuevoPermiso) {
        arregloPermisos.add(nuevoPermiso);
    }

    @Override
    public void eliminarPermiso(String nombrePermiso) {
        arregloPermisos.remove(nombrePermiso);
    }

    @Override
    public boolean iniciarSesion() {
        logueado = true;
        return logueado;
    }

    @Override
    public boolean borrarPermisos() {
       arregloPermisos.clear();
       return true;
    }
    
}
