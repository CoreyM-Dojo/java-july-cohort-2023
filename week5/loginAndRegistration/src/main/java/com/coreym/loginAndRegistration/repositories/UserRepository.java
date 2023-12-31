package com.coreym.loginAndRegistration.repositories;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.coreym.loginAndRegistration.models.User;

public interface UserRepository extends CrudRepository<User, Long>{

	public ArrayList<User> findAll();
	
	public Optional<User> findByEmail(String email);
}
