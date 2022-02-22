package com.keeggo.demo_rest.controllers;

import static org.hamcrest.Matchers.*;

import org.hamcrest.Matchers;

import com.keeggo.rest_assured_connector.driver.RequestHTTPManager;

public class PostsController {
	
	private RequestHTTPManager httpManager;

	public PostsController(RequestHTTPManager httpManager) {
		this.httpManager = httpManager;
	}
	
	public void testeAcessoPosts(){
		this.httpManager.get()
		.given()
			.log().all()
		.when()
			.get("/posts")
		.then()	
			.log().all()
			.statusCode(200)
			//.body("title[0]", Matchers.is("sunt aut facere repellat provident occaecati excepturi optio reprehenderit"))
		;
	}
	
	public void validarQuantUsuarioCadastrado(int quantidade){
		this.httpManager.get()
		.given()
		.when()
			.get("/posts/1")
		.then()	
			.log().all()
			.statusCode(200)
			//.body("id.size()",is(quantidade))
			.body("id", is(quantidade))
			
		;
	}
}
