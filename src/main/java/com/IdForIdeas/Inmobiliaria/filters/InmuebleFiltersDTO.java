package com.IdForIdeas.Inmobiliaria.filters;

import com.IdForIdeas.Inmobiliaria.enums.Contrato;

public class InmuebleFiltersDTO {
	
	private String nombre;
	private Integer ambientes;
	private String contrato;
	private String ciudad;
	
	public InmuebleFiltersDTO(String nombre, Integer ambientes, String contrato, String ciudad) {
		this.nombre = nombre;
		this.ambientes = ambientes;
		this.contrato = contrato;
		this.ciudad = ciudad;
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

	public String getContrato() {
		return contrato;
	}

	public void setContrato(String contrato) {
		this.contrato = contrato;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
}
