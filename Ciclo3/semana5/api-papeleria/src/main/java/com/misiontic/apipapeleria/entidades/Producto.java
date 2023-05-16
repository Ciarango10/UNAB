package com.misiontic.apipapeleria.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "productos")
public class Producto implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_producto", nullable = false)
	private Long idProducto;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_catergoria", nullable = false, updatable = true, referencedColumnName = "id_catergoria")
	private Categoria idCategoria;

	@Column(name = "nombre_producto", nullable = false, length = 150)
	private String nombreProducto;

	@Column(name = "referencia_producto", nullable = false, length = 20)
	private String referenciaProducto;

	@Column(name = "preciocosto_poducto", nullable = false, precision = 12, scale = 2)
	private Double precioCostoProducto;

	@Column(name = "precioventa_producto", nullable = false, precision = 12, scale = 2)
	private Double precioVentaProducto;

	@Column(name = "cantidad_producto", nullable = false)
	private Integer cantidadProducto;

	public Producto() {
	}

	public Long getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Long idProducto) {
		this.idProducto = idProducto;
	}

	public Categoria getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(Categoria idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public String getReferenciaProducto() {
		return referenciaProducto;
	}

	public void setReferenciaProducto(String referenciaProducto) {
		this.referenciaProducto = referenciaProducto;
	}

	public Double getPrecioCostoProducto() {
		return precioCostoProducto;
	}

	public void setPrecioCostoProducto(Double precioCostoProducto) {
		this.precioCostoProducto = precioCostoProducto;
	}

	public Double getPrecioVentaProducto() {
		return precioVentaProducto;
	}

	public void setPrecioVentaProducto(Double precioVentaProducto) {
		this.precioVentaProducto = precioVentaProducto;
	}

	public Integer getCantidadProducto() {
		return cantidadProducto;
	}

	public void setCantidadProducto(Integer cantidadProducto) {
		this.cantidadProducto = cantidadProducto;
	}

}
