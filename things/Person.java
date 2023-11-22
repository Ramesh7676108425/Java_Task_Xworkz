package com.xworkz.polymorphism.things;

public class Person {
	
	private String name;
	private int age;
	
	
	public Person(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public String toString() {
		return ("name is:"+name+" "+"age is:"+age);
	}
	
	public int hashcode() {
		return 5;
	}
	public boolean equals(Object obj) {
		if(this==obj)
		return true;
		return false;
		
	}

			
		
	
	
		public static void main(String args[]) {
			
			Person obj=new Person("abhi",22);
			Person obj2=new Person("rrr",11);
			System.out.println(obj.toString());
			System.out.println(obj.hashcode());
			System.out.println(obj2.equals(obj2));
			
		}
		
	}


