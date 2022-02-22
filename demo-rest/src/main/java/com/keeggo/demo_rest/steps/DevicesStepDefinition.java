package com.keeggo.demo_rest.steps;

import org.springframework.beans.factory.annotation.Autowired;

import com.keeggo.demo_rest.controllers.DeviceController;
import com.keeggo.rest_assured_connector.driver.RequestHTTPManager;

import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;

public class DevicesStepDefinition {

	private DeviceController deviceController;

	@Autowired
	public DevicesStepDefinition(RequestHTTPManager httpManager) {
		this.deviceController = new DeviceController(httpManager);
	}

	@E("obtenho os devices disponíveis")
	public void obtenho_os_devices_conectados() {
		this.deviceController.getDevices();
	}
	
	@Entao("valido se existem dispositivos disponíveis")
	public void valido_se_existem_dispositivos_disponíveis() {
		this.deviceController.checkDevices();
	}
}
