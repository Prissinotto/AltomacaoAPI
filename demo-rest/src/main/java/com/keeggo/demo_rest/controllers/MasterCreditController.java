package com.keeggo.demo_rest.controllers;

import static org.hamcrest.Matchers.*;

import com.keeggo.demo_rest.model.CustomerPagamento;
import com.keeggo.rest_assured_connector.driver.RequestHTTPManager;

public class MasterCreditController {
	
	private RequestHTTPManager httpManager;

	public MasterCreditController(RequestHTTPManager httpManager) {
		this.httpManager = httpManager;
	}
	
	public void realizarPagamento(CustomerPagamento customerPagamento) {
		this.httpManager.get()
		.given()
			.log().all()
			.body("{" + "\"MCCVVNumber\"" + ":" + "\"" + customerPagamento.getMCCVVNumber() + "\"" + "," +
					"\"MCCardNumber\"" + ":" + "\"" + customerPagamento.getMCCardNumber() + "\"" + "," +
					"\"MCCustomerName\"" + ":" + "\"" + customerPagamento.getMCCustomerName() + "\"" + "," +
					"\"MCCustomerPhone\"" + ":" + "\"" + customerPagamento.getMCCustomerPhone() + "\"" + "," +
					"\"MCExpirationDate\"" + ":" + "\"" + customerPagamento.getMCExpirationDate() + "\"" + "," +
					"\"MCRecevingAmount.Value\"" + ":" + "\"" + customerPagamento.getMCRecevingAmount_Value() + "\"" + "," +
					"\"MCRecevingCard.AccountNumber\"" + ":" + "\"" + customerPagamento.getMCRecevingCard_AccountNumber() + "\"" + "," +
					"\"MCRecevingCard.Currency\"" + ":" + "\"" + customerPagamento.getMCRecevingCard_Currency() + "\"" + "," +
					"\"MCTransactionDate\"" + ":" + "\"" + customerPagamento.getMCTransactionDate() + "\"" + "," +
					"\"MCTransactionType\"" + ":" + "\"" + customerPagamento.getMCTransactionType() + "\"" + "}"
					)
			//.body(customerPagamento)
		 	.headers("Content-Type", "application/json")
			.post("/MasterCredit/api/v1/payments/payment")
		.then()
			.log().all()
			.statusCode(201)
			.body("MCResponse.Reason", hasItem("Approved"))
		;
	}

}
