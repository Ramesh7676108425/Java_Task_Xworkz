package com.things;

public class Shine {
	
	public String userName;
	public int numberOfFollowers;
	public boolean isPrivate;
	public int numberOfFollowing;
	public String bio;
	public int post;
	
	//constructor 1
	public Shine() {
		this("royalrami",600,true);
		System.out.println("this is default constructor");
	}
	
	//constructor 2
       public Shine(String userName) {
    	   this();
      System.out.println("this is p constructor with 1 parameter");
      this.userName=userName;
      System.out.println("userName is:"+this.userName);
       }
       
      //constructor 3 
       public Shine(String userName,int numberOfFollowers) {
    	   
    	   this("royalrami",600,true,465);
    	   System.out.println("this is p constructor with 2 parameter");
    	   this.userName=userName;
    	   this.numberOfFollowers=numberOfFollowers;
    	   System.out.println("userName is:"+this.userName+" "+"number of followers is:"+this.numberOfFollowers);
    	   
       }
       
       //constructor 4
       
       public Shine(String userName,int numberOfFollowers,boolean isPrivate) {
    	   this("royalrami",600,true,465,"ahimsa");
       
      System.out.println("this is p constructor with 3 parameter");
      
      this.userName=userName;
	   this.numberOfFollowers=numberOfFollowers;
	   this.isPrivate=isPrivate;
	   System.out.println("userName is:"+this.userName+" "+"number of followers is:"+this.numberOfFollowers+" "+"is private:"+this.isPrivate);
       }
       
//constructor 5
       
       public Shine(String userName,int numberOfFollowers,boolean isPrivate,int numberOfFollowing) {
       
      System.out.println("this is p constructor with 4 parameter");
      
      this.userName=userName;
	   this.numberOfFollowers=numberOfFollowers;
	   this.isPrivate=isPrivate;
	   this.numberOfFollowing=numberOfFollowing;
	   System.out.println("userName is:"+this.userName+" "+"number of followers is:"+this.numberOfFollowers+" "+"is private:"+this.isPrivate+" "+"number of following is:"+this.numberOfFollowing);
       }
       
       //constructor 6
       
       public Shine(String userName,int numberOfFollowers,boolean isPrivate,int numberOfFollowing,String bio) {
           
    	      System.out.println("this is p constructor with 4 parameter");
    	      
    	      this.userName=userName;
    		   this.numberOfFollowers=numberOfFollowers;
    		   this.isPrivate=isPrivate;
    		   this.numberOfFollowing=numberOfFollowing;
    		   this.bio=bio;
    		   System.out.println("userName is:"+this.userName+" "+"number of followers is:"+this.numberOfFollowers+" "+"is private:"+this.isPrivate+" "+"number of following is:"+this.numberOfFollowing+" "+"bio is:"+this.bio);
    	       }
       
       //constructor 7
       
       public Shine(String userName,int numberOfFollowers,boolean isPrivate,int numberOfFollowing,String bio,int post) {
           
 	      System.out.println("this is p constructor with 5 parameter");
 	      
 	      this.userName=userName;
 		   this.numberOfFollowers=numberOfFollowers;
 		   this.isPrivate=isPrivate;
 		   this.numberOfFollowing=numberOfFollowing;
 		   this.bio=bio;
 		   this.post=post;
 		   System.out.println("userName is:"+this.userName+" "+"number of followers is:"+this.numberOfFollowers+" "+"is private:"+this.isPrivate+" "+"number of following is:"+this.numberOfFollowing+" "+"bio is:"+this.bio+" "+"post is:"+this.post);
 	       }
}
       
	
	
	
	
	
	


