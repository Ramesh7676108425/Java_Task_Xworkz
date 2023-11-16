package com.things;

public class Telivision {
	
	public String name;
	
	public void gettelivision() {
		System.out.println("default args");
	}
	
	public void getTelivision(String name) {
		
		System.out.println("telivision name:"+name);
		
	}
	
	public void getTelivision(String name,int price) {
		System.out.println("xyz:"+price);
	}

}
