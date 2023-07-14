package com.codingdojo.inheritance.models;

public interface Fly {

	public abstract void fly();
	
	public default void flyHigh() {
		System.out.println("Flying high at the speed of sound!");
	}
}
