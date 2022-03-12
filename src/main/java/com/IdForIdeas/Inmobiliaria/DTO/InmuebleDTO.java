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
	private String contrato;
	private String estado;
	private String ciudad;
	private String pais;
	
	public InmuebleDTO() {
	}
	public InmuebleDTO(String nombre, String descripcion, Integer ambientes, Double metrosCuadrados, Double precio,
			String contrato, String estado, String ciudad, String pais) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.ambientes = ambientes;
		this.metrosCuadrados = metrosCuadrados;
		this.precio = precio;
		this.contrato = contrato;
		this.estado = estado;
		this.ciudad = ciudad;
		this.pais = pais;
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
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	
	
}
