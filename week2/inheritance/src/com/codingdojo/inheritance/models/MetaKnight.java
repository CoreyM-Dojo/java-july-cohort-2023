package com.codingdojo.inheritance.models;

public class MetaKnight extends Fighter implements Fly {
	
	public MetaKnight() {
		super("Meta Knight","Warrior", 25.0, true, "..." );
	}

	public void fly() {
		System.out.println("I believe I can fly!");
	}
}
