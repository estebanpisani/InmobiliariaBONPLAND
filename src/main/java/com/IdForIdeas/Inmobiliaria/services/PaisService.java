package com.IdForIdeas.Inmobiliaria.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.IdForIdeas.Inmobiliaria.models.Pais;
import com.IdForIdeas.Inmobiliaria.repositories.PaisRepository;

@Service
public class PaisService {

	@Autowired
	PaisRepository paisRepo;
	
	//TODO CREATE with DTO
	/*
	 * Crea un nuevo país con los datos que llegan como parámetro.
	 */
	public Pais create(String nombre) {		
		Pais pais = new Pais();
		pais.setNombre(nombre);
		return paisRepo.save(pais);
	}
	
	//TODO UPDATE DTO
	/*
	 * Edita el nombre del país
	 */
	public Pais updateName(Long id, String nombre) {		
		Pais pais = paisRepo.getById(id);
		pais.setNombre(nombre);
		return paisRepo.save(pais);
	}
	
	
	
	
	
	
	//TODO DELETE
	//TODO READS
	public List<Pais> getAllPaises(){
		return paisRepo.findAll();
	}
	
	public Pais getById(Long id) {
		return paisRepo.getById(id);
	}
	
	public Pais getByName(String nombre) {
		if(paisRepo.findByNombre(nombre).size()>0) {
		return paisRepo.findByNombre(nombre).get(0);}
		return null;
		
	}
}
