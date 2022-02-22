package com.keeggo.demo_rest.controllers;

import org.hamcrest.Matchers;
import org.hamcrest.xml.HasXPath;

import com.keeggo.demo_rest.model.CustomerDetails;
import com.keeggo.rest_assured_connector.driver.RequestHTTPManager;

import io.restassured.http.ContentType;

public class LoginController {

	private RequestHTTPManager httpManager;
	
	public LoginController(RequestHTTPManager httpManager) {
		this.httpManager = httpManager;
	}

	public void login(CustomerDetails customerDetails) {
		this.httpManager.get("login")
				.given()
					.log().all()
					.body(customerDetails)
					.headers("Content-Type", "application/json")
					.post()
				.then()
					.log().all()
					.statusCode(200)
				;
	}
	
	public void testeStatus() {
		this.httpManager.get()
			.given()
				.log().all()
			.when()
				.get("http://labmobile.rsinet.com.br/integration8/en/#/dashboard")
			.then()
				.log().all()
				.statusCode(200)
			;
	}
}
