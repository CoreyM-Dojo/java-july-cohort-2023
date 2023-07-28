package com.coreym.mvc1.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.coreym.mvc1.models.Fruit;
import com.coreym.mvc1.services.FruitService;

import jakarta.validation.Valid;

@Controller
public class MainController {
	
	@Autowired
	private FruitService service;
	

	@GetMapping("/")
	public String home(Model model) {
		ArrayList<Fruit> fruits = service.findAll();
		model.addAttribute("fruits",fruits);
		return "index.jsp";
	}
	
	@GetMapping("/fruits")
	public String createForm(@ModelAttribute("fruit") Fruit fruit) {
		return "create.jsp";
	}
	
	@PostMapping("/fruits")
	public String createFruit(@Valid @ModelAttribute("fruit") Fruit fruit, BindingResult result) {
		
		if (result.hasErrors()) {
			return "create.jsp";
		}
		service.create(fruit);
		return "redirect:/";
	}
	
	@GetMapping("/fruits/{id}")
	public String displayFruit(@PathVariable("id") Long id) {
		Fruit fruitToDisplay = service.find(id);
		return "display.jsp";
	}
	
}
