package com.keeggo.demo_rest.controllers;

import com.keeggo.demo_rest.model.CustomerCarrinho;
import com.keeggo.demo_rest.model.CustomerShoppingLogin;
import com.keeggo.rest_assured_connector.driver.RequestHTTPManager;

public class OrderController {
	
	private RequestHTTPManager httpManager;
	private AccountServiceController accountServiceController = new AccountServiceController(httpManager);

	public OrderController(RequestHTTPManager httpManager) {
		this.httpManager = httpManager;
	}
	
	public void adicionarProdutoNoCarrinho(CustomerShoppingLogin customerShoppingLogin, CustomerCarrinho customerCarrinho ) {
		this.httpManager.get()
		.given()
		 	.header("Authorization", "Bearer " + accountServiceController.realizarLoginRetornandoToken(customerShoppingLogin))
		 .when()
			.post("/order/api/v1/carts/"+customerCarrinho.getUserId()+"/product/"+customerCarrinho.getProductId()+"/color/"+customerCarrinho.getColor()+"?hasWarranty=false&quantity="+customerCarrinho.getQuantidade()+"")
		.then()
			.log().all()
			.statusCode(201);
	}

}
