package com.IdForIdeas.Inmobiliaria.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.IdForIdeas.Inmobiliaria.models.Ciudad;
import com.IdForIdeas.Inmobiliaria.models.Pais;
import com.IdForIdeas.Inmobiliaria.repositories.CiudadRepository;

@Service
public class CiudadService {
	@Autowired
	CiudadRepository ciudadRepo;
	
	/*
	 * Crea una nueva ciudad con los parámetros enviados.
	 */
	//TODO Create DTO
	
	public Ciudad create(String nombre, Pais pais) {
		Ciudad ciudad = new Ciudad();
		ciudad.setNombre(nombre);
		ciudad.setPais(pais);
		return ciudadRepo.save(ciudad);
	}
	
	/*
	 * Edita el nombre de una ciudad existente.
	 */
	//TODO UPDATE DTO
	
	public Ciudad updateName(String nombre, Long id) {
		Ciudad ciudad = ciudadRepo.getById(id);
		ciudad.setNombre(nombre);
		return ciudadRepo.save(ciudad);
	}

}
