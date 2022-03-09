package com.IdForIdeas.Inmobiliaria.mappers;

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

}
