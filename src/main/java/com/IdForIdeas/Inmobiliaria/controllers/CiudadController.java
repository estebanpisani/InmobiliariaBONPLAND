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
import org.springframework.web.bind.annotation.RestController;

import com.IdForIdeas.Inmobiliaria.DTO.CiudadDTO;
import com.IdForIdeas.Inmobiliaria.services.CiudadService;

@RestController
@RequestMapping("/ciudad")
public class CiudadController {
@Autowired
CiudadService ciudadServ;

	@GetMapping
	public ResponseEntity<List<CiudadDTO>> getAll(){
		return ResponseEntity.ok().body(ciudadServ.getAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<CiudadDTO> getById(@PathVariable Long id){
		return ResponseEntity.ok().body(ciudadServ.getById(id));
	}

	@PostMapping("/create")
	public ResponseEntity<CiudadDTO> create(@RequestBody CiudadDTO dto){
		return ResponseEntity.status(HttpStatus.CREATED).body(ciudadServ.create(dto));
	}
	
	@PostMapping("/{id}")
	public ResponseEntity<CiudadDTO> update(@PathVariable Long id, @RequestBody CiudadDTO dto){
		return ResponseEntity.status(HttpStatus.CREATED).body(ciudadServ.updateName(dto, id));
	}
}
