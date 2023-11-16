package com.things;

public class Coffee {

	private CoffeePowder coffeePowder;
	private Milk milk;
	
	public  Coffee() {
		System.out.println("no argumnet constructor");
	}
	public Coffee(Milk milk,CoffeePowder coffeePowder) {
		this.milk=milk;
		this.coffeePowder=coffeePowder;
	}
	public CoffeePowder getCoffeePowder() {
		return coffeePowder;
	}
	public void setCoffeePowder(CoffeePowder coffeePowder) {
		this.coffeePowder = coffeePowder;
	}
	public Milk getMilk() {
		return milk;
	}
	public void setMilk(Milk milk) {
		this.milk = milk;
	}
	
	

}
