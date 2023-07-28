package com.coreym.mvc1.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coreym.mvc1.models.Fruit;
import com.coreym.mvc1.repositories.FruitRepository;

@Service
public class FruitService {
	
	@Autowired
	private FruitRepository repo;

	public ArrayList<Fruit> findAll() {
		return repo.findAll();
	}
	
	public Fruit find(Long id) {
		return repo.findById(id).orElse(null);
	}
	
	public Fruit create(Fruit fruit) {
		return repo.save(fruit);
	}
	
	
}
