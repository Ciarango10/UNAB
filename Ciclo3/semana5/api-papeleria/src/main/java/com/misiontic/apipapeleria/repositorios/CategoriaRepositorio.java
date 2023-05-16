package com.misiontic.apipapeleria.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.misiontic.apipapeleria.entidades.Categoria;

@Repository
public interface CategoriaRepositorio extends JpaRepository<Categoria, Long> {
	
	@Query("SELECT c FROM Categoria c WHERE c.idCategoria = :id")
	public Categoria obtenerUno(Long id);

}
