package com.keeggo.demo_rest.steps;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

import com.keeggo.demo_rest.controllers.AccountServiceController;
import com.keeggo.demo_rest.model.CustomerShopping;
import com.keeggo.rest_assured_connector.driver.RequestHTTPManager;

import cucumber.api.java.pt.Entao;

public class CadastroUsuarioStepDefinition {

	private AccountServiceController accountServiceController;

	@Autowired
	public CadastroUsuarioStepDefinition(RequestHTTPManager httpManager) {
		this.accountServiceController = new AccountServiceController(httpManager);
	}
	
	@Entao("o usuario cria uma conta de usuario {string}{string}{string}{string}{string}{string}{string}{string}{string}{string}{string}{string}{string}{string}")
	public void oUsuarioCriaUmaContaDeUsuario(String accountType, String address, String allowOffersPromotion, String aobUser, String cityName, String country, String email, String firstName, String lastName, String loginName, String password, String phoneNumber, String stateProvince, String zipcode) {
		Date dtf = new Date();
		accountServiceController.cadastraUsuario(new CustomerShopping(accountType, address, allowOffersPromotion,  aobUser,  cityName,  country,  email,  firstName,  lastName,  loginName + dtf.getTime(),  password,  phoneNumber,  stateProvince,  zipcode));
	}
}
