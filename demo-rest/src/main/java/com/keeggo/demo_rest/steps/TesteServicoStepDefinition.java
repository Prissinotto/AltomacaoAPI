package com.keeggo.demo_rest.steps;

import org.springframework.beans.factory.annotation.Autowired;

import com.keeggo.demo_rest.controllers.AccountServiceController;
import com.keeggo.rest_assured_connector.driver.RequestHTTPManager;

import cucumber.api.java.pt.Dado;

public class TesteServicoStepDefinition {

	private AccountServiceController accountServiceController;

	@Autowired
	public TesteServicoStepDefinition(RequestHTTPManager httpManager) {
		this.accountServiceController = new AccountServiceController(httpManager);
	}
	
	@Dado("^que o sistema \"([^\"]*)\" esteja acessivel$") 
	public void queOSistemaEstejaAcessivel(String url) throws Throwable{
		accountServiceController.testarServico(url);
	}
}
