package com.IdForIdeas.Inmobiliaria.mappers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import com.IdForIdeas.Inmobiliaria.DTO.InmuebleDTO;
import com.IdForIdeas.Inmobiliaria.models.Inmueble;
import com.IdForIdeas.Inmobiliaria.services.CiudadService;
import com.IdForIdeas.Inmobiliaria.services.FotoService;

@Component
public class InmuebleMapper {
	@Autowired
	FotoService fotoServ;
	
	public Inmueble DTO2Entity(InmuebleDTO dto) {
		Inmueble inmueble = new Inmueble();
		inmueble.setNombre(dto.getNombre());
		inmueble.setDescripcion(dto.getDescripcion());
		inmueble.setDireccion(dto.getDireccion());
		inmueble.setPrecio(dto.getPrecio());
		inmueble.setMetrosCuadrados(dto.getMetrosCuadrados());
		inmueble.setAmbientes(dto.getAmbientes());
		inmueble.setCiudad(dto.getCiudad());
		inmueble.setPais(dto.getPais());
		inmueble.setEstado(dto.getEstado());
		inmueble.setContrato(dto.getContrato());
		inmueble.setFoto(dto.getFoto());
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
