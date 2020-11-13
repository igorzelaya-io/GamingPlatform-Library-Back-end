package com.d1gaming.library.user;
import javax.annotation.Nonnull;

public class UserAuthRequest {

	@Nonnull
	private String userName; 
	
	@Nonnull
	private String userPassword;

	public String getUserName() {
		return this.userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return this.userPassword;
	}
	
	public void setPassword(String userPassword) {
		this.userPassword = userPassword;
	}

}
