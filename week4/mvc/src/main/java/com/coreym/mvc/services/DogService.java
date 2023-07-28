package com.coreym.mvc.services;

import java.util.ArrayList;
import java.util.Optional;
import com.coreym.mvc.models.Dog;

import org.springframework.stereotype.Service;

import com.coreym.mvc.models.Dog;
import com.coreym.mvc.repositories.DogRepository;

@Service
public class DogService {
	
	private final DogRepository dogRepo;
	
	public DogService(DogRepository repo) {
		this.dogRepo = repo;
	}
	
	public ArrayList<Dog> findAll() {
		return dogRepo.findAll();
	}
	
	public Dog createDog(Dog dog) {
		return dogRepo.save(dog);
	}
	
	public Dog find(Long id) {
		return dogRepo.findById(id).orElse(null);
	}
	
	public ArrayList<Dog> findYoungDogs() {
		return dogRepo.findAgeNameAndBreedSortByAgeLessThan(5);
	}
	
	public Dog update(Dog dog) {
		return dogRepo.save(dog);
	}
	
	public void removeDog(Long id) {
		dogRepo.deleteById(id);
	}
	
	

}

