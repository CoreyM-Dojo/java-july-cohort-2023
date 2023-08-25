package com.example.springsecurity.controllers;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import com.example.springsecurity.config.Config;
import com.example.springsecurity.models.Ingredient;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import me.paulschwarz.springdotenv.DotenvPropertySource;

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
	
	@GetMapping("/api/nutrition?search={query}")
	public Ingredient getNutritionInfo(@PathVariable("query") String query) {
		
		 AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();

		    // Add DotenvPropertySource to environment before registering components
		    DotenvPropertySource.addToEnvironment(applicationContext.getEnvironment());

		    applicationContext.register(Config.class);
		    applicationContext.refresh();

		    Config config = applicationContext.getBean(Config.class);
		    
		    String apiKey = config.getApiKey();
		    String apiId = config.getApiId();
		    
		    String api = "https://api.edamam.com/api/food-database/v2/parser";
		    String getRequest = String.format("%s?ingr=%s&app_id=%s&app_key=%s",api, query, apiId, apiKey);
		    System.out.println(getRequest);
		WebClient.ResponseSpec response = client.get()
				.uri(getRequest)
				.header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
				.retrieve();
		
		String responseBody = response.bodyToMono(String.class).block();
		
		JsonObject responseObject =  new JsonParser().parse(responseBody).getAsJsonObject();
		return createIngredientObject(responseObject);
		
	}
	
	public Ingredient createIngredientObject(JsonObject response) {
		System.out.println(response);
		Gson gson = new Gson();
		JsonObject[] foodArray = gson.fromJson(response.get("parsed"), JsonObject[].class);
		
		JsonObject food = gson.fromJson(foodArray[0].get("food"), JsonObject.class);
		JsonObject nutrients = gson.fromJson(food.get("nutrients"), JsonObject.class);
		Ingredient newIngredient = new Ingredient(
				food.get("label").getAsString(),
				nutrients.get("ENERC_KCAL").getAsDouble(),
				nutrients.get("PROCNT").getAsDouble(),
				nutrients.get("FAT").getAsDouble(),
				nutrients.get("CHOCDF").getAsDouble(),
				nutrients.get("FIBTG").getAsDouble()
				);
		return newIngredient;
	}
	
	
}
