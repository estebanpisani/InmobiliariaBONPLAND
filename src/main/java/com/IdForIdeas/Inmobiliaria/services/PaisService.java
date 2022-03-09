package com.IdForIdeas.Inmobiliaria.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.IdForIdeas.Inmobiliaria.DTO.PaisDTO;
import com.IdForIdeas.Inmobiliaria.mappers.PaisMapper;
import com.IdForIdeas.Inmobiliaria.models.Pais;
import com.IdForIdeas.Inmobiliaria.repositories.PaisRepository;

@Service
public class PaisService {

	@Autowired
	PaisRepository paisRepo;
	@Autowired
	PaisMapper paisMapper;
	
	//TODO CREATE with DTO
	/*
	 * Crea un nuevo país con los datos que llegan como parámetro.
	 */
	public PaisDTO create(PaisDTO dto) {		
		Pais pais = paisMapper.DTO2Entity(dto);
		return paisMapper.Entity2DTO(paisRepo.save(pais));
	}
	public Pais create(String nombre) {		
		Pais newPais = new Pais();
		newPais.setNombre(nombre);
		return paisRepo.save(newPais);
	}
	//TODO UPDATE DTO
	/*
	 * Edita el nombre del país
	 */
	public PaisDTO updateName(Long id, PaisDTO dto) {		
		Pais pais = paisRepo.getById(id);
		pais.setNombre(dto.getNombre());
		return paisMapper.Entity2DTO(paisRepo.save(pais));
	}
	
	
	
	
	
	
	//TODO DELETE
	//TODO READS
	public List<PaisDTO> getAllPaises(){
		return paisMapper.EntityList2DTOList(paisRepo.findAll());
	}
	
	public PaisDTO getById(Long id) {
		return paisMapper.Entity2DTO(paisRepo.getById(id));
	}
	
	public Pais getByName(String nombre) {
		if(paisRepo.findByNombre(nombre).size()>0) {
		return paisRepo.findByNombre(nombre).get(0);
		}
		return null;
	}
}
