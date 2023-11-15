package com;

public class Hotel {
	
	public String name;
	public int cost;
	public boolean available;
	public float rating;
	public int phoneNumber;
	
	
	Hotel(){
		System.out.println("this is default constructor");
	}
   Hotel(String name){
   System.out.println("this is parametairsed constructor");
   this.name=name;
   System.out.println("name is :"+this.name);
	
}
   Hotel(String name,int cost,boolean available,float rating){
   System.out.println("this is constructor with 4 parameter");
   this.name=name;
   this.cost=cost;
   this.available=available;
   this.rating=rating;
   System.out.println("name is :"+this.name+" "+"cost is:"+this.cost+" "+"xyz:"+this.available+" "+"rating is:"+this.rating);
}
}
