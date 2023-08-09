package com.coreym.manytomany.repoositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import com.coreym.manytomany.models.Owner;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
	
	public ArrayList<Owner> findAll();

}
