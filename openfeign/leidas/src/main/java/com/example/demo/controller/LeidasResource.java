package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RefreshScope
public class LeidasResource {
	
	@Value("${message:Hello default}")
	private String message;
	
	@GetMapping(path="/leidas")
	public String getLeidas() {
		return message;
	}

}
