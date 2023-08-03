package com.coreym.loginAndRegistration.controllers;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.coreym.loginAndRegistration.models.User;
import com.coreym.loginAndRegistration.services.UserService;

import jakarta.validation.Valid;

@Controller
public class AuthController {
	
	@Autowired
	private UserService uService;
	
	@GetMapping("/")
	public String register(@ModelAttribute("newUser") User user) {
		return "index.jsp";
	}
	@PostMapping("/registration")
	public String process(@Valid @ModelAttribute("newUser") User user, BindingResult result) {
		
		Boolean isValid = uService.isValid(result, user);
		
		
		if (result.hasErrors() || isValid != true) {
			return "index.jsp";
		}
		
		uService.create(user);
		
		return "redirect:/";
	}

}
