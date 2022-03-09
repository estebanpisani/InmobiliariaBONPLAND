package com.IdForIdeas.Inmobiliaria.mappers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.IdForIdeas.Inmobiliaria.DTO.PaisDTO;
import com.IdForIdeas.Inmobiliaria.models.Pais;

@Component
public class PaisMapper {
	
	public Pais DTO2Entity(PaisDTO dto) {
		Pais pais = new Pais();
		pais.setNombre(dto.getNombre());
		return pais;
	}
	
	public PaisDTO Entity2DTO(Pais pais) {
		PaisDTO dto = new PaisDTO();
		dto.setNombre(pais.getNombre());
		return dto;
	}
	
	public List<PaisDTO> EntityList2DTOList(List<Pais> paises){
		List<PaisDTO> dtos = new ArrayList<>();
		for (Pais pais : paises) {
			dtos.add(this.Entity2DTO(pais));
		}
		return dtos;
	}
	
	public List<Pais> DTOList2EntityList(List<PaisDTO> dtos){
		List<Pais> paises = new ArrayList<>();
		for (PaisDTO dto : dtos) {
			paises.add(DTO2Entity(dto));
		}
		return paises;
	}
	
}
