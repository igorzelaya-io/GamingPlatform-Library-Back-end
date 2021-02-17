package com.d1gaming.library.request;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public class UserRolesModel {
	
	@JsonProperty
	private Set<String> userRoles;
	
	public UserRolesModel(Set<String> userRoles) {
		this.userRoles = userRoles;
	}
	
	public UserRolesModel() {
		super();
	}

	public Set<String> getUserRoles() {
		return userRoles;
	}

	public void setUserRoles(Set<String> userRoles) {
		this.userRoles = userRoles;
	}

}
