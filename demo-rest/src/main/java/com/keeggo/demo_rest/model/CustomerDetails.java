package com.keeggo.demo_rest.model;

public class CustomerDetails {

	private String name;
	
	private String password;
	
	/**
	 * @param name
	 * @param password
	 */
	public CustomerDetails(String name, String password) {
		this.name = name;
		this.password = password;
	}
	
	public CustomerDetails() {}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
