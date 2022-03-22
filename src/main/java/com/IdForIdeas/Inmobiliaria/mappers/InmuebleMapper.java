package com.IdForIdeas.Inmobiliaria.mappers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.IdForIdeas.Inmobiliaria.DTO.InmuebleDTO;
import com.IdForIdeas.Inmobiliaria.models.Inmueble;
import com.IdForIdeas.Inmobiliaria.services.FotoService;

@Component
public class InmuebleMapper {
	@Autowired
	FotoService fotoServ;
	
	public Inmueble DTO2Entity(InmuebleDTO dto) {
		Inmueble inmueble = new Inmueble();
		if (dto.getNombre()!=null) {
			inmueble.setNombre(dto.getNombre());
		}
		if(dto.getDescripcion()!=null) {
			inmueble.setDescripcion(dto.getDescripcion());			
		}
		if(dto.getDireccion()!=null) {
		inmueble.setDireccion(dto.getDireccion());
		}
		if(dto.getPrecio()!=null && dto.getPrecio()!=0) {
		inmueble.setPrecio(dto.getPrecio());
		}
		if(dto.getMetrosCuadrados()!=null && dto.getMetrosCuadrados()!=0.0) {
		inmueble.setMetrosCuadrados(dto.getMetrosCuadrados());
		}
		if(dto.getAmbientes()!=null && dto.getAmbientes()!=0) {
		inmueble.setAmbientes(dto.getAmbientes());
		}
		if (dto.getCiudad()!=null) {
		inmueble.setCiudad(dto.getCiudad());
		}
		if (dto.getPais()!=null) {
		inmueble.setPais(dto.getPais());
		}
		if (dto.getEstado()!=null) {
		inmueble.setEstado(dto.getEstado());
		}
		if (dto.getContrato()!=null) {
		inmueble.setContrato(dto.getContrato());
		}
		if (dto.getFoto()!=null) {
		inmueble.setFoto(dto.getFoto());
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
		dto.setPais(inmueble.getPais());
		dto.setContrato(inmueble.getContrato());
		dto.setEstado(inmueble.getEstado());
		dto.setCiudad(inmueble.getCiudad());
		dto.setFoto(inmueble.getFoto());
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
