package com.d1gaming.library.service;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public class D1Service {

	@JsonProperty
	private String serviceId;
	
	@JsonProperty
	private ServiceChargeType serviceChargeType;

	@JsonProperty
	private double serviceChargeAmount;

	@JsonProperty
	private String serviceDescription;
	
	D1Service(){
		
	}
	
	public D1Service(ServiceChargeType serviceChargeType, double serviceChargeAmount,
			String serviceDescription) {
		super();
		this.serviceChargeType = serviceChargeType;
		this.serviceChargeAmount = serviceChargeAmount;
		this.serviceDescription = serviceDescription;
	}
}