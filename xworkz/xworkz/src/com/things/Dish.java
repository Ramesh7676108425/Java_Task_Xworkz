package com.things;

public class Dish {
	
	private String dishName;
	private String type;
	private int price;
	private float quantity;
	private String place;
	
public void setdishName(String dishName) {
	this.dishName=dishName;
}

public void settype(String type) {
	this.type=type;
}
public void setprice(int price) {
	this.price=price;
}
public void setquantity(float quantity) {
	this.quantity=quantity;
}
public void setplace(String place) {
	this.place=place;
}

public String getdishName() {
	return this.dishName;
}
public String gettype() {
	return this.type;
}
public int getprice() {
	return this.price;
}

public float getquantity() {
	return this.quantity;
}
public String getplace() {
	return this.place;
	
	
}
}


