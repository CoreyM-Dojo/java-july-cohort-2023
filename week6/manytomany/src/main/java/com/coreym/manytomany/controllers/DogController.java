package com.coreym.manytomany.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.coreym.manytomany.models.Dog;
import com.coreym.manytomany.services.DogService;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/dogs")
public class DogController {
	
	@Autowired
	private DogService service;
	
	@GetMapping("")
	public String dogForm(@ModelAttribute("dog") Dog dog) {
		return "createDog.jsp";
	}
	
	@PostMapping("")
	public String processDog(@Valid @ModelAttribute() Dog dog, BindingResult result) {
		
		if (result.hasErrors()) {
			return "createDog.jsp";
		}
		service.create(dog);
		return "redirect:/";
	}

}
