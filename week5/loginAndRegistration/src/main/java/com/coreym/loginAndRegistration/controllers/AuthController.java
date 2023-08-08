package com.coreym.loginAndRegistration.controllers;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.coreym.loginAndRegistration.models.LoginUser;
import com.coreym.loginAndRegistration.models.User;
import com.coreym.loginAndRegistration.services.UserService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class AuthController {
	
	@Autowired
	private UserService uService;
	
//	@Autowired
//	private FieldsValueMatchValidator validator;
//	
//	@InitBinder
//	protected void initBinder(final WebDataBinder binder) {
//	    binder.addValidators(validator);
//	}
	
	
	@GetMapping("/")
	public String register(@ModelAttribute("newUser") User user) {
		return "index.jsp";
	}
	@PostMapping("/registration")
	public String process(@Valid @ModelAttribute("newUser") User user, BindingResult result) {
		
		Boolean isValid = uService.isValid(result, user);
		
		
		if (result.hasErrors() || isValid != true) {
			System.out.println(result);
			return "index.jsp";
		}
		
		String hashed = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt());
		
		user.setPassword(hashed);
//		user.setConfirm(hashed);
		
		uService.create(user);
		
		return "redirect:/";
	}
	
	@GetMapping("/login")
	public String loginPage(@ModelAttribute("loginUser") LoginUser user) {
		return "login.jsp";
	}
	
	@PostMapping("/login")
	public String process(@Valid @ModelAttribute("loginUser") LoginUser user, BindingResult result, HttpSession session) {
		
		Boolean isValid = uService.attemptLogin(result, user, session);
		if (result.hasErrors() || !isValid) {
			return "login.jsp";			
		}
		
		
		return "redirect:/success";
	}
	
	@GetMapping("/success")
	public String success(HttpSession session, Model model, RedirectAttributes flashAttributes) {
		
		if ( session.getAttribute("loggedIn") == null) {
			
			flashAttributes.addFlashAttribute("loginError", "You must be logged in");
			return "redirect:/login";
		}
		
		User loggedIn = uService.find((Long)session.getAttribute("loggedIn"));
		
		model.addAttribute("loggedInUser", loggedIn);
		return "success.jsp";
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/login";
	}
	
	
	

}
