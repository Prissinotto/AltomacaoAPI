package com.keeggo.demo_rest.steps;

import org.springframework.beans.factory.annotation.Autowired;

import com.keeggo.demo_rest.controllers.PostsController;
import com.keeggo.rest_assured_connector.driver.RequestHTTPManager;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;

public class PostsStepDefinition {

	private PostsController postsController;
	
	@Autowired
	public PostsStepDefinition(RequestHTTPManager httpManager) {
		this.postsController = new PostsController(httpManager);
	}
	
	@Dado("^que o usuario acesse a pagina post$") 
	public void queOUsuarioAcesseAPaginaPost() throws Throwable{
		postsController.testeAcessoPosts();
	}

	@Entao("^a pagina apresenta \"([^\"]*)\" usuarios cadastrados$") 
	public void aPaginaApresentaUsuariosCadastrados(int quantidade) throws Throwable{
		postsController.validarQuantUsuarioCadastrado(quantidade);
	}

}
