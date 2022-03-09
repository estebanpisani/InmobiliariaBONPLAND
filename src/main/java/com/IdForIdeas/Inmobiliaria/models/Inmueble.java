package com.IdForIdeas.Inmobiliaria.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.IdForIdeas.Inmobiliaria.enums.Contrato;
import com.IdForIdeas.Inmobiliaria.enums.EstadoInmueble;

@Entity
@Table(name = "inmuebles")
public class Inmueble {
	@Id
	@GeneratedValue
	private Long id;
	@Column(name = "inmueble_nombre")
	private String nombre;
	private String descripcion;
	private Integer ambientes;
	private Double metrosCuadrados;
	private Double precio;
	@Enumerated(EnumType.STRING)
	private Contrato contrato;
	@Enumerated(EnumType.STRING)
	private EstadoInmueble estado;
	@ManyToOne
	@JoinColumn(name = "ciudad_id", nullable = false)
	private Ciudad ciudad;
	
	public Inmueble() {
	}

	public Inmueble(Long id, String nombre, String descripcion, Integer ambientes, Double metrosCuadrados,
			Double precio, Ciudad ciudad) {
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.ambientes = ambientes;
		this.metrosCuadrados = metrosCuadrados;
		this.precio = precio;
		this.ciudad = ciudad;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getAmbientes() {
		return ambientes;
	}

	public void setAmbientes(Integer ambientes) {
		this.ambientes = ambientes;
	}

	public Double getMetrosCuadrados() {
		return metrosCuadrados;
	}

	public void setMetrosCuadrados(Double metrosCuadrados) {
		this.metrosCuadrados = metrosCuadrados;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Ciudad getCiudad() {
		return ciudad;
	}

	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}

	public Contrato getContrato() {
		return contrato;
	}

	public void setContrato(Contrato contrato) {
		this.contrato = contrato;
	}

	public EstadoInmueble getEstado() {
		return estado;
	}

	public void setEstado(EstadoInmueble estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Inmueble [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", ambientes=" + ambientes
				+ ", metrosCuadrados=" + metrosCuadrados + ", precio=" + precio + ", ciudad=" + ciudad + "]";
	}
}
