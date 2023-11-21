package com.things;

public class CoffeePowder {
	
	
private String name;
private int price;
private float quantity;

public CoffeePowder() {
	System.out.println("no arguments constructor");
}

public CoffeePowder(String name,int price,float quantity) {
	this.name=name;
	this.price=price;
	this.quantity=quantity;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}

public float getQuantity() {
	return quantity;
}

public void setQuantity(float quantity) {
	this.quantity = quantity;
}





}
