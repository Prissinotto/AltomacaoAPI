package com.keeggo.demo_rest.steps;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;

import com.keeggo.demo_rest.controllers.AccountServiceController;
import com.keeggo.demo_rest.controllers.MasterCreditController;
import com.keeggo.demo_rest.model.CustomerMasterCredit;
import com.keeggo.demo_rest.model.CustomerPagamento;
import com.keeggo.demo_rest.model.CustomerShoppingLogin;
import com.keeggo.rest_assured_connector.driver.RequestHTTPManager;

import cucumber.api.java.pt.Entao;

public class PagamentoStepDefinition {
	
	private MasterCreditController masterCreditController;
	private AccountServiceController accountServiceController;
	Random random = new Random();
	private int numero = random.nextInt(100);

	@Autowired
	public PagamentoStepDefinition(RequestHTTPManager httpManager) {
		this.masterCreditController = new MasterCreditController(httpManager);
		this.accountServiceController = new AccountServiceController(httpManager);
	}

	@Entao("o usuario realiza o pagamento {string} {string} {string} {string} {string} {string} {string} {string} {string} {string}") 
	public void oUsuarioRealizaOPagamento(String MCCVVNumber,String MCCardNumber,String MCCustomerName,String MCCustomerPhone,
			String MCExpirationDate,String MCRecevingAmount_Value,String MCRecevingCard_AccountNumber,String MCRecevingCard_Currency,
			String MCTransactionDate,String MCTransactionType) throws Throwable{
		this.masterCreditController.realizarPagamento(new CustomerPagamento( MCCVVNumber, MCCardNumber, MCCustomerName, MCCustomerPhone, MCExpirationDate,
			 MCRecevingAmount_Value, MCRecevingCard_AccountNumber, MCRecevingCard_Currency, MCTransactionDate, MCTransactionType));
		
	
	}

	@Entao("o usuario adiciona um cartao de credito {string} {string} {string} {string} {string} {string} {string} {string} {string}") 
	public void oUsuarioAdicionaUmCartaoDeCredito(String email, String password, String loginName, String accountId,String base64Token,String cardNumber,String customerName,String cvvNumber,String expirationDate) throws Throwable{
		this.accountServiceController.adicionarCartaoDeCredito(new CustomerShoppingLogin(email, password, loginName), new CustomerMasterCredit(accountId, base64Token, cardNumber, customerName + Integer.toString(numero), cvvNumber, expirationDate));
	}


}
