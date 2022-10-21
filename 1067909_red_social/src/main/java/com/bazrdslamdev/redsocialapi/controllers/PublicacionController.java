package com.bazrdslamdev.redsocialapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bazrdslamdev.redsocialapi.models.Publicacion;
import com.bazrdslamdev.redsocialapi.services.PublicacionService;

@RestController
@RequestMapping("/api/redsocialapi")
public class PublicacionController {
	
	@Autowired
	private PublicacionService publicacionService;
	
	@PostMapping("/publicacion")
	public Publicacion createPublicacion(@Validated @RequestBody Publicacion publicacion) {
		return publicacionService.savePublicacion(publicacion);
	}
	
	@GetMapping("/publicaciones")
	public List<Publicacion> readPublicaciones(){
		return publicacionService.getAllPublicaciones();
	}
	
	@PutMapping("/publicacion/{id}")
	public Publicacion updatePublicacion(@PathVariable String id, @Validated @RequestBody Publicacion publicacion) {
		return publicacionService.savePublicacion(publicacion);
	}
	
	@DeleteMapping("/publicacion/{id}")
	public void deletePublicacion(@PathVariable Long id) {
		publicacionService.deletePublicacion(id);
	}

}
