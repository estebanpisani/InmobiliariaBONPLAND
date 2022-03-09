package com.IdForIdeas.Inmobiliaria.DTO;

import com.IdForIdeas.Inmobiliaria.enums.Contrato;
import com.IdForIdeas.Inmobiliaria.enums.EstadoInmueble;

public class InmuebleDTO {
	private String nombre;
	private String descripcion;
	private String direccion;
	private Integer ambientes;
	private Double metrosCuadrados;
	private Double precio;
	private Contrato contrato;
	private EstadoInmueble estado;
	private String ciudad;
	public InmuebleDTO() {
	}
	public InmuebleDTO(String nombre, String descripcion, Integer ambientes, Double metrosCuadrados, Double precio,
			Contrato contrato, EstadoInmueble estado, String ciudad) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.ambientes = ambientes;
		this.metrosCuadrados = metrosCuadrados;
		this.precio = precio;
		this.contrato = contrato;
		this.estado = estado;
		this.ciudad = ciudad;
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
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
}
