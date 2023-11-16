package com.things;

public class Teligram {
	

	public String userName;
	public int numberOfFollowers;
	public boolean isPrivate;
	public int numberOfFollowing;
	public String bio;
	public int post;
	public String gender;
	
	
	public Teligram() {
		System.out.println("this is default constructor");
	}
       public Teligram(String userName) {
      System.out.println("this is p constructor with 1 parameter");
      this.userName=userName;
      System.out.println("userName is:"+this.userName);
       }
       
       
       public Teligram(String userName,int numberOfFollowers) {
    	   System.out.println("this is p constructor with 2 parameter");
    	   this.userName=userName;
    	   this.numberOfFollowers=numberOfFollowers;
    	   System.out.println("userName is:"+this.userName+" "+"number of followers is:"+this.numberOfFollowers);
    	   
       }
       
       public Teligram(String userName,int numberOfFollowers,boolean isPrivate) {
       
      System.out.println("this is p constructor with 3 parameter");
      
      this.userName=userName;
	   this.numberOfFollowers=numberOfFollowers;
	   this.isPrivate=isPrivate;
	   System.out.println("userName is:"+this.userName+" "+"number of followers is:"+this.numberOfFollowers+" "+"is private:"+this.isPrivate);
       }
       

       public Teligram(String userName,int numberOfFollowers,boolean isPrivate,int numberOfFollowing) {
       
      System.out.println("this is p constructor with 4 parameter");
      
      this.userName=userName;
	   this.numberOfFollowers=numberOfFollowers;
	   this.isPrivate=isPrivate;
	   this.numberOfFollowing=numberOfFollowing;
	   System.out.println("userName is:"+this.userName+" "+"number of followers is:"+this.numberOfFollowers+" "+"is private:"+this.isPrivate+" "+"number of following is:"+this.numberOfFollowing);
       }
       
       public Teligram(String userName,int numberOfFollowers,boolean isPrivate,int numberOfFollowing,String bio) {
           
    	      System.out.println("this is p constructor with 4 parameter");
    	      
    	      this.userName=userName;
    		   this.numberOfFollowers=numberOfFollowers;
    		   this.isPrivate=isPrivate;
    		   this.numberOfFollowing=numberOfFollowing;
    		   this.bio=bio;
    		   System.out.println("userName is:"+this.userName+" "+"number of followers is:"+this.numberOfFollowers+" "+"is private:"+this.isPrivate+" "+"number of following is:"+this.numberOfFollowing+" "+"bio is:"+this.bio);
    	       }
       
       public Teligram(String userName,int numberOfFollowers,boolean isPrivate,int numberOfFollowing,String bio,int post) {
           
 	      System.out.println("this is p constructor with 5 parameter");
 	      
 	      this.userName=userName;
 		   this.numberOfFollowers=numberOfFollowers;
 		   this.isPrivate=isPrivate;
 		   this.numberOfFollowing=numberOfFollowing;
 		   this.bio=bio;
 		   this.post=post;
 		   System.out.println("userName is:"+this.userName+" "+"number of followers is:"+this.numberOfFollowers+" "+"is private:"+this.isPrivate+" "+"number of following is:"+this.numberOfFollowing+" "+"bio is:"+this.bio+" "+"post is:"+this.post+" "+"gender is:"+this.gender);
 	       }
       
       
       public Teligram(String userName,int numberOfFollowers,boolean isPrivate,int numberOfFollowing,String bio,int post,String gender) {
           
  	      System.out.println("this is p constructor with 6 parameter");
  	      
  	      this.userName=userName;
  		   this.numberOfFollowers=numberOfFollowers;
  		   this.isPrivate=isPrivate;
  		   this.numberOfFollowing=numberOfFollowing;
  		   this.bio=bio;
  		   this.post=post;
  		   this.gender=gender;
  		   System.out.println("userName is:"+this.userName+" "+"number of followers is:"+this.numberOfFollowers+" "+"is private:"+this.isPrivate+" "+"number of following is:"+this.numberOfFollowing+" "+"bio is:"+this.bio+" "+"post is:"+this.post);
  	       }
}
       
       
       
       
       
	   
       




