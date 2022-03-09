package com.IdForIdeas.Inmobiliaria.models;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "ciudades")
public class Ciudad {
	@Id
	@GeneratedValue
	private Long id;
	@Column(name = "ciudad_nombre")
	private String nombre;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "pais_id", nullable = false)
	private Pais pais;
	@OneToMany(mappedBy = "ciudad", fetch = FetchType.LAZY)
	private Set<Inmueble> inmuebles;
	
	public Ciudad() {
	}

	public Ciudad(Long id, String nombre, Pais pais, Set<Inmueble> inmuebles) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.pais = pais;
		this.inmuebles = inmuebles;
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

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public Set<Inmueble> getInmuebles() {
		return inmuebles;
	}

	public void setInmuebles(Set<Inmueble> inmuebles) {
		this.inmuebles = inmuebles;
	}

}
