package com.things;

public class Instagram22 {
	
	public String username;
	public int followers;
	public boolean isPrivate;
	public long phoneNumber;
	
	
	public Instagram22() {
		this("royalrami",600,true,7676108425l);
		System.out.println("this is default contsructor");
	}
	public  Instagram22(String username) {
		System.out.println("this is p constructor with 1 parameter");
		this.username=username;
		System.out.println("username is:"+this.username);
		
	}
	 
	public  Instagram22(String username,int followers){
		this();
		  System.out.println("this is p constuctor with 2 parameter");
		  this.username=username;
		  this.followers=followers;
		  System.out.println("username is :"+this.username+" "+"followers is:"+this.followers);
	  }
	public  Instagram22(String username,int followers,boolean isPrivate){
		  System.out.println("this is p constuctor with 3 parameter");
		  this.username=username;
		  this.followers=followers;
		  this.isPrivate=isPrivate;
		  System.out.println("username is :"+this.username+" "+"followers is:"+this.followers+" "+"is private:"+this.isPrivate);
	  }
	  
	public  Instagram22(String username,int followers,boolean isPrivate,long phoneNumber){
		  System.out.println("this is p constuctor with 4 parameter");
		  this.username=username;
		  this.followers=followers;
		  this.isPrivate=isPrivate;
		  this.phoneNumber=phoneNumber;
		  System.out.println("username is :"+this.username+" "+"followers is:"+this.followers+" "+"is private:"+this.isPrivate+" "+"phone number is :"+this.phoneNumber);
	  }
	  
	  

}
