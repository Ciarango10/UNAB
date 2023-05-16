package com.misiontic.apipapeleria.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.misiontic.apipapeleria.entidades.Producto;
import com.misiontic.apipapeleria.servicios.ProductoServicio;

@RestController
@RequestMapping("/productos")
@CrossOrigin(origins = "*")
public class ProductoControlador {
	
	@Autowired
	private ProductoServicio proServicio;
	
	@ResponseStatus(code = HttpStatus.CREATED)
	@RequestMapping(value = "/crear", method = RequestMethod.POST, consumes = "application/json")
	public Producto crearProducto(@RequestBody Producto objProducto) {
		proServicio.agregar(objProducto);
		return objProducto;
	}
	
	@ResponseStatus(code = HttpStatus.OK)
	@RequestMapping(value = "/todos", method = RequestMethod.GET)
	public List<Producto> obtenerProductos(){
		return proServicio.obtenerTodos();
	}
	
	@ResponseStatus(code = HttpStatus.OK, reason = "Producto eliminado correctamente.")
	@RequestMapping(value = "/borrar/{id}", method = RequestMethod.DELETE)
	public void borrarProducto(@PathVariable Long id) {
		proServicio.eliminar(id);
	}
	
	@ResponseStatus(code = HttpStatus.ACCEPTED, reason = "Producto actualizado correctamente.")
	@RequestMapping(value = "/actualizar", method = RequestMethod.PUT)
	public void actualizarProducto(@RequestBody Producto objProducto) {
		proServicio.actualizar(objProducto);
	}
	
	@ResponseStatus(code = HttpStatus.OK)
	@RequestMapping(value = "/uno/{id}", method = RequestMethod.GET)
	public Producto obtenerUno(@PathVariable Long id) {
		return proServicio.obtenerUno(id);
	}

}
