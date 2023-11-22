package com.xworkz.polymorphism.driver;

import com.xworkz.polymorphism.things.Child;
import com.xworkz.polymorphism.things.Parent;

public class ChildRunner {
	
	public static void main(String[] args) {
		Child obj=new Child();
		obj.display();
		Parent obj2=new Parent();
		obj2.display();
		
	}

}
