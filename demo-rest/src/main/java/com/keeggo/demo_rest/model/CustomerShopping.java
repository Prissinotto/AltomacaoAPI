package com.keeggo.demo_rest.model;

public class CustomerShopping {

	private String accountType;
	private String address;
	private String allowOffersPromotion;
	private String aobUser;
	private String cityName;
	private String country;
	private String email;
	private String firstName;
	private String lastName;
	private String loginName;
	private String password;
	private String phoneNumber;
	private String stateProvince;
	private String zipcode;
	
	
	/**
	 * @param accountType
	 * @param address
	 * @param allowOffersPromotion
	 * @param aobUser
	 * @param cityName
	 * @param country
	 * @param email
	 * @param firstName
	 * @param lastName
	 * @param loginName
	 * @param password
	 * @param phoneNumber
	 * @param stateProvince
	 * @param zipcode
	 */
	public CustomerShopping(String accountType, String address, String allowOffersPromotion, String aobUser,
			String cityName, String country, String email, String firstName, String lastName, String loginName,
			String password, String phoneNumber, String stateProvince, String zipcode) {

		this.accountType = accountType;
		this.address = address;
		this.allowOffersPromotion = allowOffersPromotion;
		this.aobUser = aobUser;
		this.cityName = cityName;
		this.country = country;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.loginName = loginName;
		this.password = password;
		this.phoneNumber = phoneNumber;
		this.stateProvince = stateProvince;
		this.zipcode = zipcode;
	}

	public CustomerShopping() {}
	
	
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	public String getAllowOffersPromotion() {
		return allowOffersPromotion;
	}

	public void setAllowOffersPromotion(String allowOffersPromotion) {
		this.allowOffersPromotion = allowOffersPromotion;
	}

	public String getAobUser() {
		return aobUser;
	}

	public void setAobUser(String aobUser) {
		this.aobUser = aobUser;
	}

	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getStateProvince() {
		return stateProvince;
	}
	public void setStateProvince(String stateProvince) {
		this.stateProvince = stateProvince;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
}
