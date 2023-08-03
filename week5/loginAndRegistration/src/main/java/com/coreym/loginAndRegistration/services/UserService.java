package com.coreym.loginAndRegistration.services;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.coreym.loginAndRegistration.models.User;
import com.coreym.loginAndRegistration.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository uRepo;
	
	public User create(User u) {
		return uRepo.save(u);
	}
	
	public Boolean isValid(BindingResult result, User user) {
		
		User userInDb = uRepo.findByEmail(user.getEmail()).orElse(null);
		
		if (userInDb != null) {
			result.rejectValue("email", "exists", "An account already exists with this email");
			return false;
		}
		else if (!user.getPassword().equals(user.getConfirm())) {
			result.rejectValue("confirm", "Matches", "Password must match confirm password");
			return false;
		}
		String hashed = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt());
		
		user.setPassword(hashed);
		
		return true;
	}
}
