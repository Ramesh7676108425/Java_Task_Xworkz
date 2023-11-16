package com.things;

public class Instance {
	
	Instance(){
		
		System.out.println("this is default c");
	}
Instance(int a){
		
		System.out.println("this is 1 default c");
}
		
		Instance(int a,int b){
			
			System.out.println("this is 2 default c");
	
		}
	
	
	{
		System.out.println("instance block");
	}
	public static void main(String args[]) {
		new Instance();
		new Instance(10);
		new Instance(0,20);
	}
}
