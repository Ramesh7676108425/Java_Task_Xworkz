package com.things;

public class Country {
	
	private State state;
	
	
	
	
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
	public Country() {
		System.out.println("no argument constructor");
	}
	public Country(State state) {
		this.state=state;
	}
	
	
	
	
	

}
