package com;

public class School {
	
	public String name;
	public int fees;
	public int numberOfStudents;
	public boolean hasRagging;
	public float rating;
	
	School(){
		System.out.println("default constructor");
	}
	
	School(String name){
		
		System.out.println("parameteraised constructor");
		this.name=name;
		System.out.println("school name:"+this.name);
		
	}
	School (String name,int fees,float rating){
		System.out.println("constructor with 3 parameter");
		this.name=name;
		this.fees=fees;
		this.rating=rating;
		System.out.println("name of school is :"+this.name+" "+"fees is:"+this.fees+" "+" ratings s :"+this.rating);
	}
		School (String name,int fees,float rating,boolean hasRagging){
			System.out.println("constructor with 3 parameter");
			this.name=name;
			this.fees=fees;
			this.rating=rating;
			this.hasRagging=hasRagging;
			System.out.println("name of school is :"+this.name+" "+"fees is:"+this.fees+" "+" ratings s :"+this.rating+" "+"has ragging:"+this.hasRagging);
		
		
	}
	
	
	

}
