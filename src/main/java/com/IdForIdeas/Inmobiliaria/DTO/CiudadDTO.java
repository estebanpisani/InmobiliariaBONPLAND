package com.IdForIdeas.Inmobiliaria.DTO;

public class CiudadDTO {
	private String nombre;
	private String pais;
	public CiudadDTO() {
		super();
	}
	public CiudadDTO(String nombre, String pais) {
		super();
		this.nombre = nombre;
		this.pais = pais;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	
}
