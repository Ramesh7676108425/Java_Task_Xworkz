package com.things;

public class Company {
	
	private String name;
	private String loaction;
	private float rating;
	private Education education;
	
	
	public Company() {
		System.out.println("no args constructor");
		
	}


	public Company(String name, String loaction, float rating) {
		System.out.println("all args constructor");
		this.name = name;
		this.loaction = loaction;
		this.rating = rating;
		this.education=education;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLoaction() {
		return loaction;
	}


	public void setLoaction(String loaction) {
		this.loaction = loaction;
	}


	public float getRating() {
		return rating;
	}


	public void setRating(float rating) {
		this.rating = rating;
	}


	public Education getEducation() {
		return education;
	}


	public void setEducation(Education education) {
		this.education = education;
	}


	
	
	
	
	

}
