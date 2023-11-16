package com.driver;

import com.things.Coffee;
import com.things.CoffeePowder;
import com.things.Milk;

public class CoffeeRunner {
	
	public static void main (String args[]) {
		
		 
		 
		  Milk milk=new Milk();
		  
		  CoffeePowder coffeePowder=new CoffeePowder();
		  
		  milk.setLiters(4);
//		  coffee.setMilk(milk);
		  //System.out.println(coffee.getMilk().getLiters());
		  milk.setType("nandini");
//		  coffee.setMilk(milk);
		  //System.out.println(coffee.getMilk().getType());
		  milk.setPrice(20);
//		  coffee.setMilk(milk);
		  //System.out.println(coffee.getMilk().getPrice());
		  
		  
		  coffeePowder.setName("redlable");
//		  coffee.setCoffeePowder(coffeePowder);
		  //System.out.println(coffee.getCoffeePowder().getName());
		  
		  coffeePowder.setPrice(30);
//		  coffee.setCoffeePowder(coffeePowder);
		 // System.out.println(coffee.getCoffeePowder().getPrice());
		  
		  coffeePowder.setQuantity(4);
//		  coffee.setCoffeePowder(coffeePowder);
		  //System.out.println(coffee.getCoffeePowder().getQuantity());
		  
		  Coffee coffee=new Coffee(milk,coffeePowder);
		  System.out.println(coffee.getCoffeePowder().getQuantity());
		  System.out.println(coffee.getCoffeePowder().getPrice());
		  System.out.println(coffee.getCoffeePowder().getName());
		  System.out.println(coffee.getMilk().getPrice());
		  System.out.println(coffee.getMilk().getType());
		  System.out.println(coffee.getMilk().getLiters());
	
		  
		 
	}

}
