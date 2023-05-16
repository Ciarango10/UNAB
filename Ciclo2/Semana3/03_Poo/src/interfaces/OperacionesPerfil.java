package interfaces;

public interface OperacionesPerfil {

    public abstract void agregarPermiso(String nuevoPermiso);

    public abstract void eliminarPermiso(String nombrePermiso);

    public abstract void imprimirPermisos();

    public abstract Integer buscarPosicion(String nombrePermiso);

}
