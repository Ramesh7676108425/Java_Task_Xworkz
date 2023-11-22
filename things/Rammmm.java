package com.xworkz.polymorphism.things;

public class Rammmm {
	
	public static void main(String args[]) {

		int[] number1 = { 10, 20, 30, 40, 50 };
		int[] number2 = {60,70,80,90,};
		
		int[] total=new int[number1.length+number2.length];

		for (int i = 0; i < number1.length; i++) {
			total[i]=number1[i];
			
			


		}
		for (int i =0;i< number2.length;  i++) {
			
			total[i+number1.length]=number2[i];
System.out.println(number1[i]);
	

		}
	}
}


