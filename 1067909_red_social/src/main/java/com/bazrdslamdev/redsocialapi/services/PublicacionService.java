package com.bazrdslamdev.redsocialapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bazrdslamdev.redsocialapi.models.Publicacion;
import com.bazrdslamdev.redsocialapi.repositories.IPublicacionRepository;

@Service
public class PublicacionService {
	
	@Autowired
	private IPublicacionRepository iPublicacionRepository;
	
	public Publicacion savePublicacion(Publicacion publicacion) {
		return iPublicacionRepository.save(publicacion);
	}
	
	public List<Publicacion> getAllPublicaciones(){
		return iPublicacionRepository.findAll();
	}
	
	public void deletePublicacion(Long id) {
		iPublicacionRepository.deleteById(id);
	}

}
