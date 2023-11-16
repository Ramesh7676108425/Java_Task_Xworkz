package com.things;

public class Dog extends Animal {
	
	public Dog() {
		super("Dog",10,"xyz");
		System.out.println(super.getName());
		System.out.println(super.getAge());
		System.out.println(super.getSpecies());
		
	}

}
