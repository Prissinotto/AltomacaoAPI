package com.keeggo.demo_rest.model;

public class CustomerSafePay {
	
	
	private String SPCustomerPhone;
	private String SPPassword ;
	private String SPReceivingAmount_Currency ;
	private String SPReceivingAmount_Value ;
	private String SPReceivingCard_AccountNumber ;
	private String SPTransactionDate;
	private String SPTransactionType;
	private String SPUserName;
	
	public CustomerSafePay(String sPCustomerPhone, String sPPassword, String sPReceivingAmount_Currency,
			String sPReceivingAmount_Value, String sPReceivingCard_AccountNumber, String sPTransactionDate,
			String sPTransactionType, String sPUserName) {
		SPCustomerPhone = sPCustomerPhone;
		SPPassword = sPPassword;
		SPReceivingAmount_Currency = sPReceivingAmount_Currency;
		SPReceivingAmount_Value = sPReceivingAmount_Value;
		SPReceivingCard_AccountNumber = sPReceivingCard_AccountNumber;
		SPTransactionDate = sPTransactionDate;
		SPTransactionType = sPTransactionType;
		SPUserName = sPUserName;
	}

	public CustomerSafePay() {
		
	}

	public String getSPCustomerPhone() {
		return SPCustomerPhone;
	}
	public void setSPCustomerPhone(String sPCustomerPhone) {
		SPCustomerPhone = sPCustomerPhone;
	}
	public String getSPPassword() {
		return SPPassword;
	}
	public void setSPPassword(String sPPassword) {
		SPPassword = sPPassword;
	}
	public String getSPReceivingAmount_Currency() {
		return SPReceivingAmount_Currency;
	}
	public void setSPReceivingAmount_Currency(String sPReceivingAmount_Currency) {
		SPReceivingAmount_Currency = sPReceivingAmount_Currency;
	}
	public String getSPReceivingAmount_Value() {
		return SPReceivingAmount_Value;
	}
	public void setSPReceivingAmount_Value(String sPReceivingAmount_Value) {
		SPReceivingAmount_Value = sPReceivingAmount_Value;
	}
	public String getSPReceivingCard_AccountNumber() {
		return SPReceivingCard_AccountNumber;
	}
	public void setSPReceivingCard_AccountNumber(String sPReceivingCard_AccountNumber) {
		SPReceivingCard_AccountNumber = sPReceivingCard_AccountNumber;
	}
	public String getSPTransactionDate() {
		return SPTransactionDate;
	}
	public void setSPTransactionDate(String sPTransactionDate) {
		SPTransactionDate = sPTransactionDate;
	}
	public String getSPTransactionType() {
		return SPTransactionType;
	}
	public void setSPTransactionType(String sPTransactionType) {
		SPTransactionType = sPTransactionType;
	}
	public String getSPUserName() {
		return SPUserName;
	}
	public void setSPUserName(String sPUserName) {
		SPUserName = sPUserName;
	}
	
	
	
	 

}
