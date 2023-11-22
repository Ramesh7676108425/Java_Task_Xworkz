package com.driver;

import com.things.Movie;

public class DirectorRunner {
	
	public static void main(String args[]) {
		
		Movie movie=new Movie();
		movie.setDirectorName("uppi");
		movie.setNumberOfMovie(10);
		movie.setRating(9.3f);
		
		
		String Name=movie.getDirectorName();
		int numberofmovie=movie.getNumberOfMovie();
		float rating=movie.getRating();
		
		
	}

}
