package com.IdForIdeas.Inmobiliaria.mappers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.IdForIdeas.Inmobiliaria.DTO.InmuebleDTO;
import com.IdForIdeas.Inmobiliaria.models.Inmueble;
import com.IdForIdeas.Inmobiliaria.services.CiudadService;

@Component
public class InmuebleMapper {
	@Autowired
	CiudadService ciudadServ;
	
	public Inmueble DTO2Entity(InmuebleDTO dto) {
		Inmueble inmueble = new Inmueble();
		inmueble.setNombre(dto.getNombre());
		inmueble.setDescripcion(dto.getDescripcion());
		inmueble.setDireccion(dto.getDireccion());
		inmueble.setPrecio(dto.getPrecio());
		inmueble.setMetrosCuadrados(dto.getMetrosCuadrados());
		inmueble.setAmbientes(dto.getAmbientes());
		
		inmueble.setEstado(dto.getEstado());
		inmueble.setContrato(dto.getContrato());
		
		if(dto.getCiudad()!=null && !dto.getCiudad().isEmpty()){
			if(ciudadServ.getByName(dto.getCiudad())!=null){
				inmueble.setCiudad(ciudadServ.getByName(dto.getCiudad()));
			}
		}
		return inmueble;
	}
	
	public InmuebleDTO Entity2DTO(Inmueble inmueble) {
		InmuebleDTO dto = new InmuebleDTO();
		dto.setNombre(inmueble.getNombre());
		dto.setDescripcion(inmueble.getDescripcion());
		dto.setDireccion(inmueble.getDireccion());
		dto.setAmbientes(inmueble.getAmbientes());
		dto.setMetrosCuadrados(inmueble.getMetrosCuadrados());
		dto.setPrecio(inmueble.getPrecio());
		
		dto.setContrato(inmueble.getContrato());
		dto.setEstado(inmueble.getEstado());
		
		dto.setCiudad(inmueble.getCiudad().getNombre());
		
		return dto;
	}
	public List<InmuebleDTO> EntityList2DTOList(List<Inmueble> inmuebles){
		List<InmuebleDTO> dtos = new ArrayList<>();
		for (Inmueble inmueble : inmuebles) {
			dtos.add(this.Entity2DTO(inmueble));
		}
		return dtos;
	}
	
	public List<Inmueble> DTOList2EntityList(List<InmuebleDTO> dtos){
		List<Inmueble> inmuebles = new ArrayList<>();
		for (InmuebleDTO dto : dtos) {
			inmuebles.add(DTO2Entity(dto));
		}
		return inmuebles;
	}
}
