package com.xworkz.polymorphism.driver;

import com.xworkz.polymorphism.things.Methods;

public class MethodsRunner {
	
	public static void main(String[] args) {
		
		Methods obj=new Methods();
		Methods.student();
		Methods.student("xyz");
		Methods.student("yy", 7);
		
		
	}

}
