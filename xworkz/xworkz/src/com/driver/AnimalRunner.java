package com.driver;

import com.things.Dog;

public class AnimalRunner {
	public static void main (String args[]) {
		Dog  dog=new Dog();
		dog.setName("Dog");
		dog.setAge(10);
		dog.setSpecies("xyz");
		
		String Name=dog.getName();
		int age=dog.getAge();
		String species=dog.getSpecies();
	}

}
