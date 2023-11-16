package com.things;

public class Hotel {
	public String name;
	public int cost;
	
	
	
	public Hotel()
 {
		
		System.out.println("xyz");
	}
  



public Hotel(String name,int cost) {
	System.out.println("ggg");
	this.name=name;
	this.cost=cost;
	System.out.println("name:"+this.name+" "+"cost is:"+this.cost);
}
}

