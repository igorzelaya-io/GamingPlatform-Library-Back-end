package com.d1gaming.library.user;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.d1gaming.library.role.Role;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class UserDetailsImpl implements UserDetails {

	private static final long serialVersionUID = 1L;
	
	private String userId;
	
	private String userName;
	
	@JsonIgnore
	private String userPassword;
	
	private String userEmail;

	private Collection<? extends GrantedAuthority> authorities; 
	
	public UserDetailsImpl(String userId, String userName, String userPassword, String userEmail,
			Collection<? extends GrantedAuthority> authorities) {
		this.userId = userId;
		this.userName = userName;
		this.userPassword = userPassword;
		this.userEmail = userEmail;
		this.authorities = authorities;
	}
	
	public static UserDetailsImpl build(User user) {
		List<GrantedAuthority> authorities = user.getUserRoles().stream()
				.map(role -> new SimpleGrantedAuthority(role.getAuthority()))
				.collect(Collectors.toList());
		return new UserDetailsImpl(user.getUserId(), user.getUserName(), user.getUserPassword(),
				user.getUserEmail(), authorities);
	}
	
	public static User toUser(UserDetailsImpl userDetails) {
		User user = new User();
		user.setUserId(userDetails.getUserId());
		user.setUserName(userDetails.getUsername());
		user.setUserPassword(userDetails.getPassword());
		Collection<? extends GrantedAuthority> authorities = userDetails.getAuthorities();
		List<Role> userRoles = authorities.stream()
										  .map(authority -> new Role(authority.getAuthority()))
										  .collect(Collectors.toList());
		user.setUserRoles(userRoles);
		user.setUserEmail(userDetails.getUserEmail());
		return user;
	}
	
	public String getUserId() {
		return this.userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getUserEmail() {
		return this.userEmail;
	}
	
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
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

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}
	
	@Override
	public boolean equals(Object object) {
		if(this == object) {
			return true;
		}
		if(object == null || getClass() != object.getClass())
			return false; 
		UserDetailsImpl user = (UserDetailsImpl) object;
		return Objects.equals(this.userId, user.userId);
	}	
}
