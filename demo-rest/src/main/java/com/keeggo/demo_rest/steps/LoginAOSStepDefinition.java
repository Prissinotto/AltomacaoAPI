package com.keeggo.demo_rest.steps;

import org.springframework.beans.factory.annotation.Autowired;

import com.keeggo.demo_rest.controllers.AccountServiceController;
import com.keeggo.demo_rest.model.CustomerShoppingLogin;
import com.keeggo.rest_assured_connector.driver.RequestHTTPManager;

import cucumber.api.java.pt.E;

public class LoginAOSStepDefinition {
	
	private AccountServiceController accountServiceController;

	@Autowired
	public LoginAOSStepDefinition(RequestHTTPManager httpManager) {
		this.accountServiceController = new AccountServiceController(httpManager);
	}

	@E("o usuario realiza o login  com {string} {string} {string}")
	public void realizaOLoginCom(String string, String string2, String string3){
		accountServiceController.realizarLogin(new CustomerShoppingLogin(string, string2, string3));
	}
}
