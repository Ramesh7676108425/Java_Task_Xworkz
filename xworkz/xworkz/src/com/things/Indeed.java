package com.things;

public class Indeed {
	
	
	public String userName;
	public int numberOfFollowers;
	public boolean isPrivate;
	public int numberOfFollowing;
	public String bio;
	public int post;
	public long number;
	public String email;
	
	
	public Indeed() {
		this("royalrami",600,true,465,"ahimsa",6,7676108425l,"rameshlrami16@gmail.com");
		System.out.println("this is default constructor");
	}
       public Indeed(String userName) {
    	   this("royalrami",600,true,465,"ahimsa",6);
      System.out.println("this is p constructor with 1 parameter");
      this.userName=userName;
      System.out.println("userName is:"+this.userName);
       }
       
       
       public Indeed(String userName,int numberOfFollowers) {
    	   this();
    	   System.out.println("this is p constructor with 2 parameter");
    	   this.userName=userName;
    	   this.numberOfFollowers=numberOfFollowers;
    	   System.out.println("userName is:"+this.userName+" "+"number of followers is:"+this.numberOfFollowers);
    	   
       }
       
       public Indeed(String userName,int numberOfFollowers,boolean isPrivate) {
       
      System.out.println("this is p constructor with 3 parameter");
      
      this.userName=userName;
	   this.numberOfFollowers=numberOfFollowers;
	   this.isPrivate=isPrivate;
	   System.out.println("userName is:"+this.userName+" "+"number of followers is:"+this.numberOfFollowers+" "+"is private:"+this.isPrivate);
       }
       

       public Indeed(String userName,int numberOfFollowers,boolean isPrivate,int numberOfFollowing) {
       
      System.out.println("this is p constructor with 4 parameter");
      
      this.userName=userName;
	   this.numberOfFollowers=numberOfFollowers;
	   this.isPrivate=isPrivate;
	   this.numberOfFollowing=numberOfFollowing;
	   System.out.println("userName is:"+this.userName+" "+"number of followers is:"+this.numberOfFollowers+" "+"is private:"+this.isPrivate+" "+"number of following is:"+this.numberOfFollowing);
       }
       
       public Indeed(String userName,int numberOfFollowers,boolean isPrivate,int numberOfFollowing,String bio) {
           
    	      System.out.println("this is p constructor with 4 parameter");
    	      
    	      this.userName=userName;
    		   this.numberOfFollowers=numberOfFollowers;
    		   this.isPrivate=isPrivate;
    		   this.numberOfFollowing=numberOfFollowing;
    		   this.bio=bio;
    		   System.out.println("userName is:"+this.userName+" "+"number of followers is:"+this.numberOfFollowers+" "+"is private:"+this.isPrivate+" "+"number of following is:"+this.numberOfFollowing+" "+"bio is:"+this.bio);
    	       }
       
       public Indeed(String userName,int numberOfFollowers,boolean isPrivate,int numberOfFollowing,String bio,int post) {
           
 	      System.out.println("this is p constructor with 5 parameter");
 	      
 	      this.userName=userName;
 		   this.numberOfFollowers=numberOfFollowers;
 		   this.isPrivate=isPrivate;
 		   this.numberOfFollowing=numberOfFollowing;
 		   this.bio=bio;
 		   this.post=post;
 		   System.out.println("userName is:"+this.userName+" "+"number of followers is:"+this.numberOfFollowers+" "+"is private:"+this.isPrivate+" "+"number of following is:"+this.numberOfFollowing+" "+"bio is:"+this.bio+" "+"post is:"+this.post);
 	       }
       
       
       public Indeed(String userName,int numberOfFollowers,boolean isPrivate,int numberOfFollowing,String bio,int post,long number) {
           
 	      System.out.println("this is p constructor with 6 parameter");
 	      
 	      this.userName=userName;
 		   this.numberOfFollowers=numberOfFollowers;
 		   this.isPrivate=isPrivate;
 		   this.numberOfFollowing=numberOfFollowing;
 		   this.bio=bio;
 		   this.post=post;
 		   this.number=number;
 		   System.out.println("userName is:"+this.userName+" "+"number of followers is:"+this.numberOfFollowers+" "+"is private:"+this.isPrivate+" "+"number of following is:"+this.numberOfFollowing+" "+"bio is:"+this.bio+" "+"post is:"+this.post+" "+"number is:"+this.number);
 	       }
       
       
       public Indeed(String userName,int numberOfFollowers,boolean isPrivate,int numberOfFollowing,String bio,int post,long number,String email) {
           
 	      System.out.println("this is p constructor with 6 parameter");
 	      
 	      this.userName=userName;
 		   this.numberOfFollowers=numberOfFollowers;
 		   this.isPrivate=isPrivate;
 		   this.numberOfFollowing=numberOfFollowing;
 		   this.bio=bio;
 		   this.post=post;
 		   this.number=number;
 		   this.email=email;
 		   System.out.println("userName is:"+this.userName+" "+"number of followers is:"+this.numberOfFollowers+" "+"is private:"+this.isPrivate+" "+"number of following is:"+this.numberOfFollowing+" "+"bio is:"+this.bio+" "+"post is:"+this.post+" "+"number is:"+this.number+" "+"email:"+this.email);
 	       }
}

       


