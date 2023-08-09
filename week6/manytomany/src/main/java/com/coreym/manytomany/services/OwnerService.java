package com.coreym.manytomany.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coreym.manytomany.models.Owner;
import com.coreym.manytomany.repoositories.OwnerRepository;

@Service
public class OwnerService {
	
	@Autowired
	private OwnerRepository repo;
	
	public ArrayList<Owner> all() {
		return repo.findAll();
	}
	
	public Owner find(Long id) {
		return repo.findById(id).orElse(null);
	}
	
	public Owner create(Owner Owner) {
		return repo.save(Owner);
	}
	
	public void addFriend(Owner friend1, Owner friend2) {
		
		friend1.getFriends().add(friend2);
		repo.save(friend1);
	}
	
	
	
	
	

}
