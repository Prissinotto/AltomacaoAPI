package com.keeggo.demo_rest.controllers;

import java.lang.reflect.Type;
import java.util.List;

import org.springframework.util.Assert;

import com.google.gson.reflect.TypeToken;
import com.keeggo.demo_rest.model.Device;
import com.keeggo.rest_assured_connector.driver.RequestHTTPManager;
import com.keeggo.rest_assured_connector.request.HttpContext;

public class DeviceController {

	private static final String REST_DEVICE_CONTENT = "rest/deviceContent";
	
	private RequestHTTPManager httpManager;

	public DeviceController(RequestHTTPManager httpManager) {
		this.httpManager = httpManager;
	}

	public void getDevices() {
		HttpContext loginRequest = this.httpManager.getHttpContextService().getHttpContext("login");
		this.httpManager.get("getDevices")
				.given()
				.cookies("JSESSIONID", loginRequest.getResponse().getCookie("JSESSIONID"))
				.headers("x-hp4msecret", loginRequest.getResponse().getHeader("x-hp4msecret"))
				.get(REST_DEVICE_CONTENT)
				.then()
					.statusCode(200);
	}
	
	public void checkDevices() {
		HttpContext devicesRequest = this.httpManager.getHttpContextService().getHttpContext("getDevices");
		Type type = new TypeToken<List<Device>>(){}.getType();
		List<Device> devices = devicesRequest.getResponse().getBody().as(type);
		Assert.notEmpty(devices, "Nenhum device retornado");
	}
}
