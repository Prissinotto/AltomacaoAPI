package com.keeggo.demo_rest.controllers;

import static org.hamcrest.Matchers.containsString;

import com.keeggo.demo_rest.model.CustomerCarrinho;
import com.keeggo.demo_rest.model.CustomerShopping;
import com.keeggo.demo_rest.model.CustomerShoppingLogin;
import com.keeggo.rest_assured_connector.driver.RequestHTTPManager;

public class AccountServiceController {

	private RequestHTTPManager httpManager;

	public AccountServiceController(RequestHTTPManager httpManager) {
		this.httpManager = httpManager;
	}
	
	public void testarServico(String url) {
		this.httpManager.get()
		.given()
		.when()
			.get(url)
		.then()	
			.log().all()
			.statusCode(200)
			.body(containsString("Success"))
		;
	}
	
	public void cadastraUsuario(CustomerShopping customerShopping) {
		this.httpManager.get()
		.given()
			.body(customerShopping)
		 	.headers("Content-Type", "application/json")
			.post("/accountservice/accountrest/api/v1/register")
		.then()
			.log().all()
			.statusCode(200)
		;
	}
	
	public void realizarLogin(CustomerShoppingLogin customerShoppingLogin) {
		this.httpManager.get()
		.given()
			.body(customerShoppingLogin)
		 	.headers("Content-Type", "application/json")
			.post("/accountservice/accountrest/api/v1/login")
		.then()
			.log().all()
			.statusCode(200);
	}
	
	public String realizarLoginRetornandoToken(CustomerShoppingLogin customerShoppingLogin) {
		String token = this.httpManager.get()
		.given()
			.body(customerShoppingLogin)
		 	.headers("Content-Type", "application/json")
			.post("/accountservice/accountrest/api/v1/login")
		.then()
			.log().all()
			.statusCode(200)
			.extract().path("statusMessage.token");
		
		return token;
	}
	
	public void adicionarProdutoNoCarrinho(CustomerShoppingLogin customerShoppingLogin, CustomerCarrinho customerCarrinho ) {
		this.httpManager.get()
		.given()
		 	.header("Authorization", "Bearer " +realizarLoginRetornandoToken(customerShoppingLogin))
		 .when()
			.post("/order/api/v1/carts/"+customerCarrinho.getUserId()+"/product/"+customerCarrinho.getProductId()+"/color/"+customerCarrinho.getColor()+"?hasWarranty=false&quantity="+customerCarrinho.getQuantidade()+"")
		.then()
			.log().all()
			.statusCode(201);
	}
}
	

	


