package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.remote.LeidasService;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@Service
public class NotificacionService {
	
	@Autowired
	private LeidasService leidasService;
	
	@CircuitBreaker(name = "breaker", fallbackMethod = "getNotificacionInfoFallback")
	public String getNotificacionInfo() {
		return leidasService.getLeidas();
	}
	
	public String getNotificacionInfoFallback(Exception ex) {
		return "From fallback";
	}
}
