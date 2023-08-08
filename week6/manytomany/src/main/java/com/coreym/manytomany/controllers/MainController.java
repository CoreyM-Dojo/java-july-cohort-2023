package com.coreym.manytomany.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.coreym.manytomany.services.TrainerService;

@Controller
public class MainController {
	
	@Autowired
	private TrainerService tService;
	
	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("allTrainers", tService.all() );
		return "index.jsp";
	}
	
	

}
