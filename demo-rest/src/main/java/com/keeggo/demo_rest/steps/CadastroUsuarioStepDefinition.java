package com.keeggo.demo_rest.steps;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

import com.keeggo.demo_rest.controllers.AccountServiceController;
import com.keeggo.demo_rest.model.CustomerCarrinho;
import com.keeggo.demo_rest.model.CustomerDetails;
import com.keeggo.demo_rest.model.CustomerShopping;
import com.keeggo.demo_rest.model.CustomerShoppingLogin;
import com.keeggo.rest_assured_connector.driver.RequestHTTPManager;
import com.keeggo.rest_assured_connector.report.exception.EvidenceNotCatchException;

import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;

public class CadastroUsuarioStepDefinition {

	private AccountServiceController accountServiceController;

	@Autowired
	public CadastroUsuarioStepDefinition(RequestHTTPManager httpManager) {
		this.accountServiceController = new AccountServiceController(httpManager);
	}
	
	@Dado("^que o usuario acesse a pagina \"([^\"]*)\"$") 
	public void queOUsuarioAcesseAPagina(String url) throws Throwable{
		accountServiceController.testarServico(url);
	}
	
	@Entao("o usuario cria uma conta de usuario {string}{string}{string}{string}{string}{string}{string}{string}{string}{string}{string}{string}{string}{string}")
	public void oUsuarioCriaUmaContaDeUsuario(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12, String string13, String string14) {
		Date dtf = new Date();
		accountServiceController.cadastraUsuario(new CustomerShopping(string, string2, string3,  string4,  string5,  string6,  string7,  string8,  string9,  string10 + dtf.getTime(),  string11,  string12,  string13,  string14));
	
	}

	@E("realiza o login  com {string} {string} {string}")
	public void realizaOLoginCom(String string, String string2, String string3){
		accountServiceController.realizarLogin(new CustomerShoppingLogin(string, string2, string3));
	}


	@E("adicionar um produto ao carrinho {string} {string} {string} {string} {string} {string} {string}")
	public void adicionarUmProdutoAoCarrinho(String string, String string2, String string3, String color, String productId, String quantidade, String UserId) throws Throwable {
		accountServiceController.adicionarProdutoNoCarrinho(new CustomerShoppingLogin(string, string2, string3), new CustomerCarrinho(color, productId, quantidade, UserId));
		
	}

	

}
