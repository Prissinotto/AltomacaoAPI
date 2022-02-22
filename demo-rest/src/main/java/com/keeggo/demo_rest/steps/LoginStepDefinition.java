package com.keeggo.demo_rest.steps;

import org.springframework.beans.factory.annotation.Autowired;

import com.keeggo.demo_rest.controllers.LoginController;
import com.keeggo.demo_rest.model.CustomerDetails;
import com.keeggo.rest_assured_connector.driver.RequestHTTPManager;
import com.keeggo.rest_assured_connector.report.exception.EvidenceNotCatchException;

import cucumber.api.java.pt.Dado;

public class LoginStepDefinition {

	private LoginController loginController;

	@Autowired
	public LoginStepDefinition(RequestHTTPManager httpManager) {
		this.loginController = new LoginController(httpManager);
	}

	@Dado("que faço login na api com o nome {string} e senha {string}")
	public void que_faço_uma_requisição_para_obter_todos_as_aplicações(String nome, String senha) throws EvidenceNotCatchException {
		this.loginController.login(new CustomerDetails(nome, senha));
		//this.loginController.testeStatus();
	}

	
}
