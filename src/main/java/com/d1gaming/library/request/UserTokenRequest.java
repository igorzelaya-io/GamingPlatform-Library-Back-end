package com.d1gaming.library.request;

import com.d1gaming.library.service.D1Service;
import com.d1gaming.library.user.User;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public class UserTokenRequest {

	@JsonProperty
	private User user;
	
	@JsonProperty
	private D1Service service;

	public UserTokenRequest() {
		
	}
	
	public UserTokenRequest(User user, D1Service service) {
		this.user = user;
		this.service = service;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public D1Service getService() {
		return service;
	}

	public void setService(D1Service service) {
		this.service = service;
	}
	
}
