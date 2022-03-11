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

import com.IdForIdeas.Inmobiliaria.DTO.CiudadDTO;
import com.IdForIdeas.Inmobiliaria.DTO.InmuebleDTO;
import com.IdForIdeas.Inmobiliaria.enums.Contrato;
import com.IdForIdeas.Inmobiliaria.services.CiudadService;
import com.IdForIdeas.Inmobiliaria.services.InmuebleService;

@RestController
@RequestMapping("/inmueble")
public class InmuebleController {
	@Autowired
	InmuebleService inmuebleServ;
	/*
		@GetMapping
		public ResponseEntity<List<InmuebleDTO>> getAll(){
			return ResponseEntity.ok().body(inmuebleServ.getAll());
		}
		*/
		@GetMapping("/{id}")
		public ResponseEntity<InmuebleDTO> getById(@PathVariable Long id){
			return ResponseEntity.ok().body(inmuebleServ.getById(id));
		}

		@PostMapping("/create")
		public ResponseEntity<InmuebleDTO> create(@RequestBody InmuebleDTO dto){
			return ResponseEntity.status(HttpStatus.CREATED).body(inmuebleServ.create(dto));
		}
		
		@PostMapping("/{id}")
		public ResponseEntity<InmuebleDTO> update(@PathVariable Long id, @RequestBody InmuebleDTO dto){
			return ResponseEntity.status(HttpStatus.CREATED).body(inmuebleServ.update(dto, id));
		}
	
		@GetMapping
		public ResponseEntity<List<InmuebleDTO>> getDetailsByFilter(
				@RequestParam(required = false) String nombre,
				@RequestParam(required = false) Integer ambientes,
				@RequestParam(required = false) String contrato,
				@RequestParam(required = false) String ciudad
				){
			List<InmuebleDTO> results = inmuebleServ.getByFilters(nombre, ambientes, contrato, ciudad);
			return ResponseEntity.ok(results);
		}		

}
