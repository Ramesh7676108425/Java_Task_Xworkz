package com.things;

public class Block {
	
	Block(){
		
		System.out.println("this is default constructor");
	}
	Block(int a){
		System.out.println("this is 1 parameter");
	}
	
	Block(int a,int b){
		System.out.println("this is 2 parameter");
	}
	{
		System.out.println("this is instance block");
	}
	public static void main(String args[]) {
		new Block();
		new Block(10);
		new Block(20);
	}

}
