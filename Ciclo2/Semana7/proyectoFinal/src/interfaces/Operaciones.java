package interfaces;

import java.util.List;

public interface Operaciones<T> {

    public abstract boolean agregar(T objeto);

    public abstract List<T> consultar();

    public abstract boolean borrar(T objeto);

    public abstract boolean actualizar(T objeto);

}
