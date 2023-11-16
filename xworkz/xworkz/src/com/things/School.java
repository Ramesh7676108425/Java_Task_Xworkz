package com.things;

public class School {
	
	public String name;
	public int fees;
	public boolean hasRagging;
	
	 public School(){
		System.out.println("xyz");
	}

	public School(String name,int fees,boolean hasRagging){
		
		this.name=name;
		this.fees=fees;
		this.hasRagging=hasRagging;
		System.out.println("name is :"+this.name+" "+"fees is:"+"fees is:"+this.fees+" "+"ragging:"+this.hasRagging);
	}
	
}
