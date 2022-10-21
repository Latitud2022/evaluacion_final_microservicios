package com.bazrdslamdev.redsocialapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bazrdslamdev.redsocialapi.models.Megusta;
import com.bazrdslamdev.redsocialapi.repositories.IMegustaRepository;

@Service
public class MegustaService {

	@Autowired
	private IMegustaRepository iMegustaRepository;
	
	public Megusta saveMegusta(Megusta megusta) {
		return iMegustaRepository.save(megusta);
	}
	
	public List<Megusta> getAllMegustas(){
		return iMegustaRepository.findAll();
	}
}
