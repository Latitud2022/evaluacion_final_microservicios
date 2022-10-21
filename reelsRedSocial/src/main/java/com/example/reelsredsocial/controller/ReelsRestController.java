package com.example.reelsredsocial.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.reelsredsocial.model.Reels;
import com.example.reelsredsocial.service.api.ReelsServiceAPI;

@RestController
@RequestMapping(value = "/api/v1/")
@CrossOrigin("*")
public class ReelsRestController {

	@Autowired
	private ReelsServiceAPI reelsServiceAPI;

	@GetMapping(value = "/all")
	public List<Reels> getAll() {
		return reelsServiceAPI.getAll();
	}
	
	@GetMapping(value = "/find/{id}")
	public Reels find(@PathVariable Long id) {
		return reelsServiceAPI.get(id);
	}

	@PostMapping(value = "/save")
	public ResponseEntity<Reels> save(@RequestBody Reels reels) {
		Reels obj = reelsServiceAPI.save(reels);
		return new ResponseEntity<Reels>(obj, HttpStatus.OK);
	}

	@GetMapping(value = "/delete/{id}")
	public ResponseEntity<Reels> delete(@PathVariable Long id) {
		Reels reels = reelsServiceAPI.get(id);
		if (reels != null) {
			reelsServiceAPI.delete(id);
		}else {
			return new ResponseEntity<Reels>(HttpStatus.NO_CONTENT);
		}
		
		return new ResponseEntity<Reels>(reels, HttpStatus.OK);
	}

}
