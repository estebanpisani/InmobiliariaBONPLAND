package com.IdForIdeas.Inmobiliaria.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.IdForIdeas.Inmobiliaria.DTO.CiudadDTO;
import com.IdForIdeas.Inmobiliaria.DTO.InmuebleDTO;
import com.IdForIdeas.Inmobiliaria.enums.Contrato;
import com.IdForIdeas.Inmobiliaria.services.CiudadService;
import com.IdForIdeas.Inmobiliaria.services.FotoService;
import com.IdForIdeas.Inmobiliaria.services.InmuebleService;

@RestController
@RequestMapping("/inmueble")
public class InmuebleController {
	@Autowired
	InmuebleService inmuebleServ;
	@Autowired
	FotoService fotoServ;

		@GetMapping("/catalog")
		public ResponseEntity<List<InmuebleDTO>> getAllByFilter(
				@RequestParam(required = false) String nombre,
				@RequestParam(required = false) Integer ambientesMin,
				@RequestParam(required = false) Integer ambientesMax,
				@RequestParam(required = false) String contrato,
				@RequestParam(required = false) String ciudad,
				@RequestParam(required = false) String pais,
				@RequestParam(required = false) Double precioMin,
				@RequestParam(required = false) Double precioMax,
				@RequestParam(required = false) String estado
				){
			List<InmuebleDTO> results = inmuebleServ.getAllByFilters(nombre, ambientesMin, ambientesMax, contrato, ciudad, pais, precioMin,precioMax, estado);
			return ResponseEntity.ok(results);	
		}

		@GetMapping("/{id}")
		public ResponseEntity<InmuebleDTO> getById(@PathVariable Long id){
			return ResponseEntity.ok().body(inmuebleServ.getById(id));
		}

		@PostMapping("/create")
		public ResponseEntity<InmuebleDTO> create(@RequestBody InmuebleDTO dto, @RequestParam(required = false) MultipartFile file){		
			if(file!=null) {
			dto.setFoto(fotoServ.saveFoto(file));}
			return ResponseEntity.status(HttpStatus.CREATED).body(inmuebleServ.create(dto));
		}
		
		@PostMapping("/{id}")
		public ResponseEntity<InmuebleDTO> update(@PathVariable Long id, @RequestBody InmuebleDTO dto, @RequestParam(required = false) MultipartFile file){
			if(file!=null) {
			dto.setFoto(fotoServ.saveFoto(file));}
			return ResponseEntity.status(HttpStatus.CREATED).body(inmuebleServ.update(dto, id));
		}
	
		@GetMapping
		public ResponseEntity<List<InmuebleDTO>> getEnabledByFilter(
				@RequestParam(required = false) String nombre,
				@RequestParam(required = false) Integer ambientesMin,
				@RequestParam(required = false) Integer ambientesMax,
				@RequestParam(required = false) String contrato,
				@RequestParam(required = false) String ciudad,
				@RequestParam(required = false) String pais,
				@RequestParam(required = false) Double precioMin,
				@RequestParam(required = false) Double precioMax
				){
			List<InmuebleDTO> results = inmuebleServ.getEnabledByFilters(nombre, ambientesMin, ambientesMax, contrato, ciudad, pais, precioMin,precioMax);
			return ResponseEntity.ok(results);
		}		

}
