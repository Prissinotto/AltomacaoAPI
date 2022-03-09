package com.keeggo.demo_rest.model;

public class CustomerPagamento {
	
	private String MCCVVNumber; 
	private String MCCardNumber; 
	private String MCCustomerName; 
	private String MCCustomerPhone;
	private String MCExpirationDate;
	private String MCRecevingAmount_Value;
	private String MCRecevingCard_AccountNumber;
	private String MCRecevingCard_Currency;
	private String MCTransactionDate;
	private String MCTransactionType;
	
	/**
	 * @param MCCVVNumber
	 * @param MCCardNumber
	 * @param MCCustomerName
	 * @param MCCustomerPhone
	 * @param MCExpirationDate
	 * @param MCRecevingAmount_Value
	 * @param MCRecevingCard_AccountNumber
	 * @param MCRecevingCard_Currency
	 * @param MCTransactionDate
	 * @param MCTransactionType
	 */
	public CustomerPagamento(String MCCVVNumber,String MCCardNumber,String MCCustomerName,String MCCustomerPhone,String MCExpirationDate,
			String MCRecevingAmount_Value,String MCRecevingCard_AccountNumber,String MCRecevingCard_Currency,String MCTransactionDate,String MCTransactionType) {
		
		this.MCCVVNumber = MCCVVNumber;
		this.MCCardNumber = MCCardNumber;
		this.MCCustomerName = MCCustomerName;
		this.MCCustomerPhone = MCCustomerPhone;
		this.MCExpirationDate = MCExpirationDate;
		this.MCRecevingAmount_Value = MCRecevingAmount_Value;
		this.MCRecevingCard_AccountNumber = MCRecevingCard_AccountNumber;
		this.MCRecevingCard_Currency = MCRecevingCard_Currency;
		this.MCTransactionDate = MCTransactionDate;
		this.MCTransactionType = MCTransactionType;
	}
	
	public CustomerPagamento() {
	
	}
	
	public String getMCCVVNumber() {
		return MCCVVNumber;
	}

	public void setMCCVVNumber(String mCCVVNumber) {
		MCCVVNumber = mCCVVNumber;
	}

	public String getMCCardNumber() {
		return MCCardNumber;
	}

	public void setMCCardNumber(String mCCardNumber) {
		MCCardNumber = mCCardNumber;
	}

	public String getMCCustomerName() {
		return MCCustomerName;
	}

	public void setMCCustomerName(String mCCustomerName) {
		MCCustomerName = mCCustomerName;
	}

	public String getMCCustomerPhone() {
		return MCCustomerPhone;
	}

	public void setMCCustomerPhone(String mCCustomerPhone) {
		MCCustomerPhone = mCCustomerPhone;
	}

	public String getMCExpirationDate() {
		return MCExpirationDate;
	}

	public void setMCExpirationDate(String mCExpirationDate) {
		MCExpirationDate = mCExpirationDate;
	}

	public String getMCRecevingAmount_Value() {
		return MCRecevingAmount_Value;
	}

	public void setMCRecevingAmount_Value(String mCRecevingAmount_Value) {
		MCRecevingAmount_Value = mCRecevingAmount_Value;
	}

	public String getMCRecevingCard_AccountNumber() {
		return MCRecevingCard_AccountNumber;
	}

	public void setMCRecevingCard_AccountNumber(String mCRecevingCard_AccountNumber) {
		MCRecevingCard_AccountNumber = mCRecevingCard_AccountNumber;
	}

	public String getMCRecevingCard_Currency() {
		return MCRecevingCard_Currency;
	}

	public void setMCRecevingCard_Currency(String mCRecevingCard_Currency) {
		MCRecevingCard_Currency = mCRecevingCard_Currency;
	}

	public String getMCTransactionDate() {
		return MCTransactionDate;
	}

	public void setMCTransactionDate(String mCTransactionDate) {
		MCTransactionDate = mCTransactionDate;
	}

	public String getMCTransactionType() {
		return MCTransactionType;
	}

	public void setMCTransactionType(String mCTransactionType) {
		MCTransactionType = mCTransactionType;
	}

}
