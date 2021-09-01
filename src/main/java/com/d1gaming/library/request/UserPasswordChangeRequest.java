package com.d1gaming.library.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public class UserPasswordChangeRequest {

	@JsonProperty
	private String userPasswordChangeName;
	
	@JsonProperty
	private String userPasswordChangeCurrentPassword;
	
	@JsonProperty
	private String userPasswordChangeNewPassword;
	
	public UserPasswordChangeRequest() {
		super();
	}

	public UserPasswordChangeRequest(String userPasswordChangeName, String userPasswordChangeCurrentPassword,
			String userPasswordChangeNewPassword) {
		super();
		this.userPasswordChangeName = userPasswordChangeName;
		this.userPasswordChangeCurrentPassword = userPasswordChangeCurrentPassword;
		this.userPasswordChangeNewPassword = userPasswordChangeNewPassword;
	}

	public String getUserPasswordChangeName() {
		return userPasswordChangeName;
	}

	public void setUserPasswordChangeName(String userPasswordChangeName) {
		this.userPasswordChangeName = userPasswordChangeName;
	}

	public String getUserPasswordChangeCurrentPassword() {
		return userPasswordChangeCurrentPassword;
	}

	public void setUserPasswordChangeCurrentPassword(String userPasswordChangeCurrentPassword) {
		this.userPasswordChangeCurrentPassword = userPasswordChangeCurrentPassword;
	}

	public String getUserPasswordChangeNewPassword() {
		return userPasswordChangeNewPassword;
	}

	public void setUserPasswordChangeNewPassword(String userPasswordChangeNewPassword) {
		this.userPasswordChangeNewPassword = userPasswordChangeNewPassword;
	}

}
