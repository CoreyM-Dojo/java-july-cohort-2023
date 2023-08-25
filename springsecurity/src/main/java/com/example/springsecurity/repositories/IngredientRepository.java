package com.example.springsecurity.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.springsecurity.models.Ingredient;

@Repository
public interface IngredientRepository extends CrudRepository<Ingredient, Long> {

	ArrayList<Ingredient> findAll();
}
