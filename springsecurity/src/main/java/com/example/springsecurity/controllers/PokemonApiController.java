package com.example.springsecurity.controllers;


import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

@RestController
@CrossOrigin
public class PokemonApiController {
	
	
	WebClient client = WebClient.create();
	
	@GetMapping(value="/api/pokemon")
	@ResponseBody()
	public JsonObject getAllPokemon() {
		
		 	Gson gson = new Gson();
		
	        
	        WebClient.ResponseSpec response = client.get()
	        		.uri("https://pokeapi.co/api/v2/pokemon/1")
	        		.header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
	        		.retrieve();
	        
	        String responseBody = response.bodyToMono(String.class).block();
	        
	        JsonObject jsonObject = new JsonParser().parse(responseBody).getAsJsonObject();
	        System.out.println(jsonObject.get("count"));
	        
	        return jsonObject;
	        
	        		
	}
	
	@GetMapping("/api/nutrition")
	public String getNutritionInfo() {
		
		WebClient.ResponseSpec response = client.get()
				.uri("https://trackapi.nutritionix.com/v2/search/instant?query=apple")
				.header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
				.header("x-app-id", "6d3ca9f8" )
				.header("x-app-key", "8286089f30a0294e85763962a7c6c7d2")
				.retrieve();
		
		String responseBody = response.bodyToMono(String.class).block();
		return responseBody;
		
	}
	
	
}
