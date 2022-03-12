package com.IdForIdeas.Inmobiliaria.DTO;

public class InmuebleBasicDTO {
	private String nombre;
	private String direccion;
	private Integer ambientes;
	private Double precio;
	private String ciudad;
	private String pais;
	
	public InmuebleBasicDTO() {
	}
	public InmuebleBasicDTO(String nombre, Integer ambientes, Double precio, String ciudad, String pais) {
		this.nombre = nombre;
		this.ambientes = ambientes;
		this.precio = precio;
		this.ciudad = ciudad;
		this.pais = pais;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getAmbientes() {
		return ambientes;
	}
	public void setAmbientes(Integer ambientes) {
		this.ambientes = ambientes;
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
