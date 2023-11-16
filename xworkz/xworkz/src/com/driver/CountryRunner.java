package com.driver;

import com.things.Country;
import com.things.State;

public class CountryRunner {

	public static void main(String[] args) {
		State s=new State();
		s.setName("Karnataka");
		s.setPopulation(987654);
		s.setRating(5.5f);
		s.setNumberOfDistrict(30);
		s.setHasHighestGdp(true);
		Country c=new Country(s);
		System.out.println(c.getState().getName());
		
}
}
