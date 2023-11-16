package com.driver;

import com.things.CountryName;

public class CountryNameRunner {
	
	public static void main (String args[]) {
		
		CountryName  xyz=new CountryName(); 
		
		xyz.save("a");
		xyz.save("b");
		xyz.save("c");
		xyz.save("d");
		xyz.save("e");
		xyz.save("f");
		//xyz.save("g");
		xyz.getdata();
		xyz.delete("d");
		System.out.println("after deletion");
		xyz.getdata();
		xyz.update("c", "a");
		System.out.println("after update");
		xyz.getdata();
			
		
	}

}
