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

import com.IdForIdeas.Inmobiliaria.models.Pais;
import com.IdForIdeas.Inmobiliaria.services.PaisService;

@RestController
@RequestMapping("/pais")
public class PaisController {
	@Autowired
	PaisService paisServ;
	
	@GetMapping
	public ResponseEntity<List<Pais>>getAllPaises(){
		return ResponseEntity.ok().body(paisServ.getAllPaises());
	}
	@GetMapping("/{id}")
	public ResponseEntity<Pais>getById(@PathVariable Long id){
		return ResponseEntity.ok().body(paisServ.getById(id));
	}
	
	@PostMapping("/create")
	public ResponseEntity<Pais>createPais(@RequestBody Pais pais){
		Pais newPais = paisServ.create(pais.getNombre());
		return ResponseEntity.status(HttpStatus.CREATED).body(pais);
	}
	
	@PostMapping("/{id}")
	public ResponseEntity<Pais>updatePais(@PathVariable Long id, @RequestBody Pais pais){
		Pais paisUPD = paisServ.updateName(id, pais.getNombre());
		return ResponseEntity.ok().body(pais);
	}

}
