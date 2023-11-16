package com.things;

public class Director {
	
	private String directorName;
	private int numberOfMovie;
	private float rating;
	
	public Director() {
		System.out.println("no args constructor");
	}

	public Director(String directorName, int numberOfMovie, float rating) {
		super();
		this.directorName = directorName;
		this.numberOfMovie = numberOfMovie;
		this.rating = rating;
	}

	public String getDirectorName() {
		return directorName;
	}

	public void setDirectorName(String directorName) {
		this.directorName = directorName;
	}

	public int getNumberOfMovie() {
		return numberOfMovie;
	}

	public void setNumberOfMovie(int numberOfMovie) {
		this.numberOfMovie = numberOfMovie;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}
	
	
	
	
	

}
