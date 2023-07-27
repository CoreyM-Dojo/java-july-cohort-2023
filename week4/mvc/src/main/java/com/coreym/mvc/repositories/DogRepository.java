package com.coreym.mvc.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.coreym.mvc.models.Dog;

@Repository
public interface DogRepository extends CrudRepository<Dog, Long> {
	
	public ArrayList<Dog> findAll();
	
	// Select age, name, breed FROM dogs WHERE age < ?1
	public ArrayList<Dog> findAgeNameAndBreedSortByAgeLessThan(Integer age);

}
