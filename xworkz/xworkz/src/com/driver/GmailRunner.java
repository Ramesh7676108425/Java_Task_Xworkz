package com.driver;

import com.things.Gmail;

public class GmailRunner {
	
	public static void main(String...args) {
	
	Gmail gmail=new Gmail();
	gmail.getnumberOfContacts();
	gmail.getusername("3","2","8","77");
	gmail.getMessages(2,33,33,45);
	}
	}


