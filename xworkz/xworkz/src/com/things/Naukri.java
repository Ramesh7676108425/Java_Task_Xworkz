package com.things;

public class Naukri {
	
	private String username;
	private int password;
	private String email;
	private Company company;
	
	public Naukri() {
		System.out.println("no args constructor");
	}

	public Naukri(String username, int password, String email, Company company) {
		System.out.println("all args constructor");
		this.username = username;
		this.password = password;
		this.email = email;
		this.company = company;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}
	
	
	

}
