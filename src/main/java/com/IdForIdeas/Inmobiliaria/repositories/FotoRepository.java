package com.IdForIdeas.Inmobiliaria.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.IdForIdeas.Inmobiliaria.models.Foto;

@Repository
public interface FotoRepository extends JpaRepository<Foto, String> {

}
