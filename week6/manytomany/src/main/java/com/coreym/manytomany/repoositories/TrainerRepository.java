package com.coreym.manytomany.repoositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import com.coreym.manytomany.models.Trainer;

public interface TrainerRepository extends CrudRepository<Trainer, Long> {
	
	public ArrayList<Trainer> findAll();

}
