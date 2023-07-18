package com.codingdojo.inheritance.models;

public class Jigglypuff extends Fighter implements Fly{
	
	public Jigglypuff() {
		super("Jigglypuff", "Pokemon", 15.0, false,"Jiiiiiigaalyyy pufff jiggallyyyyy");
	}
	
	public void fly() {
		System.out.println("Puff puff puff");
	}
}
