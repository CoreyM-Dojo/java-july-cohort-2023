package com.corey.session.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import jakarta.servlet.http.HttpSession;

@Controller
public class MainController {
	
	@GetMapping("/")
	public String home(HttpSession session) {
		System.out.println(session.isNew());
		return "index.jsp";
	}
	
	@PostMapping("/process")
	public String process(RedirectAttributes flash,HttpSession session, @RequestParam("pizzaType") String pizzaType, @RequestParam("toppings") Integer numToppings, @RequestParam("size")String size, @RequestParam("style") String style) {
		session.setAttribute("pizzaType", pizzaType);
		session.setAttribute("numToppings", numToppings);
		session.setAttribute("size", size);
		session.setAttribute("style", style);
		flash.addFlashAttribute("bumpkin", "Hello Bumpkin!");
		return "redirect:/pizza";
		
	}
	
	
	@GetMapping("/pizza") 
	public String pizza(HttpSession session) {
		
		String newSize = (String) session.getAttribute("size");
		return "pizza.jsp";
	}
}
