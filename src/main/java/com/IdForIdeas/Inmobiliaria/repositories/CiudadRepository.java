package com.IdForIdeas.Inmobiliaria.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.IdForIdeas.Inmobiliaria.models.Ciudad;

@Repository
public interface CiudadRepository extends JpaRepository<Ciudad, Long> {

}
