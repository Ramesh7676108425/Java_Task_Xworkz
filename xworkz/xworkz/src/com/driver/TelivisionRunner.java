package com.driver;

import com.things.Channel;

public class TelivisionRunner {
	public void gettelivision() {
		System.out.println("default args");
	}
public static void main(String[] args) {
	Channel c=new Channel();
	
	c.getTelivision("royal");
	c.gettelivision();
	c.getTelivision("rrr", 300000);
}

}
