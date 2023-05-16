
package clases;

import java.util.ArrayList;


public class Contador extends Perfil{

    public Contador() {
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
    
}
