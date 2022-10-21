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

import com.bazrdslamdev.redsocialapi.models.Usuario;
import com.bazrdslamdev.redsocialapi.services.CuentaService;
import com.bazrdslamdev.redsocialapi.services.UsuarioService;

@RestController
@RequestMapping("/api/redsocialapi")
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@Autowired
	private CuentaService cuentaService;
	
	@PostMapping("/usuario")
	public Usuario createUsuario(@Validated @RequestBody Usuario usuario) {
		return usuarioService.saveUsuario(usuario);
	}
	
	@GetMapping("/usuarios")
	public List<Usuario> readUsuarios(){
		return usuarioService.getAllUsuarios();
	}
	
	@PutMapping("/usuario/{id}")
	public Usuario updateUsuario(@PathVariable String id, @Validated @RequestBody Usuario usuario) {
		return usuarioService.saveUsuario(usuario);
	}
	
	@DeleteMapping("/usuario/{id}")
	public void deleteUsuario(@PathVariable String id) {
		cuentaService.deleteCuenta(id);
	}

}
