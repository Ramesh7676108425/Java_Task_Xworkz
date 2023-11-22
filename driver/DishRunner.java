package com.driver;

import com.things.Dish;

public class DishRunner {
	
	public static void main(String args[]) {
		
		
		  Dish xyz=new Dish();
		  
		  xyz.setdishName("biriyani");
		  xyz.settype("bbbb  ");
		  xyz.setprice(22);
		  xyz.setplace("mysore ");
		  xyz.setquantity(5.9f);
		  
		  
		  
		  System.out.println(xyz.getdishName());
		  System.out.println(xyz.gettype());
		  System.out.println(xyz.getprice());
		  System.out.println(xyz.getplace());
		  System.out.println(xyz.getquantity());
		  
	}

	
	
}
