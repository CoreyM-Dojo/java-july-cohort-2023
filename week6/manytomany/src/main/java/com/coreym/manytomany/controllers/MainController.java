package com.coreym.manytomany.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.coreym.manytomany.models.Owner;
import com.coreym.manytomany.services.OwnerService;
import com.coreym.manytomany.services.TrainerService;

@Controller
public class MainController {
	
	@Autowired
	private TrainerService tService;
	
	@Autowired
	private OwnerService service;
	
	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("allTrainers", tService.all() );
		return "index.jsp";
	}
	
	// Creates the relationship for our self join
	@GetMapping("/add-friend/{f1_id}/{f2_id}")
	public String addFriend(@PathVariable("f1_id") Long friend1_id, @PathVariable("f2_id") Long friend2_id) {
		Owner friend1 = service.find(friend1_id);
		Owner friend2 = service.find(friend2_id);
		service.addFriend(friend1, friend2);
		return "redirect:/";
	}
	
	

}
