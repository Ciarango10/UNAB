package clases;

import java.util.List;

public abstract class Perfil {

    protected int codPerfil;
    protected String nombrePerfil;
    protected List<String> arregloPermisos;
    public boolean logueado;

    public Perfil() {
        logueado = false;
    }
    
    public abstract void agregarPermiso(String nuevoPermiso);
    
    public abstract void eliminarPermiso(String nombrePermiso);
    
    public void imprimirPermisos(){
        for(String permiso: arregloPermisos){
            System.out.println("------>" + permiso);
        }
    }
    
}
