package com.IdForIdeas.Inmobiliaria.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.IdForIdeas.Inmobiliaria.DTO.CiudadDTO;
import com.IdForIdeas.Inmobiliaria.mappers.CiudadMapper;
import com.IdForIdeas.Inmobiliaria.models.Ciudad;
import com.IdForIdeas.Inmobiliaria.models.Pais;
import com.IdForIdeas.Inmobiliaria.repositories.CiudadRepository;
import com.IdForIdeas.Inmobiliaria.repositories.PaisRepository;

@Service
public class CiudadService {
	@Autowired
	CiudadRepository ciudadRepo;
	@Autowired
	CiudadMapper ciudadMapper;
	
	/*
	 * Crea una nueva ciudad.
	 */
	public CiudadDTO create(CiudadDTO dto) {
		Ciudad ciudad = ciudadMapper.DTO2Entity(dto);
		return ciudadMapper.Entity2DTO(ciudadRepo.save(ciudad));
	}
	
	public Ciudad create(String nombre, String pais) {
		
		Ciudad ciudad = new Ciudad();
		ciudad.setNombre(nombre);
		
		return ciudadRepo.save(ciudad);
	}
	
	/*
	 * Edita el nombre de una ciudad existente.
	 */
	
	public CiudadDTO updateName(CiudadDTO dto, Long id) {
		Ciudad ciudad = ciudadRepo.getById(id);
		ciudad.setNombre(dto.getNombre());
		return ciudadMapper.Entity2DTO(ciudadRepo.save(ciudad));
	}

	public List<CiudadDTO> getAll(){
		return ciudadMapper.EntityList2DTOList(ciudadRepo.findAll());
	}

	public CiudadDTO getById(Long id) {
		return ciudadMapper.Entity2DTO(ciudadRepo.getById(id));
	}
	
	public Ciudad getByName(String nombre) {
		if(ciudadRepo.findByNombre(nombre).size()>0) {
			return ciudadRepo.findByNombre(nombre).get(0);
		}
		return null;
	}
	}
