package com.IdForIdeas.Inmobiliaria.mappers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.IdForIdeas.Inmobiliaria.DTO.CiudadDTO;
import com.IdForIdeas.Inmobiliaria.models.Ciudad;
import com.IdForIdeas.Inmobiliaria.models.Pais;
import com.IdForIdeas.Inmobiliaria.services.PaisService;

@Component
public class CiudadMapper {
	@Autowired
	PaisService paisServ;
	
	public Ciudad DTO2Entity(CiudadDTO dto) {
		Ciudad ciudad = new Ciudad();
		ciudad.setNombre(dto.getNombre());
		/*
		if(dto.getPais()!=null&&!dto.getPais().isEmpty()){
			if(paisServ.getByName(dto.getPais())!=null){
				ciudad.setPais(paisServ.getByName(dto.getPais()));
			}else {
				ciudad.setPais(paisServ.create(dto.getPais()));
			}
		}*/
		return ciudad;
	}
	
	public CiudadDTO Entity2DTO(Ciudad ciudad) {
		CiudadDTO dto = new CiudadDTO();
		dto.setNombre(ciudad.getNombre());/*
		dto.setPais(ciudad.getPais().getNombre());*/
		return dto;
	}
	
	public List<CiudadDTO> EntityList2DTOList(List<Ciudad> ciudades){
		List<CiudadDTO> dtos = new ArrayList<>();
		for (Ciudad ciudad : ciudades) {
			dtos.add(this.Entity2DTO(ciudad));
		}
		return dtos;
	}
	
	public List<Ciudad> DTOList2EntityList(List<CiudadDTO> dtos){
		List<Ciudad> ciudades = new ArrayList<>();
		for (CiudadDTO dto : dtos) {
			ciudades.add(DTO2Entity(dto));
		}
		return ciudades;
	}
	
}
