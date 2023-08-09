package com.coreym.manytomany.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coreym.manytomany.models.Dog;
import com.coreym.manytomany.models.Trainer;
import com.coreym.manytomany.repoositories.DogRepository;

@Service
public class DogService {
	
	@Autowired
	private DogRepository repo;
	
	public ArrayList<Dog> all() {
		return repo.findAll();
	}
	
	public Dog find(Long id) {
		return repo.findById(id).orElse(null);
	}
	
	public Dog create(Dog dog) {
		return repo.save(dog);
	}
	
	// Returns a list of Dogs that are not assigned to the specified trainer
	public ArrayList<Dog> unassigned(Trainer t) {
		return repo.findByTrainersNotContaining(t);
	}
	
	

}
