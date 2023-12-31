package com.coreym.loginAndRegistration.services;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.coreym.loginAndRegistration.models.LoginUser;
import com.coreym.loginAndRegistration.models.User;
import com.coreym.loginAndRegistration.repositories.UserRepository;

import jakarta.servlet.http.HttpSession;

@Service
public class UserService {

	@Autowired
	private UserRepository uRepo;
	
	public User create(User u) {
		return uRepo.save(u);
	}
	
	public User find(Long id) {
		return uRepo.findById(id).orElse(null);
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
		
		
		return true;
	}
	
	public Boolean attemptLogin(BindingResult result, LoginUser user, HttpSession session) {
		
		if (result.hasErrors()) {
			return false;
		}
		// Does this email exist in the database
		User userInDb = uRepo.findByEmail(user.getEmail()).orElse(null);
		
		if (userInDb == null) {
			// user does not exist
			result.rejectValue("email", "invalid", "Invalid Login");
			return false;
		}
		
		Boolean matches = BCrypt.checkpw(user.getPassword(), userInDb.getPassword());
		
		if (!matches) {
			result.rejectValue("password", "invalid", "Invalid Login");
			return false;
		}
		
		session.setAttribute("loggedIn", userInDb.getId());
		
		return true;
		
	}
}
