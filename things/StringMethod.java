package com.xworkz.polymorphism.things;

public class StringMethod {
	
	public static void main(String[] args) {
		
		String name="rahul";
		String s="welcome to Xworkz";
		//to find the length of string
		System.out.println("sentence length:"+s.length());
		// to split the word 
		String a[]=s.split(" ");
		for (String i : a) {
		System.out.println(i);
}
		// to find the word count
		System.out.println("word count:"+a.length);
		//to find the character count
		 System.out.println("s index 4:"+s.charAt(2));
		 //converting string into character array
		 char y[]=s.toCharArray();
		
		 for(char i :y) {
			 System.out.println(i);
			 System.out.println("reverse a string");
			 
		 }
		 
		
}
}