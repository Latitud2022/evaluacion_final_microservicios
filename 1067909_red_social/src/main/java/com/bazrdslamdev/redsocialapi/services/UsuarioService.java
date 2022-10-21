package com.bazrdslamdev.redsocialapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bazrdslamdev.redsocialapi.models.Usuario;
import com.bazrdslamdev.redsocialapi.repositories.IUsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private IUsuarioRepository iUsuarioRepository;
	
	public Usuario saveUsuario(Usuario usuario) {
		return iUsuarioRepository.save(usuario);
	}
	
	public List<Usuario> getAllUsuarios(){
		return iUsuarioRepository.findAll();
	}

}
