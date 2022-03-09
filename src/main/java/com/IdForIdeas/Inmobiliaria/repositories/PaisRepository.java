package com.IdForIdeas.Inmobiliaria.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.IdForIdeas.Inmobiliaria.models.Pais;

public interface PaisRepository extends JpaRepository<Pais,Long> {
	
	List<Pais> findByNombre(String nombre);
	

}
