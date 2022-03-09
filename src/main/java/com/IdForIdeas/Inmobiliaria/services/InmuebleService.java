package com.IdForIdeas.Inmobiliaria.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.IdForIdeas.Inmobiliaria.DTO.InmuebleDTO;
import com.IdForIdeas.Inmobiliaria.enums.Contrato;
import com.IdForIdeas.Inmobiliaria.enums.EstadoInmueble;
import com.IdForIdeas.Inmobiliaria.mappers.InmuebleMapper;
import com.IdForIdeas.Inmobiliaria.models.Ciudad;
import com.IdForIdeas.Inmobiliaria.models.Inmueble;
import com.IdForIdeas.Inmobiliaria.repositories.InmuebleRepository;

@Service
public class InmuebleService {

	@Autowired
	InmuebleRepository inmuebleRepo;
	@Autowired
	InmuebleMapper mapper;
	
	/*
	 * Crea un nuevo inmueble.
	 */
	
	public InmuebleDTO create(InmuebleDTO dto) {
		Inmueble inmueble = mapper.DTO2Entity(dto);
		return mapper.Entity2DTO(inmuebleRepo.save(inmueble));
	}
	
	public Inmueble create(String nombre, String descripcion, String direccion, Integer ambientes, Double metrosCuadrados, Double precio, Contrato contrato, EstadoInmueble estado, Ciudad ciudad) {
		Inmueble inmueble = new Inmueble();
		inmueble.setNombre(nombre);
		inmueble.setDescripcion(descripcion);
		inmueble.setDireccion(direccion);
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
	
	public InmuebleDTO update(InmuebleDTO dto, Long id) {
		Inmueble inmueble = mapper.DTO2Entity(dto);
		inmueble.setId(id);
		return mapper.Entity2DTO(inmuebleRepo.save(inmueble));
	}
	
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
	
	/*
	 * Obtiene todos los inmuebles en la base de datos.
	 */
	public List<InmuebleDTO> getAll(){
		return mapper.EntityList2DTOList(inmuebleRepo.findAll());
	}
	/*
	 * Obtiene inmueble según su ID.
	 */
	
	public InmuebleDTO getById(Long id) {
		return mapper.Entity2DTO(inmuebleRepo.getById(id));
	}
	
	
}
