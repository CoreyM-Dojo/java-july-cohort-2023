package com.example.springsecurity.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

@Controller
public class HomeController {

	@Autowired
	private UcidController ucid;
	
	@Autowired
	private PokemonApiController api;

	@GetMapping("/")
	public String home() {
		Gson gson = new Gson();
		
		JsonObject pokemon = api.getAllPokemon();
		System.out.println(pokemon);
//		JsonElement pokemonList =  pokemon.get("results");
//		JsonObject[] pokemonArray = gson.fromJson(pokemonList, JsonObject[].class);
//		JsonObject bulbasaur = pokemonArray[0];
//		System.out.println(bulbasaur);
//		System.out.println(bulbasaur.get("name"));
		
	
		
		
		OidcUser creds = (OidcUser) ucid.getUserInfo();
		System.out.println(creds.getEmail());
		return "index.jsp";
	}
}
