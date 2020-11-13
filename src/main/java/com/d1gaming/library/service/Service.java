package com.d1gaming.library.service;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public class Service {

	@JsonProperty
	private String serviceId;
	
	@JsonProperty
	private ServiceChargeType serviceChargeType;

	@JsonProperty
	private double serviceChargeAmount;

	@JsonProperty
	private String serviceDescription;
	
	Service(){
		
	}
	

}
