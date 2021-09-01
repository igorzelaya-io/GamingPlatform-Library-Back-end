package com.d1gaming.library.role;

import java.io.Serializable;

import org.springframework.security.core.GrantedAuthority;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;


@JsonSerialize
public class Role implements GrantedAuthority, Serializable {

	private static final long serialVersionUID = 1L;

	public static final String PLAYER = "PLAYER";
	
	public static final String ADMIN = "ADMIN";
	
	public static final String TOURNEY_ADMIN = "TOURNEY_ADMIN";
	
	public static final String CHALLENGE_ADMIN = "CHALLENGE_ADMIN";
	
	public static final String TEAM_ADMIN = "TEAM_ADMIN";

	@JsonProperty
	private String authority;
	
	public Role() {
		super();
	}
	
	public Role(String authority) {
		this.authority = authority;
	}
	
	@Override
	public String getAuthority() {
		return this.authority;
	}
	
	public void setAuthority(String authority) {
		this.authority = authority;
	}


}