package com.coreym.relationships.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.coreym.relationships.models.Shelter;

@Repository
public interface ShelterRepository extends CrudRepository<Shelter, Long> {
	ArrayList<Shelter> findAll();
}
