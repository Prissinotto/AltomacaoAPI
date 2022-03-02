package com.keeggo.demo_rest.steps;

import org.springframework.beans.factory.annotation.Autowired;

import com.keeggo.demo_rest.controllers.MasterCreditController;
import com.keeggo.demo_rest.model.CustomerPagamento;
import com.keeggo.rest_assured_connector.driver.RequestHTTPManager;

import cucumber.api.java.pt.Entao;

public class PagamentoStepDefinition {
	
	private MasterCreditController masterCreditController;

	@Autowired
	public PagamentoStepDefinition(RequestHTTPManager httpManager) {
		this.masterCreditController = new MasterCreditController(httpManager);
	}

	@Entao("o usuario realiza o pagamento {string} {string} {string} {string} {string} {string} {string} {string} {string} {string}") 
	public void oUsuarioRealizaOPagamento(String MCCVVNumber,String MCCardNumber,String MCCustomerName,String MCCustomerPhone,
			String MCExpirationDate,String MCRecevingAmount_Value,String MCRecevingCard_AccountNumber,String MCRecevingCard_Currency,
			String MCTransactionDate,String MCTransactionType) throws Throwable{
		masterCreditController.realizarPagamento(new CustomerPagamento( MCCVVNumber, MCCardNumber, MCCustomerName, MCCustomerPhone, MCExpirationDate,
			 MCRecevingAmount_Value, MCRecevingCard_AccountNumber, MCRecevingCard_Currency, MCTransactionDate, MCTransactionType));
		
	
	}


}
