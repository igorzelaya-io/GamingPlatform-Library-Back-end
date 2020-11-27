package com.d1gaming.library.request;

import java.util.List;
import java.util.Map;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import com.d1gaming.library.role.Role;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public class UserRegisterRequest {

	@JsonProperty
	@NotBlank
	private String userRealName;
	
	@JsonProperty
	@NotBlank
	private String userName;
	
	@JsonProperty
	@NotBlank
	private String userPassword;
	
	@JsonProperty
	@NotBlank
	private String userCountry;
	
	@JsonProperty
	@Email
	private String userEmail;
	
	private List<Role> useRoles;
	
	@JsonProperty
	@NotBlank
	private Map<String, Object> userBirthDate;

	public UserRegisterRequest() {
		super();
	}

	public String getUserRealName() {
		return userRealName;
	}

	public void setUserRealName(String userRealName) {
		this.userRealName = userRealName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserCountry() {
		return userCountry;
	}

	public void setUserCountry(String userCountry) {
		this.userCountry = userCountry;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public List<Role> getUseRoles() {
		return useRoles;
	}

	public void setUseRoles(List<Role> useRoles) {
		this.useRoles = useRoles;
	}

	public Map<String, Object> getUserBirthDate() {
		return userBirthDate;
	}

	public void setUserBirthDate(Map<String, Object> userBirthDate) {
		this.userBirthDate = userBirthDate;
	}
	
	
}
