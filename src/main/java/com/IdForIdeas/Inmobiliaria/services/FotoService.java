package com.IdForIdeas.Inmobiliaria.services;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class FotoService {
	
	public String saveFoto(MultipartFile file) {
		if (!file.isEmpty()) {

			//Path directorioImagenes = Paths.get("src//main//resources//static/images");
			String absolute = "D://Proyectos Web//IDforIdeas//inmobiliaria-recursos";
			try {
				byte[] byteImg = file.getBytes();
				Path rutaCompleta = Paths.get(absolute + "//"+file.getOriginalFilename());
				Files.write(rutaCompleta, byteImg);
				return file.getOriginalFilename();
			} catch (Exception e) {
				System.out.println(e.getMessage()); 
			}
			return file.getOriginalFilename();
		}
		return null;
	}

}
