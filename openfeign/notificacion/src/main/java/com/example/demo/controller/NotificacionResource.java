package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.NotificacionService;

@RestController
@RequestMapping("/api")
public class NotificacionResource {
	
	@Autowired
	NotificacionService notificacionService;
	
	@GetMapping(path ="/notificacion/info")
	public String getNotificacionInfo() {
		return notificacionService.getNotificacionInfo();
	}

}
