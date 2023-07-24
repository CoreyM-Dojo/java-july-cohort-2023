package com.ninjagold1.controllers;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class NinjaController {
	
	@GetMapping("/")
	public String view(HttpSession session) {
		if (session.getAttribute("gold")==null) {
			session.setAttribute("gold", 0);
			session.setAttribute("activities", new ArrayList<String>());
		}
		return "ninja.jsp";
	}
	
	@PostMapping("/gold")
	public String gold(@RequestParam(value="farm", required=false) String farm, 
			@RequestParam(value="cave", required=false) String cave, 
			@RequestParam(value="house", required=false) String house, 
			@RequestParam(value="quest", required=false) String quest, 
			HttpSession session ) {
		SimpleDateFormat ninjaDate = new SimpleDateFormat("MMMM d Y h:mm a");
		Integer gold =0;
		gold = (Integer) session.getAttribute("gold");
		
		ArrayList<String> activities = (ArrayList<String>) session.getAttribute("activities");
		session.setAttribute("activities", activities);
		
		if (farm != null) {
			Integer amount = new Random().nextInt(11) + 10;
			gold += amount;
			session.setAttribute("gold", gold);
			activities.add(0, "<p style='color: green;'>You entered a farm and earned " + amount + " gold </p>");
		}
		if (cave != null) {
			Integer amount = new Random().nextInt(6) + 5;
			gold+= amount;
			session.setAttribute("gold", gold);
			activities.add(0, "<p style='color: green;'> You entered a cave and earned " + amount + " gold. (" + ninjaDate.format(new Date()) + ")</p>");
		}
		if (house != null) {
			Integer amount = new Random().nextInt(4) + 2;
			gold+= amount;
			session.setAttribute("gold", gold);
			activities.add(0, "<p style='color: green;'> You entered a house and earned " + amount + " gold. (" + ninjaDate.format(new Date()) + ")</p>");
		}
		if (quest != null) {
			Integer amount = new Random().nextInt(101) - 50;
			gold+= amount;
			session.setAttribute("gold", gold);
			
			if(amount<0) {
				activities.add(0, " <p style='color: red;'> You failed the quest and lost " + (amount * -1) + " gold. (" + ninjaDate.format(new Date()) + ") </p>");
			}else {
				activities.add(0, "<p style='color: green;'> You completed the quest and earned " + amount + " gold. (" + ninjaDate.format(new Date()) + ")</p>");
			}
	}
		if(gold < -20) {
			return "redirect:/prison";
		}
		return "redirect:/";
}
	@GetMapping("/clear")
	public String reset(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
	
	@GetMapping("/prison")
	public String prison() {
		return "prison.jsp";
	}
}
