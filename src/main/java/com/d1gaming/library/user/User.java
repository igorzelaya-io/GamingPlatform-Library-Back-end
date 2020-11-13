package com.d1gaming.library.user;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.d1gaming.library.role.Role;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
@JsonSerialize
public class User implements UserDetails {
	
	private static final long serialVersionUID = 1L;

	User(){
	
	}
	@JsonProperty
	private String userId;
	
	@JsonProperty
	private String userRealName;
	
	@JsonProperty
	private String userName;
	
	@JsonProperty
	private String userPassword;
	
	@JsonProperty
	private String userEmail;
	
	@JsonProperty
	private int userRank;
		
	@JsonProperty
	private UserStatus userStatusCode;
	
	@JsonProperty
	private Map<String,Object> userTeam;
	
	@JsonProperty
	private Map<String,Object> userBilling;

	private Collection<Role> userRoles;
	
	@JsonProperty
	private String userCountry;
	
	@JsonProperty
	private int userTokens;
	
	@JsonProperty
	private double userCash;
	
	@JsonProperty
	private Map<String, Object> userBirthDate;
	
	private boolean isEnabled = true;
	
	private Set<Role> authorities = new HashSet<>();
	
	public User(String userId, String userRealName, String userName ,String userPassword, String userEmail, int userRank, UserStatus statusCode, Collection<Role> userRoles,  Map<String,Object> userTeam,Map<String,Object> userBilling, String userCountry, int userTokens, double userCash, Map<String,Object> userBirthDate) {
		this.userId = userId;
		this.userName = userName;
		this.userRealName = userRealName;
		this.userPassword = userPassword;
		this.userEmail = userEmail;
		this.userCountry = userCountry;
		this.userRoles = userRoles;
		this.userRank = userRank;
		this.userStatusCode = statusCode;
		this.isEnabled = true;
		this.userCash = userCash;
		this.userTeam = userTeam;
		this.userBilling = userBilling;
		this.userBirthDate = userBirthDate;
		this.userTokens = userTokens;
	}
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
		
	public String getUserName() {
		return this.userName;
	}
	
	public void setUserRealName(String userRealName) {
		this.userRealName = userRealName;
	}
	
	public String getUserRealName() {
		return this.userRealName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	
	public void setStatusCode(UserStatus statusCode) {
		this.userStatusCode = statusCode;
	}
	public UserStatus getStatusCode() {
		return this.userStatusCode;
	}
	
	public void setUserRank(int userRank) {
		this.userRank = userRank;
	}
	
	public int getUserRank() {
		return this.userRank;
	}
	public Map<String,Object> getUserTeam() {
		return userTeam;
	}

	public void setUserTeam(Map<String,Object> userTeam) {
		this.userTeam = userTeam;
	}
	
	public Map<String,Object> getUserBilling() {
		return this.userBilling;
	}
	
	public void setUserBilling(Map<String,Object> map) {
		this.userBilling = map;
	}

	public String getUserCountry() {
		return userCountry;
	}

	public void setUserCountry(String userCountry) {
		this.userCountry = userCountry;
	}

	public int getUserTokens() {
		return userTokens;
	}

	public void setUserTokens(int userTokens) {
		this.userTokens = userTokens;
	}

	public double getUserCash() {
		return userCash;
	}

	public void setUserCash(double userCash) {
		this.userCash = userCash;
	}

	public Map<String, Object> getUserBirthDate() {
		return userBirthDate;
	}

	public void setUserBirthDate(Map<String, Object> userBirthDate) {
		this.userBirthDate = userBirthDate;
	}
	
	@Override
	public String toString() {
		return "users";
	}
	
	@Override
	public boolean isAccountNonExpired() {
		return isEnabled;
	}
	@Override
	public boolean isAccountNonLocked() {
		return isEnabled;
	}
	@Override
	public boolean isCredentialsNonExpired() {
		return isEnabled;
	}
	@Override
	public boolean isEnabled() {
		return isEnabled;
	}
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return this.authorities;
	}
	@Override
	public String getPassword() {
		return this.userPassword;
	}
	@Override
	public String getUsername() {
		return this.userName;
	}
}