package com.d1gaming.library.service;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public class D1Service {

	@JsonProperty
	private String serviceId;
	
	@JsonProperty
	private String serviceName;
	
	@JsonProperty
	private ServiceChargeType serviceChargeType;

	@JsonProperty
	private double serviceChargeAmount;

	@JsonProperty
	private String serviceDescription;
	
	D1Service(){
		super();
	}
	
	public D1Service(String serviceName, ServiceChargeType serviceChargeType, double serviceChargeAmount,
			String serviceDescription) {
		super();
		this.serviceChargeType = serviceChargeType;
		this.serviceChargeAmount = serviceChargeAmount;
		this.serviceDescription = serviceDescription;
	}

	public String getServiceId() {
		return serviceId;
	}

	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public ServiceChargeType getServiceChargeType() {
		return serviceChargeType;
	}

	public void setServiceChargeType(ServiceChargeType serviceChargeType) {
		this.serviceChargeType = serviceChargeType;
	}

	public double getServiceChargeAmount() {
		return serviceChargeAmount;
	}

	public void setServiceChargeAmount(double serviceChargeAmount) {
		this.serviceChargeAmount = serviceChargeAmount;
	}

	public String getServiceDescription() {
		return serviceDescription;
	}

	public void setServiceDescription(String serviceDescription) {
		this.serviceDescription = serviceDescription;
	}
	
	
}