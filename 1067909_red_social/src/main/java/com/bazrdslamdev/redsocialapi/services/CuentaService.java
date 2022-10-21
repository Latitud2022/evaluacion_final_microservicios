package com.bazrdslamdev.redsocialapi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bazrdslamdev.redsocialapi.repositories.ICuentaRepository;

@Service
public class CuentaService {

	@Autowired
	private ICuentaRepository iCuentaRepository;
	
	public void deleteCuenta(String id) {
		iCuentaRepository.deleteById(id);
	}
}
