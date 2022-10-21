package com.bazrdslamdev.redsocialapi.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HolaController {
	@RequestMapping("/")
	public String Hola() {
		return "Bienvenido a un micro demo del curso de microservicios (Evaluación final)";
	}
}