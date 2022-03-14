package com.IdForIdeas.Inmobiliaria.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.IdForIdeas.Inmobiliaria.models.Foto;
import com.IdForIdeas.Inmobiliaria.repositories.FotoRepository;

@Service
public class FotoService {
	@Autowired
	FotoRepository fotoRepo;
	
	public Foto save(MultipartFile file) {
		if (file!=null) {
			try {
			Foto foto = new Foto();
			foto.setMime(file.getContentType());
			foto.setName(file.getName());
			foto.setContent(file.getBytes());
			return fotoRepo.save(foto);}
			catch(Exception e){
				System.err.println(e.getMessage());
			}
		}
		return null;
	}
	
	//TODO update?
	
	public void deleteFoto(String id) {
		try {
			Foto foto = fotoRepo.getById(id);
			fotoRepo.delete(foto);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
}
