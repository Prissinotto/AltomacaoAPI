package com.keeggo.demo_rest.steps;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

import com.keeggo.demo_rest.controllers.SafePayController;
import com.keeggo.demo_rest.model.CustomerSafePay;
import com.keeggo.rest_assured_connector.driver.RequestHTTPManager;


import cucumber.api.java.pt.Entao;

public class SafePayStepDefinition {
 
	private SafePayController safePayController;
	
	@Autowired
	public SafePayStepDefinition(RequestHTTPManager httpManager) {
		this.safePayController = new SafePayController(httpManager);
	}
	
	@Entao("o usuario raliza o pagamento com safePay {string} {string} {string} {string} {string} {string} {string} {string}")
	public void adicionarUmProdutoAoCarrinho(String SPCustomerPhone, String SPPassword, String SPReceivingAmount_Currency, String SPReceivingAmount_Value, String SPReceivingCard_AccountNumber, String SPTransactionDate, String SPTransactionType, String SPUserName){
		
		Date data = new Date(System.currentTimeMillis()); 
		SimpleDateFormat formatarDate = new SimpleDateFormat("MMddyyyy"); 
		safePayController.realizarPagamentoSafePay(new CustomerSafePay(SPCustomerPhone, SPPassword, SPReceivingAmount_Currency, SPReceivingAmount_Value, SPReceivingCard_AccountNumber, formatarDate.format(data), SPTransactionType, SPUserName) );
		
	}
	

}
