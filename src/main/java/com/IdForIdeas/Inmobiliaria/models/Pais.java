package com.IdForIdeas.Inmobiliaria.models;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "paises")
public class Pais {
	@Id
	@GeneratedValue()
	private Long id;
	@Column(name = "pais_nombre")
	private String nombre;
	@OneToMany(mappedBy = "pais")
	private Set<Ciudad> ciudades;
	
	public Pais() {
		super();
	}

	public Pais(Long id, String nombre, Set<Ciudad> ciudades) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.ciudades = ciudades;
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

	public Set<Ciudad> getCiudades() {
		return ciudades;
	}

	public void setCiudades(Set<Ciudad> ciudades) {
		this.ciudades = ciudades;
	}
}
