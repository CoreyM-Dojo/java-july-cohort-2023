package com.coreym.relationships.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.coreym.relationships.models.Dog;

@Repository
public interface DogRepository extends CrudRepository<Dog, Long> {
	ArrayList<Dog> findAll();
}
