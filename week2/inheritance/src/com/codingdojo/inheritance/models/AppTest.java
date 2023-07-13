package com.codingdojo.inheritance.models;

public class AppTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marth marth = new Marth("Marth", "Swordsman", 10.0, true, 0.0, "Show me your moves" );
		
		Fighter keanuReeves = new Fighter("Keanu Reeves", "Actor", 12.0, true, 0.0, "You killed my dog, prepare to die");
		
		marth.attack(keanuReeves);
		keanuReeves.attack(marth);
	}
	
	

}
