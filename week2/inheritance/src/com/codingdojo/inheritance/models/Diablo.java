package com.codingdojo.inheritance.models;

public class Diablo extends Fighter implements Fly {
	
	public Diablo() {
		super("Diablo", "Primeval", 22.0, false, "Fear is eternal");
	}
	
	public void fly() {
		System.out.println("Who needs wings?");
	}
}
