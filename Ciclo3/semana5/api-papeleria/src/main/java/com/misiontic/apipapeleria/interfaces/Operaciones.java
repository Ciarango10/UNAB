package com.misiontic.apipapeleria.interfaces;

import java.util.List;

public interface Operaciones<T> {
	
	public abstract boolean agregar(T objeto);
	
	public abstract List<T> obtenerTodos();
	
	public abstract boolean eliminar(Long id);
	
	public abstract boolean actualizar(T objeto);
	
	public abstract T obtenerUno(Long id);
}
