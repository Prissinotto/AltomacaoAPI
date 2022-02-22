package com.keeggo.demo_rest.model;

public class CustomerShoppingLogin {
	
	private String email;
	private String loginPassword;
	private String loginUser;
	
	/**
	 * @param email
	 * @param loginPassword
	 * @param loginUser
	 */
	public CustomerShoppingLogin(String email, String loginPassword, String loginUser) {
		super();
		this.email = email;
		this.loginPassword = loginPassword;
		this.loginUser = loginUser;
	}
	
	public CustomerShoppingLogin() {}

	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLoginPassword() {
		return loginPassword;
	}
	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}
	public String getLoginUser() {
		return loginUser;
	}
	public void setLoginUser(String loginUser) {
		this.loginUser = loginUser;
	}
	
	

	

}
