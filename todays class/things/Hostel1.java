package com;

public class Hostel1 {
	
	public String hostelName;
	public int fees;
	public float rating;
	public boolean hasRagging;
	
	
	
	public Hostel1(){
		System.out.println("this is defualt constructor");
	}
	
	public Hostel1(String hostelName) {
		System.out.println("this is parameteraised constructor");
		this.hostelName=hostelName;
		System.out.println("  :"+this.hostelName);
	}
	
	public Hostel1 (String hostelName,int fees,float rating) {
	this.hostelName=hostelName;
	this.fees=fees;
	this.rating=rating;
	
	System.out.println("hostel name is:"+this.hostelName+" "+"fees of a hostel:"+this.fees+" "+"rating:"+this.rating);
	
	

	}
}
	
