package com.keeggo.demo_rest.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Device {

	@SerializedName("platformName")
	@Expose
	private String platformName;
	@SerializedName("platformVersion")
	@Expose
	private String platformVersion;
	@SerializedName("deviceName")
	@Expose
	private String deviceName;
	@SerializedName("udid")
	@Expose
	private String udid;
	@SerializedName("deviceType")
	@Expose
	private String deviceType;
	@SerializedName("deviceHostingType")
	@Expose
	private String deviceHostingType;
	@SerializedName("apiLevel")
	@Expose
	private String apiLevel;
	@SerializedName("nickName")
	@Expose
	private String nickName;
	@SerializedName("connected")
	@Expose
	private boolean connected;
	@SerializedName("currentReservation")
	@Expose
	private CurrentReservation currentReservation;
	@SerializedName("connectorName")
	@Expose
	private String connectorName;
	@SerializedName("workspaceName")
	@Expose
	private String workspaceName;
	@SerializedName("healthStatus")
	@Expose
	private HealthStatus healthStatus;
	@SerializedName("localLanguage")
	@Expose
	private String localLanguage;
	@SerializedName("localCountry")
	@Expose
	private String localCountry;

	public String getPlatformName() {
		return platformName;
	}

	public void setPlatformName(String platformName) {
		this.platformName = platformName;
	}

	public String getPlatformVersion() {
		return platformVersion;
	}

	public void setPlatformVersion(String platformVersion) {
		this.platformVersion = platformVersion;
	}

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public String getUdid() {
		return udid;
	}

	public void setUdid(String udid) {
		this.udid = udid;
	}

	public String getDeviceType() {
		return deviceType;
	}

	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	public String getDeviceHostingType() {
		return deviceHostingType;
	}

	public void setDeviceHostingType(String deviceHostingType) {
		this.deviceHostingType = deviceHostingType;
	}

	public String getApiLevel() {
		return apiLevel;
	}

	public void setApiLevel(String apiLevel) {
		this.apiLevel = apiLevel;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public boolean isConnected() {
		return connected;
	}

	public void setConnected(boolean connected) {
		this.connected = connected;
	}

	public CurrentReservation getCurrentReservation() {
		return currentReservation;
	}

	public void setCurrentReservation(CurrentReservation currentReservation) {
		this.currentReservation = currentReservation;
	}

	public String getConnectorName() {
		return connectorName;
	}

	public void setConnectorName(String connectorName) {
		this.connectorName = connectorName;
	}

	public String getWorkspaceName() {
		return workspaceName;
	}

	public void setWorkspaceName(String workspaceName) {
		this.workspaceName = workspaceName;
	}

	public HealthStatus getHealthStatus() {
		return healthStatus;
	}

	public void setHealthStatus(HealthStatus healthStatus) {
		this.healthStatus = healthStatus;
	}

	public String getLocalLanguage() {
		return localLanguage;
	}

	public void setLocalLanguage(String localLanguage) {
		this.localLanguage = localLanguage;
	}

	public String getLocalCountry() {
		return localCountry;
	}

	public void setLocalCountry(String localCountry) {
		this.localCountry = localCountry;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("platformName", platformName).append("platformVersion", platformVersion)
				.append("deviceName", deviceName).append("udid", udid).append("deviceType", deviceType)
				.append("deviceHostingType", deviceHostingType).append("apiLevel", apiLevel)
				.append("nickName", nickName).append("connected", connected)
				.append("currentReservation", currentReservation).append("connectorName", connectorName)
				.append("workspaceName", workspaceName).append("healthStatus", healthStatus)
				.append("localLanguage", localLanguage).append("localCountry", localCountry).toString();
	}

}