package com.things;

public class Milk {
	
	 private String type;
	 private int price;
	 private float liters;
	 
	 public Milk() {
		 System.out.println("no arguments constructor");
	 }
	 public Milk(String type,int price,float liters) {
		 this.type=type;
		 this.price=price;
		 this.liters=liters;
	 }
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public float getLiters() {
		return liters;
	}
	public void setLiters(float liters) {
		this.liters = liters;
	}
	 
	 
	

	

}
