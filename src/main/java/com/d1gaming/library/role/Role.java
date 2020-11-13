package com.d1gaming.library.role;

import org.springframework.security.core.GrantedAuthority;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;


@JsonSerialize
public class Role implements GrantedAuthority {
	Role(){
		
	}
	
	public static final String USER_ADMIN = "USER_ADMIN";
	
	public static final String CHALLENGE_ADMIN = "CHALLENGE_ADMIN";
	
	public static final String TOURNEY_ADMIN = "TOURNEY_ADMIN";
	
	public static final String TEAM_ADMIN = "TEAM_ADMIN";
	
	private String authority;

	Role(String authority){
		this.authority = authority;
	}
	
	@Override
	public String getAuthority() {
		return this.authority;
	}

	
}
