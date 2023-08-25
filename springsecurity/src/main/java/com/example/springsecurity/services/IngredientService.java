package com.example.springsecurity.services;

import java.util.ArrayList;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springsecurity.models.Ingredient;
import com.example.springsecurity.repositories.IngredientRepository;

@Service
public class IngredientService {
	
	private final IngredientRepository iRepo;
	
	public IngredientService(IngredientRepository iRepo) {
		this.iRepo = iRepo;
	}
	
	public ArrayList<Ingredient> all() {
		return iRepo.findAll();
	}
	
	public Ingredient create(Ingredient ingredient) {
		return iRepo.save(ingredient);
	}
	
	
}
