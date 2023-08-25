package com.example.springsecurity.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.springsecurity.models.Ingredient;
import com.example.springsecurity.services.IngredientService;
import com.google.gson.Gson;

@Controller
public class HomeController {

	@Autowired
	private UcidController ucid;
	
	@Autowired
	private PokemonApiController api;
	
	@Autowired
	private IngredientService ingService;

	@GetMapping("/")
	public String home() {
//		api.getNutritionInfo("apple");
		OidcUser creds = (OidcUser) ucid.getUserInfo();
		System.out.println(creds.getEmail());
		return "index.jsp";
	}
	
	@PostMapping("/process")
	public String process(@RequestParam("query") String query, RedirectAttributes redirectAttributes) {
		System.out.println(query);		
			Ingredient newIngredient = api.getNutritionInfo(query);
//			redirectAttributes.addFlashAttribute("error", "Something went wrong with your query");
		return "redirect:/";
	}
	
	
}
