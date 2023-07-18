package com.codingdojo.inheritance.models;

import java.util.ArrayList;
import java.util.Random;

// Test code in AppTest.java

public abstract class Fighter {
	
	private static ArrayList<Fighter> fighters = new ArrayList<>();
	// A class is a blueprint that we build real word representations of objects
	
	// Member variables -> Traits connected to the class
	
	private String name;
	private String role;
	private Double attack;
	private Boolean hasWeapon;
	private Double damage;
	private String taunt;
	
	// Constructor -> __init__ in python
	// Is called when we make new instances of a class
	public Fighter() {}

	public Fighter(String name, String role, Double attack, Boolean hasWeapon, String taunt) {
		this.name = name;
		this.role = role;
		this.attack = attack;
		this.hasWeapon = hasWeapon;
		this.damage = 0.0;
		this.taunt = taunt;
		Fighter.fighters.add(this);
	}
	
	// Functionality
	
	// taunt
	public void sayTaunt() {
		System.out.println(taunt);
	}
	// attack
	public void attack(Fighter target) {
		target.takeDamage(this.attack);
	}
	
	// takeDamage
	public void takeDamage(Double amount) {
		Random rng = new Random();
		
		int chance = rng.nextInt(11);
		
		if (chance > 5) {
			Double newAmount = Math.floor(amount/2);
			this.setDamage(damage + newAmount);
		} else {
			this.setDamage(damage + amount);
		}
	}
	
	public void makeNoise() {
		System.out.println("Making some noise");
	}
	
	
	
	
	
	
	
	// Getters and Setters

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Double getAttack() {
		return attack;
	}

	public void setAttack(Double attack) {
		this.attack = attack;
	}

	public Boolean getHasWeapon() {
		return hasWeapon;
	}

	public void setHasWeapon(Boolean hasWeapon) {
		this.hasWeapon = hasWeapon;
	}

	public Double getDamage() {
		return damage;
	}

	public void setDamage(Double damage) {
		this.damage = damage;
	}
	
	public static ArrayList<Fighter> getFighters() {
		return Fighter.fighters;
	}
	
	@Override
	public String toString() {
		return String.format("%s -> %s", this.name, this.role);
	}
	
	
	
	
	// What is an instance? - the individual product from a class
	
	// methods -> The functions that can performed by the class
	
	
	
	// ctrl/command + shift + o
	
	
}
