package com.IdForIdeas.Inmobiliaria.filters;

public class InmuebleFiltersDTO {
	
	private String nombre;
	private Integer ambientesMin;
	private Integer ambientesMax;
	private String contrato;
	private String ciudad;
	private Double precioMin;
	private Double precioMax;
	
	public InmuebleFiltersDTO(String nombre, Integer ambientesMin, Integer ambientesMax, String contrato, String ciudad,
			Double precioMin, Double precioMax) {
		this.nombre = nombre;
		this.ambientesMin = ambientesMin;
		this.ambientesMax = ambientesMax;
		this.contrato = contrato;
		this.ciudad = ciudad;
		this.precioMin = precioMin;
		this.precioMax = precioMax;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getAmbientesMin() {
		return ambientesMin;
	}

	public void setAmbientesMin(Integer ambientesMin) {
		this.ambientesMin = ambientesMin;
	}

	public Integer getAmbientesMax() {
		return ambientesMax;
	}

	public void setAmbientesMax(Integer ambientesMax) {
		this.ambientesMax = ambientesMax;
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

	public Double getPrecioMin() {
		return precioMin;
	}

	public void setPrecioMin(Double precioMin) {
		this.precioMin = precioMin;
	}

	public Double getPrecioMax() {
		return precioMax;
	}

	public void setPrecioMax(Double precioMax) {
		this.precioMax = precioMax;
	}
}
