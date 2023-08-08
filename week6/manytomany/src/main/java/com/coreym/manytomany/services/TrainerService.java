package com.coreym.manytomany.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coreym.manytomany.models.Dog;
import com.coreym.manytomany.models.Trainer;
import com.coreym.manytomany.repoositories.TrainerRepository;

@Service
public class TrainerService {
	
	@Autowired
	private TrainerRepository repo;
	
	public ArrayList<Trainer> all() {
		return repo.findAll();
	}
	
	public Trainer find(Long id) {
		return repo.findById(id).orElse(null);
	}
	
	public Trainer create(Trainer trainer) {
		return repo.save(trainer);
	}
	
	

}
