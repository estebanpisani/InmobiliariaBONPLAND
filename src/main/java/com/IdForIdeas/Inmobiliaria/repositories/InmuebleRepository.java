package com.IdForIdeas.Inmobiliaria.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.IdForIdeas.Inmobiliaria.models.Inmueble;

public interface InmuebleRepository extends JpaRepository<Inmueble, Long> {

}
