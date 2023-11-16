package com.things;

public class Test {
	
	
		Test(){
		System.out.println("this is default constructor");

		}
		Test(int a){
		System.out.println("this is 1 constructor");
		}
		{
		System.out.println("this is instance block");
		}

		public static void main(String args[]){
		Test x=new Test();
		 Test y=new Test(10);
		}
		}


