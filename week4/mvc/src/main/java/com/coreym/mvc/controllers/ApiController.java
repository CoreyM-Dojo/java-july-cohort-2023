package com.coreym.mvc.controllers;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coreym.mvc.models.Dog;
import com.coreym.mvc.services.DogService;

@RestController
public class ApiController {

	private final DogService service;
	
	public ApiController(DogService dService) {
		this.service = dService;
	}
	
	@RequestMapping("/api/dogs")
	public ArrayList<Dog> createDog()  {
		return service.findAll();
	}
	
	@RequestMapping("/api/dogs/young")
	public ArrayList<Dog> findYoungDogs() {
		return service.findYoungDogs();
	}
}
