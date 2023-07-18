package com.codingdojo.inheritance.models;

public class Marth extends Fighter {

	String specialTaunt;
	
	public Marth() {
		super("Marth", "Swordsman", 12.0, true, "Hyah hyah");
		this.specialTaunt = "Minna, miteite kure!";
	}
	
	@Override
	public void attack(Fighter target) {
		System.out.println();
		super.attack(target);
		super.attack(target);
	}
	
	@Override
	public void makeNoise() {
		System.out.println("Hyah hyah");
	}
	
	
	
}
