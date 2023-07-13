package com.codingdojo.inheritance.models;

public class Marth extends Fighter {

	String specialTaunt;
	
	public Marth(String name, String role, Double attack, Boolean hasWeapon, Double damage, String taunt) {
		super(name, role, attack, hasWeapon, damage, taunt);
		this.specialTaunt = "Minna, miteite kure!";
	}
	
	@Override
	public void attack(Fighter target) {
		System.out.println("Double Attack Flash!");
		super.attack(target);
		super.attack(target);
	}
	
	
	
}
