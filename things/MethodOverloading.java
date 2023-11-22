package com.xworkz.polymorphism.things;

public class MethodOverloading {
	
	public static void School() {
//		System.out.println("welcome to xworkz");.
	}
	
	public static void School(String name) {
		System.out.println("name of school is :"+name);
		
	}
	
	public static void School(String location,int students) {
		System.out.println("location is:"+location+" "+"student:"+students);
	}
	

}
