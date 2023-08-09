package com.coreym.manytomany.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.coreym.manytomany.models.Dog;
import com.coreym.manytomany.models.Trainer;
import com.coreym.manytomany.services.DogService;
import com.coreym.manytomany.services.TrainerService;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/trainers")
public class TrainerController {

	@Autowired 
	private TrainerService service;
	
	@Autowired
	private DogService dogs;
	
	
	@GetMapping("")
	public String trainerForm(@ModelAttribute("trainer") Trainer trainer) {
		return "createTrainer.jsp";
	}
	
	@PostMapping("")
	public String process(@Valid @ModelAttribute("trainer") Trainer trainer, BindingResult result) {
		
		if (result.hasErrors()) {
			return "createTrainer.jsp";
		}
		
		service.create(trainer);
		
		return "redirect:/";
	}
	
	@GetMapping("/{id}")
	public String viewTrainer(@PathVariable("id") Long id, Model model) {
		Trainer selectedTrainer = service.find(id);
		model.addAttribute("trainer", selectedTrainer);
		model.addAttribute("unassignedDogs", dogs.unassigned(selectedTrainer) );
		return "trainer.jsp";
	}
	
	@PostMapping("/add-dog")
	public String addDog(@RequestParam("trainer") Long trainerId, @RequestParam("dog") Long dogId) {
		Trainer trainerChoice = service.find(trainerId);
		Dog dogChoice = dogs.find(dogId);
		service.addDog(trainerChoice, dogChoice);
		return "redirect:/trainers/" + trainerId;
	}
	
}
