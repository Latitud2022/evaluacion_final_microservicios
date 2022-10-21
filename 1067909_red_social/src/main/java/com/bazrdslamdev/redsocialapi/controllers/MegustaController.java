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

import com.bazrdslamdev.redsocialapi.models.Megusta;
import com.bazrdslamdev.redsocialapi.services.CuentaService;
import com.bazrdslamdev.redsocialapi.services.MegustaService;

@RestController
@RequestMapping("/api/redsocialapi")
public class MegustaController {

	@Autowired
	private MegustaService megustaService;
	
	@Autowired
	private CuentaService cuentaService;
	
	@PostMapping("/megusta")
	public Megusta createMegusta(@Validated @RequestBody Megusta megusta) {
		return megustaService.saveMegusta(megusta);
	}
	
	@GetMapping("/megustas")
	public List<Megusta> readMegustas(){
		return megustaService.getAllMegustas();
	}
	
	@PutMapping("/megusta/{id}")
	public Megusta updateMegusta(@PathVariable String id, @Validated @RequestBody Megusta megusta) {
		return megustaService.saveMegusta(megusta);
	}
	
	@DeleteMapping("/megusta/{id}")
	public void deleteMegusta(@PathVariable String id) {
		cuentaService.deleteCuenta(id);
	}
}
