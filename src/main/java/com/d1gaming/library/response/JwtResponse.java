package com.d1gaming.library.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public class JwtResponse {

	@JsonProperty
	private String token;
	
	@JsonIgnore
	private String type = "Bearer";
	
	@JsonIgnore
	private String username;
	
	@JsonProperty
	private String id;
	
	@JsonIgnore
	private String email;
	
	@JsonIgnore
	private List<String> roles;
	
	public JwtResponse(String accessToken) {
		this.token = accessToken;
	}
	
	public JwtResponse(String accessToken, String userId, String username, String email, List<String> roles) {
		this.token = accessToken;
		this.id = userId;
		this.username = username;
		this.email = email;
		this.roles = roles;
	}
	
	public JwtResponse(String accessToken, String userId) {
		this.token = accessToken;
		this.id = userId;
	}

	public String getAccessToken() {
		return token;
	}

	@JsonIgnore
	public void setAccessToken(String accessToken) {
		this.token = accessToken;
	}

	public String getTokenType() {
		return type;
	}

	@JsonIgnore
	public void setTokenType(String tokenType) {
		this.type = tokenType;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public List<String> getRoles() {
		return roles;
	}

}
