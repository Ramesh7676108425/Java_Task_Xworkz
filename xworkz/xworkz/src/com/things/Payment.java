package com.things;

public class Payment {
	
	private String mode;
	private double accountNumber;
	private boolean hasDone;
	private Online online;
	
	
	public Payment() {
		System.out.println("no args constructor");
	}
	
	public Payment(String mode,double accountNumber,boolean hasDone,Online online) {
		System.out.println("all args constructor");
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public double getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(double accountNumber) {
		this.accountNumber = accountNumber;
	}

	public boolean isHasDone() {
		return hasDone;
	}

	public void setHasDone(boolean hasDone) {
		this.hasDone = hasDone;
	}

	public Online getOnline() {
		return online;
	}

	public void setOnline(Online online) {
		this.online = online;
	}
	
	

}
