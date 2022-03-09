package com.IdForIdeas.Inmobiliaria.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.IdForIdeas.Inmobiliaria.DTO.InmuebleDTO;
import com.IdForIdeas.Inmobiliaria.enums.Contrato;
import com.IdForIdeas.Inmobiliaria.enums.EstadoInmueble;
import com.IdForIdeas.Inmobiliaria.models.Ciudad;
import com.IdForIdeas.Inmobiliaria.models.Inmueble;
import com.IdForIdeas.Inmobiliaria.repositories.InmuebleRepository;

@Service
public class InmuebleService {

	@Autowired
	InmuebleRepository inmuebleRepo;
	
	/*
	 * Crea un nuevo inmueble.
	 */
	
	public InmuebleDTO create(InmuebleDTO dto) {
		return dto;
	}
	
	public Inmueble create(String nombre, String descripcion, Integer ambientes, Double metrosCuadrados, Double precio, Contrato contrato, EstadoInmueble estado, Ciudad ciudad) {
		Inmueble inmueble = new Inmueble();
		inmueble.setNombre(nombre);
		inmueble.setDescripcion(descripcion);
		inmueble.setAmbientes(ambientes);
		inmueble.setMetrosCuadrados(metrosCuadrados);
		inmueble.setPrecio(precio);
		inmueble.setCiudad(ciudad);
		inmueble.setContrato(contrato);
		inmueble.setEstado(estado);
		return inmuebleRepo.save(inmueble);
	}
	/*
	 * Edita un inmueble existente.
	 */
	
	public Inmueble update(Long id, String nombre, String descripcion, Integer ambientes, Double metrosCuadrados, Double precio, Contrato contrato, EstadoInmueble estado, Ciudad ciudad) {
		Inmueble inmueble = inmuebleRepo.getById(id);
		inmueble.setNombre(nombre);
		inmueble.setDescripcion(descripcion);
		inmueble.setAmbientes(ambientes);
		inmueble.setMetrosCuadrados(metrosCuadrados);
		inmueble.setPrecio(precio);
		inmueble.setCiudad(ciudad);
		inmueble.setContrato(contrato);
		inmueble.setEstado(estado);
		return inmuebleRepo.save(inmueble);
	}
	
	
}
