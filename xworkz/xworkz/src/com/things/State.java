package com.things;

public class State {
	
	private String name;
	private int population;
	private boolean hasHighestGdp;
	private int numberOfDistrict;
	private float rating;
	
	
	public State() {
		System.out.println("this is no argument");
	}
	
	public State(String name,int population,boolean hasHighestGdp,int numberOfDistrict,float rating) {
		
		this.name=name;
		this.population=population;
		this.hasHighestGdp=hasHighestGdp;
		this.numberOfDistrict=numberOfDistrict;
		this.rating=rating;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public boolean isHasHighestGdp() {
		return hasHighestGdp;
	}

	public void setHasHighestGdp(boolean hasHighestGdp) {
		this.hasHighestGdp = hasHighestGdp;
	}

	public int getNumberOfDistrict() {
		return numberOfDistrict;
	}

	public void setNumberOfDistrict(int numberOfDistrict) {
		this.numberOfDistrict = numberOfDistrict;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}
	

}
