package com.codingdojo.inheritance.models;

public class Sonic extends Fighter {
	String victoryTaunt;
	public Sonic() {
		super("Sonic", "Hedgehog", 10.0, false, "Gotta go fast" );
		this.victoryTaunt = "You're too slow";
	}
}
