package com.keeggo.demo_rest.model;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class HealthStatus {

	@SerializedName("message")
	@Expose
	private List<String> message = new ArrayList<String>();
	@SerializedName("error")
	@Expose
	private boolean error;

	public List<String> getMessage() {
		return message;
	}

	public void setMessage(List<String> message) {
		this.message = message;
	}

	public boolean isError() {
		return error;
	}

	public void setError(boolean error) {
		this.error = error;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("message", message).append("error", error).toString();
	}

}