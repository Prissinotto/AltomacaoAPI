package com.keeggo.demo_rest.controllers;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.hamcrest.Matchers;
import org.joda.time.format.DateTimeFormat;

import com.keeggo.demo_rest.model.CustomerCarrinho;
import com.keeggo.demo_rest.model.CustomerDetails;
import com.keeggo.demo_rest.model.CustomerShopping;
import com.keeggo.demo_rest.model.CustomerShoppingLogin;
import com.keeggo.rest_assured_connector.driver.RequestHTTPManager;

import io.restassured.http.ContentType;

public class AccountServiceController {

	private RequestHTTPManager httpManager;
	private String token;

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
		 	.log().all()
			//.body("{  \"accountType\": "+arg1+",  \"address\": "+arg2+",  \"allowOffersPromotion\": true,  \"aobUser\": true,  \"cityName\": "+arg5+",  \"country\": \"AUSTRALIA_AU\",  \"email\": "+arg7+",  \"firstName\": "+arg8+",  \"lastName\": "+arg9+",  \"loginName\": "+arg10+",  \"password\": "+arg11+",  \"phoneNumber\": "+arg12+",  \"stateProvince\": "+arg13+",  \"zipcode\": "+arg14+"}")
		 	//.body("{  \"accountType\": \"USER\",  \"address\": \"endereco\",  \"allowOffersPromotion\": true,  \"aobUser\": true,  \"cityName\": \"cidade\",  \"country\": \"AUSTRALIA_AU\",  \"email\": \"teste@gmail.com\",  \"firstName\": \"Pedrot\",  \"lastName\": \"SilvaT\",  \"loginName\": \"PedroSilvat\",  \"password\": \"Teste@123\",  \"phoneNumber\": \"1199665544\",  \"stateProvince\": \"estado\",  \"zipcode\": \"0223654\"}")
		 	.body(customerShopping)
		 	.headers("Content-Type", "application/json")
			.post("/accountservice/accountrest/api/v1/register")
		.then()
			.log().all()
			.statusCode(200)
//gerar um login name aleatorio 
		;
	}
	
	public void realizarLogin(CustomerShoppingLogin customerShoppingLogin) {
		this.httpManager.get()
		.given()
		 	.log().all()
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
		 	.log().all()
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
		 	.log().all()
		 	.header("Authorization", "Bearer " +realizarLoginRetornandoToken(customerShoppingLogin))
		 .when()
			.post("/order/api/v1/carts/"+customerCarrinho.getUserId()+"/product/"+customerCarrinho.getProductId()+"/color/"+customerCarrinho.getColor()+"?hasWarranty=false&quantity="+customerCarrinho.getQuantidade()+"")
		.then()
			.log().all()
			.statusCode(201);
	}
}
	

	


