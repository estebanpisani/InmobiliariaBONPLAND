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
	private String direccion;
	private Integer ambientes;
	private Double metrosCuadrados;
	private Double precio;
	private String contrato;
	private String estado;
	private String ciudad;
	private String pais;
	/*
	@Enumerated(EnumType.STRING)
	private Contrato contrato;
	@Enumerated(EnumType.STRING)
	private EstadoInmueble estado;
	@ManyToOne
	@JoinColumn(name = "ciudad_id", nullable = false)
	private Ciudad ciudad;
	*/

	public Inmueble() {
	}

	public Inmueble(Long id, String nombre, String descripcion, String direccion, Integer ambientes,
			Double metrosCuadrados, Double precio, String contrato, String estado, String ciudad) {
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.direccion = direccion;
		this.ambientes = ambientes;
		this.metrosCuadrados = metrosCuadrados;
		this.precio = precio;
		this.contrato = contrato;
		this.estado = estado;
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

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getContrato() {
		return contrato;
	}

	public void setContrato(String contrato) {
		this.contrato = contrato;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	@Override
	public String toString() {
		return "Inmueble [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", ambientes=" + ambientes
				+ ", metrosCuadrados=" + metrosCuadrados + ", precio=" + precio + ", ciudad=" + ciudad + "]";
	}

}
