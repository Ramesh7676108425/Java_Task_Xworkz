package com.things;

public class Movie extends Director{
	
	public Movie() {
		
		super("uppi",10,9.3f);
		
		System.out.println(super.getDirectorName());
		System.out.println(super.getNumberOfMovie());
		System.out.println(super.getRating());
		
		
	}

}
