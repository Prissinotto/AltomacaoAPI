package com.keeggo.demo_rest.controllers;


import com.keeggo.demo_rest.model.CustomerSafePay;
import com.keeggo.rest_assured_connector.driver.RequestHTTPManager;

public class SafePayController {
	
	private RequestHTTPManager httpManager;

	public SafePayController(RequestHTTPManager httpManager) {
		this.httpManager = httpManager;
	}
	
	public void realizarPagamentoSafePay(CustomerSafePay customerSafePay) {
		this.httpManager.get()
		.given()
			.log().all()
			.body("{\"SPCustomerPhone\": \""+customerSafePay.getSPCustomerPhone()+"\",\"SPPassword\": \""+customerSafePay.getSPPassword()+"\",\"SPReceivingAmount.Currency\": \""+customerSafePay.getSPReceivingAmount_Currency()+"\",\"SPReceivingAmount.Value\": "+customerSafePay.getSPReceivingAmount_Value()+",\"SPReceivingCard.AccountNumber\": "+customerSafePay.getSPReceivingCard_AccountNumber()+",\"SPTransactionDate\": \""+customerSafePay.getSPTransactionDate()+"\",\"SPTransactionType\": \""+customerSafePay.getSPTransactionType()+"\",\"SPUserName\": \""+customerSafePay.getSPUserName()+"\"}")
		 	.headers("Content-Type", "application/json")
		 .when()
			.post("/SafePay/api/v1/payments/payment")
		.then()
			.log().all()
			.statusCode(201)
		;
		
		
	}

}
