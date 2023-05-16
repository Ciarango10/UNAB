package clases;

import interfaces.OperacionesPerfil;
import java.util.ArrayList;
import java.util.List;

public class Perfil implements OperacionesPerfil {

    protected int codPerfil;
    protected String nombrePerfil;
    protected List<String> arregloPermisos;

    public Perfil() {
        arregloPermisos = new ArrayList<>();
    }

    public Perfil(int codPerfil, String nombrePerfil) {
        this.codPerfil = codPerfil;
        this.nombrePerfil = nombrePerfil;
        arregloPermisos = new ArrayList<>();
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

    public List<String> getArregloPermisos() {
        return arregloPermisos;
    }

    public void setArregloPermisos(List<String> arregloPermisos) {
        this.arregloPermisos = arregloPermisos;
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
    public void imprimirPermisos() {
        for (String permiso : arregloPermisos) {
            System.out.println("---->" + permiso);
        }
    }

    @Override
    public Integer buscarPosicion(String nombrePermiso) {
        for (int i = 0; i < arregloPermisos.size(); i++) {
            if (arregloPermisos.get(i).equals(nombrePermiso)) {
                return i;
            }
        }
        return null;
    }

}
