package com.example.reelsredsocial.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.reelsredsocial.model.Reels;
import com.example.reelsredsocial.service.api.ReelsServiceAPI;

@Controller
public class ReelsController {
	
	@Autowired
	private ReelsServiceAPI reelsServiceAPI;
	
	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("list", reelsServiceAPI.getAll());
		return "index";
	}
	
	
	@GetMapping("/save/{id}")
	public String showSave(@PathVariable("id") Long id , Model model) {
		if(id != null && id != 0) {
			model.addAttribute("reels", reelsServiceAPI.get(id));
		}else {
			model.addAttribute("reels", new Reels());
		}
		return "save";
	}
	
	@PostMapping("/save")
	public String save(Reels reels, Model model) {
		reelsServiceAPI.save(reels);
		return "redirect:/";
	}
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable Long id, Model model) {
		reelsServiceAPI.delete(id);
		
		return "redirect:/";
	}
	
	

}
