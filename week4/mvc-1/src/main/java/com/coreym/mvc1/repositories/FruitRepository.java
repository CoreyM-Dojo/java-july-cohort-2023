package com.coreym.mvc1.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.coreym.mvc1.models.Fruit;

@Repository
public interface FruitRepository extends CrudRepository<Fruit, Long> {

	public ArrayList<Fruit> findAll();
}
