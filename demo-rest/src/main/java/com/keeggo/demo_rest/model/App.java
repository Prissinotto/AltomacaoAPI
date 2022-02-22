package com.keeggo.demo_rest.model;

public class App {

	private String name;

	private String appVersion;

	private String identifier;

	private String platform;

	public App() {
	}

	public App(String name) {
		this.name = name;
	}

	/**
	 * @param name
	 * @param appVersion
	 */
	public App(String name, String identifier, String appVersion, String platform) {
		this.name = name;
		this.identifier = identifier;
		this.appVersion = appVersion;
		this.platform = platform;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAppVersion() {
		return appVersion;
	}

	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}

	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public String getPlatform() {
		return this.platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof App)
			return ((App) obj).getIdentifier().equals(this.getIdentifier());
		return super.equals(obj);
	}
}
