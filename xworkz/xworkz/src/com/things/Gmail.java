package com.things;

public class Gmail {
	
	public String username;
	public int  numberOfContacts;
	public int numberOfMessages;
	
	
	public Gmail() {
		System.out.println("this is default constructor");
		
	}
	public Gmail(String username,int numberOfContacts,int numberOfMessages) {
		System.out.println("this is p constructor with 3 arguments");
		this.username=username;
		this.numberOfContacts=numberOfContacts;
		this.numberOfMessages=numberOfMessages;
	}
	
	public void getnumberOfContacts() {
		
		System.out.println("this is number of contacts ");
	}
	public void getusername(String...username) {
		
		System.out.println("this is username:"+username.length);
		for(int i=0;i<username.length;i++) {
			System.out.println("this is username:"+username[i]);
		}
		
	}
	public void getMessages(int...Messages) {
		System.out.println("this is number of messagess:"+Messages.length);
		for(int i=0;i<Messages.length;i++) {
			System.out.println("this is get Message:"+Messages[i]);
		}
	}

}
