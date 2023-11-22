package com.driver;

import java.awt.print.Paper;

import com.things.Plastic;
import com.things.Wastage;

public class CraftRunner {
	
	
	public static void main(String args[]) {
		
	//	Paper p=new Paper();
	//	Plastic pp=new Plastic();
		Wastage w=new Wastage();
		
		w.getcraftName();
		w.getcraftName("xyz");
		w.getcraftName( 333);
		
		
		
	}

}
