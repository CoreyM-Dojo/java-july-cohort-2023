package com.coreym.relationships.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coreym.relationships.models.Shelter;
import com.coreym.relationships.repositories.ShelterRepository;

@Service
public class ShelterService {
	
	@Autowired
	private ShelterRepository repo;
	

	public ArrayList<Shelter> all() {
		return repo.findAll();
	}
	
	public Shelter find(Long id) {
		return repo.findById(id).orElse(null);
	}
	
	public Shelter create(Shelter s) {
		return repo.save(s);
	}
	
	public Shelter update(Shelter s) {
		return repo.save(s);
	}
	
	public void destroy(Long id) {
		repo.deleteById(id);
	}
}
