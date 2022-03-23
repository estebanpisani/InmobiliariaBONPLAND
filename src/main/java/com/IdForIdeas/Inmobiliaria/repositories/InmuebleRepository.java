package com.IdForIdeas.Inmobiliaria.repositories;

import java.util.List;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.IdForIdeas.Inmobiliaria.models.Inmueble;

public interface InmuebleRepository extends JpaRepository<Inmueble, Long>, JpaSpecificationExecutor<Inmueble> {
	List<Inmueble> findAll(Specification<Inmueble> spec);
}
