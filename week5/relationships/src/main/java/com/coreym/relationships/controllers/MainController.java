package com.coreym.relationships.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.coreym.relationships.models.Dog;
import com.coreym.relationships.models.Shelter;
import com.coreym.relationships.services.DogService;
import com.coreym.relationships.services.ShelterService;

@Controller
public class MainController {

	@Autowired
	private DogService dService;
	@Autowired
	private ShelterService sService;
	
	@GetMapping("/")
	public String home() {
		return "index.jsp";
	}
	
	@GetMapping("/shelters")
	public String createShelter(@ModelAttribute("shelterModel") Shelter shelterModel) {
		return "createShelter.jsp";
	}
	
	@PostMapping("/shelters")
	public String processDog(@ModelAttribute("shelterModel") Shelter shelterModel) {
		sService.create(shelterModel);
		return "redirect:/";
	}
	
	@GetMapping("/dogs")
	public String createDog(@ModelAttribute("dogModel") Dog dogModel, Model model) {
		model.addAttribute("allShelters", sService.all());
		return "createDog.jsp";
	}
	
	@PostMapping("/dogs")
	public String processDog(@ModelAttribute("dogModel") Dog dogModel) {
		dService.create(dogModel);
		return "redirect:/";
	}
}
