package com.things;

public class Bank {
	
	
	private String bankName;
	private String location;
	
	private Payment payment;
	private Account account;
	
	
	public Bank() {
		System.out.println("no args constructor");
	}
	
	public Bank(String bankName,String location,Payment payment,Account account) {
		System.out.println("all args constructor");
		
		this.bankName=bankName;
		this.location=location;
		this.payment=payment;
		this.account=account;
	}

}
