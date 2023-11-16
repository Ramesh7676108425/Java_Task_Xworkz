package com.things;

public class Education {
	
	private String type;
	private String name;
	private int marks;
	private float cgpa;
	
	
	public Education() {
		System.out.println("no args constructor");
	}


	public Education(String type, String name, int marks, float cgpa) {
		System.out.println("all args constructor");
		this.type = type;
		this.name = name;
		this.marks = marks;
		this.cgpa = cgpa;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getMarks() {
		return marks;
	}


	public void setMarks(int marks) {
		this.marks = marks;
	}


	public float getCgpa() {
		return cgpa;
	}


	public void setCgpa(float cgpa) {
		this.cgpa = cgpa;
	}
	
	
	
	
	
}
