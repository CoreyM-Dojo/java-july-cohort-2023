package com.coreym.mvc.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.coreym.mvc.models.Dog;
import com.coreym.mvc.services.DogService;

import jakarta.validation.Valid;

@Controller
public class MainController {
	
	private final DogService service;
	
	public MainController(DogService dService) {
		this.service = dService;
	}
	
	@GetMapping("/")
	public String home(Model model) {
		ArrayList<Dog> allDogs = service.findAll();
		model.addAttribute("allDogs",allDogs);
		return "index.jsp";
	}
	
	@GetMapping("/dogs")
	public String createForm(Model model, @ModelAttribute("dog-model") Dog dog) {
		String[] sizes = {"Small", "Medium", "Large"};
		model.addAttribute("sizes",sizes);
		return "create.jsp";
	}
	
	@PostMapping("/dogs")
	public String CreateDog(@Valid @ModelAttribute("dog-model")Dog dog, BindingResult result, Model model) {
		
		if (result.hasErrors()) {
			String[] sizes = {"Small", "Medium", "Large"};
			model.addAttribute("sizes", sizes);
			return "create.jsp";
		} else {
			service.createDog(dog);
			return "redirect:/";
		}
	}
	
	@GetMapping("/dogs/{id}")
	public String displayDog(Model model,@PathVariable("id") Long id) {
		Dog oneDog = service.find(id);
		model.addAttribute("dog",oneDog);
		
		return "display.jsp";
	}
	
	@GetMapping("/dogs/edit/{id}")
	public String editForm(@PathVariable("id") Long id, Model model) {
		
		Dog dog = service.find(id);
		model.addAttribute("dog-model", dog);
		String[] sizes = {"Small", "Medium", "Large"};
		model.addAttribute("sizes", sizes);
		return "edit.jsp";
	}
	@PutMapping("/dogs/update")
	public String updateDog(@Valid @ModelAttribute("dog-model") Dog dog, BindingResult result, Model model) {
		
		if (result.hasErrors()) {
			String[] sizes = {"Small", "Medium", "Large"};
			model.addAttribute("sizes", sizes);
			model.addAttribute("id", dog.getId());
			return "edit.jsp";
		} 
		service.update(dog);
		return "redirect:/dogs/" + dog.getId();
	}
	
	@DeleteMapping("/dogs/{id}")
	public String deleteDog(@PathVariable("id") Long id) {
		service.removeDog(id);
		return "redirect:/";
	}
	
}
