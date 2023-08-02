package com.coreym.relationships.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coreym.relationships.models.Dog;
import com.coreym.relationships.repositories.DogRepository;

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
	
	public Dog create(Dog d) {
		return repo.save(d);
	}
	
	public Dog update(Dog d) {
		return repo.save(d);
	}
	
	public void destroy(Long id) {
		repo.deleteById(id);
	}
}
