package com.misiontic.apipapeleria.servicios;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.misiontic.apipapeleria.entidades.Categoria;
import com.misiontic.apipapeleria.interfaces.Operaciones;
import com.misiontic.apipapeleria.repositorios.CategoriaRepositorio;

@Service
public class CategoriaServicio implements Operaciones<Categoria> {
	
	@Autowired
	private CategoriaRepositorio cateRepo;

	@Override
	public boolean agregar(Categoria objeto) {
		Categoria objTemporal = cateRepo.save(objeto);
		return objTemporal != null;
	}

	@Override
	public List<Categoria> obtenerTodos() {
		return cateRepo.findAll();
	}

	@Override
	public boolean eliminar(Long id) {
		cateRepo.deleteById(id);
		return !cateRepo.existsById(id);
	}

	@Override
	public boolean actualizar(Categoria objeto) {
		Optional<Categoria> objetoVerificado = cateRepo.findById(objeto.getIdCategoria());
		if (!objetoVerificado.isPresent()) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Categoria no existe.");
		}else {
			cateRepo.save(objeto);
			return true;
		}
	}

	@Override
	public Categoria obtenerUno(Long id) {
		return cateRepo.obtenerUno(id);
	}

}
