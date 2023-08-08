package com.coreym.manytomany.repoositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import com.coreym.manytomany.models.Dog;
import com.coreym.manytomany.models.Trainer;

public interface DogRepository extends CrudRepository<Dog, Long> {

	public ArrayList<Dog> findAll();
}
