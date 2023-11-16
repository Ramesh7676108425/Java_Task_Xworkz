package com.things;

public class Instagram {
	
	public String userName;
	public int numberOfFollowers;
	public boolean isPrivate;
	public int numberOfFollowing;
	public String bio;
	public int post;
	
	
	public Instagram() {
		System.out.println("this is default constructor");
	}
       public Instagram(String userName) {
      System.out.println("this is p constructor with 1 parameter");
      this.userName=userName;
      System.out.println("userName is:"+this.userName);
       }
       
       
       public Instagram(String userName,int numberOfFollowers) {
    	   System.out.println("this is p constructor with 2 parameter");
    	   this.userName=userName;
    	   this.numberOfFollowers=numberOfFollowers;
    	   System.out.println("userName is:"+this.userName+" "+"number of followers is:"+this.numberOfFollowers);
    	   
       }
       
       public Instagram(String userName,int numberOfFollowers,boolean isPrivate) {
       
      System.out.println("this is p constructor with 3 parameter");
      
      this.userName=userName;
	   this.numberOfFollowers=numberOfFollowers;
	   this.isPrivate=isPrivate;
	   System.out.println("userName is:"+this.userName+" "+"number of followers is:"+this.numberOfFollowers+" "+"is private:"+this.isPrivate);
       }
       

       public Instagram(String userName,int numberOfFollowers,boolean isPrivate,int numberOfFollowing) {
       
      System.out.println("this is p constructor with 4 parameter");
      
      this.userName=userName;
	   this.numberOfFollowers=numberOfFollowers;
	   this.isPrivate=isPrivate;
	   this.numberOfFollowing=numberOfFollowing;
	   System.out.println("userName is:"+this.userName+" "+"number of followers is:"+this.numberOfFollowers+" "+"is private:"+this.isPrivate+" "+"number of following is:"+this.numberOfFollowing);
       }
       
       public Instagram(String userName,int numberOfFollowers,boolean isPrivate,int numberOfFollowing,String bio) {
           
    	      System.out.println("this is p constructor with 4 parameter");
    	      
    	      this.userName=userName;
    		   this.numberOfFollowers=numberOfFollowers;
    		   this.isPrivate=isPrivate;
    		   this.numberOfFollowing=numberOfFollowing;
    		   this.bio=bio;
    		   System.out.println("userName is:"+this.userName+" "+"number of followers is:"+this.numberOfFollowers+" "+"is private:"+this.isPrivate+" "+"number of following is:"+this.numberOfFollowing+" "+"bio is:"+this.bio);
    	       }
       
       public Instagram(String userName,int numberOfFollowers,boolean isPrivate,int numberOfFollowing,String bio,int post) {
           
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
       
       
       
       
       
	   
       

