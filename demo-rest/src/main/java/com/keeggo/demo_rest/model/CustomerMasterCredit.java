package com.keeggo.demo_rest.model;

public class CustomerMasterCredit {

	private String accountId; 
	private String base64Token; 
	private String cardNumber; 
	private String customerName;
	private String cvvNumber; 
	private String expirationDate;
	
	/**
	 * @param accountId
	 * @param base64Token
	 * @param cardNumber
	 * @param customerName
	 * @param cvvNumber
	 * @param expirationDate
	 */
	public CustomerMasterCredit(String accountId, String base64Token, String cardNumber, String customerName, String cvvNumber, String expirationDate) {
		this.accountId = accountId;
		this.base64Token = base64Token;
		this.cardNumber = cardNumber;
		this.customerName = customerName;
		this.cvvNumber = cvvNumber;
		this.expirationDate = expirationDate;
	}
	
	public CustomerMasterCredit() {
	
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getBase64Token() {
		return base64Token;
	}

	public void setBase64Token(String base64Token) {
		this.base64Token = base64Token;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCvvNumber() {
		return cvvNumber;
	}

	public void setCvvNumber(String cvvNumber) {
		this.cvvNumber = cvvNumber;
	}

	public String getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}
	
	
}
