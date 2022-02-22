package com.keeggo.demo_rest.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class CurrentReservation {

	@SerializedName("owner")
	@Expose
	private String owner;
	@SerializedName("status")
	@Expose
	private String status;
	@SerializedName("startTime")
	@Expose
	private long startTime;
	@SerializedName("endTime")
	@Expose
	private long endTime;

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public long getStartTime() {
		return startTime;
	}

	public void setStartTime(long startTime) {
		this.startTime = startTime;
	}

	public long getEndTime() {
		return endTime;
	}

	public void setEndTime(long endTime) {
		this.endTime = endTime;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("owner", owner).append("status", status).append("startTime", startTime)
				.append("endTime", endTime).toString();
	}

}