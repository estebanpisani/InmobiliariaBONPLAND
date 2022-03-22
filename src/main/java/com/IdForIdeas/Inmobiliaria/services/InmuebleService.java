package com.IdForIdeas.Inmobiliaria.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.IdForIdeas.Inmobiliaria.DTO.InmuebleDTO;
import com.IdForIdeas.Inmobiliaria.filters.InmuebleFiltersDTO;
import com.IdForIdeas.Inmobiliaria.mappers.InmuebleMapper;
import com.IdForIdeas.Inmobiliaria.models.Inmueble;
import com.IdForIdeas.Inmobiliaria.repositories.InmuebleRepository;
import com.IdForIdeas.Inmobiliaria.repositories.specifications.InmuebleSpecification;

@Service
public class InmuebleService {

	@Autowired
	InmuebleRepository inmuebleRepo;
	@Autowired
	InmuebleMapper mapper;
	@Autowired
	InmuebleSpecification inmuebleSpecification;
	/*
	 * Crea un nuevo inmueble.
	 */
	
	public InmuebleDTO create(InmuebleDTO dto) {
		Inmueble inmueble = mapper.DTO2Entity(dto);
		return mapper.Entity2DTO(inmuebleRepo.save(inmueble));
	}
	
	public Inmueble create(String nombre, String descripcion, String direccion, Integer ambientes, Double metrosCuadrados, Double precio, String contrato, String estado, String ciudad, String pais, String foto) {
		Inmueble inmueble = new Inmueble();
		inmueble.setNombre(nombre);
		inmueble.setDescripcion(descripcion);
		inmueble.setDireccion(direccion);
		inmueble.setAmbientes(ambientes);
		inmueble.setMetrosCuadrados(metrosCuadrados);
		inmueble.setPrecio(precio);
		inmueble.setCiudad(ciudad);
		inmueble.setPais(pais);
		inmueble.setContrato(contrato);
		inmueble.setEstado(estado);
		inmueble.setFoto(foto);
		return inmuebleRepo.save(inmueble);
	}
	/*
	 * Edita un inmueble existente.
	 */
	
	public InmuebleDTO update(InmuebleDTO dto, Long id) {
		Inmueble inmueble = inmuebleRepo.getById(id);
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
		/*
		Inmueble inmueble = mapper.DTO2Entity(dto);
		
		inmueble.setId(id);
		*/
		return mapper.Entity2DTO(inmuebleRepo.save(inmueble));
	}
	
	public Inmueble update(Long id, String nombre, String descripcion, Integer ambientes, Double metrosCuadrados, Double precio, String contrato, String estado, String ciudad, String pais) {
		Inmueble inmueble = inmuebleRepo.getById(id);
		inmueble.setNombre(nombre);
		inmueble.setDescripcion(descripcion);
		inmueble.setAmbientes(ambientes);
		inmueble.setMetrosCuadrados(metrosCuadrados);
		inmueble.setPrecio(precio);
		inmueble.setCiudad(ciudad);
		inmueble.setPais(pais);
		inmueble.setContrato(contrato);
		inmueble.setEstado(estado);
		return inmuebleRepo.save(inmueble);
	}
	
	/*
	 * Obtiene todos los inmuebles en la base de datos.
	 */
	public List <InmuebleDTO> getAllByFilters(String nombre, Integer ambientesMin, Integer ambientesMax, String contrato, String ciudad, String pais, Double precioMin, Double precioMax, String estado) {
		InmuebleFiltersDTO filtersDTO = new InmuebleFiltersDTO(nombre, ambientesMin, ambientesMax, contrato, ciudad, pais, precioMin, precioMax, estado);
		List<Inmueble> entidades = inmuebleRepo.findAll(inmuebleSpecification.getAllByFilters(filtersDTO));
		return mapper.EntityList2DTOList(entidades);
	}
	/*
	 * Obtiene inmueble según su ID.
	 */
	
	public InmuebleDTO getById(Long id) {
		return mapper.Entity2DTO(inmuebleRepo.getById(id));
	}
	
	public List <InmuebleDTO> getEnabledByFilters(String nombre, Integer ambientesMin, Integer ambientesMax, String contrato, String ciudad, String pais, Double precioMin, Double precioMax) {
		InmuebleFiltersDTO filtersDTO = new InmuebleFiltersDTO(nombre, ambientesMin, ambientesMax, contrato, ciudad, pais, precioMin, precioMax, "DISPONIBLE");
		List<Inmueble> entidades = inmuebleRepo.findAll(inmuebleSpecification.getEnabledByFilters(filtersDTO));
		return mapper.EntityList2DTOList(entidades);
	}
	
	
}
