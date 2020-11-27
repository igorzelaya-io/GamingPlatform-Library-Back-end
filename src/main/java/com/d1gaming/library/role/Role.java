package com.d1gaming.library.role;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;


@JsonSerialize
public class Role {
	
	@JsonProperty
	private String roleId;
	
	@JsonProperty
	private String roleName;
	
	@JsonProperty
	private ERole roleType;

	public Role(String roleId, String roleName, ERole roleType) {
		super();
		this.roleId = roleId;
		this.roleName = roleName;
		this.roleType = roleType;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public ERole getRoleType() {
		return roleType;
	}

	public void setRoleType(ERole roleType) {
		this.roleType = roleType;
	}


}