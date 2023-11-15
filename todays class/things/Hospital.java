package com;

public class Hospital {
	
	public String name;
	public int number;
	public boolean hasHigein;
	public float rating;
	
	
	
	Hospital(){
		System.out.println("xyz");
		
	}
 
	Hospital(String name,int number,boolean hasHigein,float rating){
		
		System.out.println("jkjjjj");
		this.name=name;
		this.number=number;
		this.hasHigein=hasHigein;
		this.rating=rating;
		System.out.println("name is:"+this.name+" "+" number:"+this.number+" "+" higein:"+this.hasHigein+" "+"rating:"+this.rating);
	}
	
}
