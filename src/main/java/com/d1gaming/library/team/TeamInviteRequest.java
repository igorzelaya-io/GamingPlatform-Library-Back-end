package com.d1gaming.library.team;

import java.util.Date;

import com.d1gaming.library.user.User;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public class TeamInviteRequest {

	@JsonProperty
	private Team teamRequest;

	@JsonProperty
	private User requestedUser;
	
	@JsonProperty
	private Date requestedTime;
	
	@JsonProperty
	private TeamInviteRequestStatus requestStatus;

	public TeamInviteRequest() {
		super();
	}
	
	public TeamInviteRequest(Team teamRequest, User requestedUser, Date requestedTime,
			TeamInviteRequestStatus requestStatus) {
		super();
		this.teamRequest = teamRequest;
		this.requestedUser = requestedUser;
		this.requestedTime = requestedTime;
		this.requestStatus = requestStatus;
	}

	public Team getTeamRequest() {
		return teamRequest;
	}

	public void setTeamRequest(Team teamRequest) {
		this.teamRequest = teamRequest;
	}

	public User getRequestedUser() {
		return requestedUser;
	}

	public void setRequestedUser(User requestedUser) {
		this.requestedUser = requestedUser;
	}

	public Date getRequestedTime() {
		return requestedTime;
	}

	public void setRequestedTime(Date requestedTime) {
		this.requestedTime = requestedTime;
	}

	public TeamInviteRequestStatus getRequestStatus() {
		return requestStatus;
	}

	public void setRequestStatus(TeamInviteRequestStatus requestStatus) {
		this.requestStatus = requestStatus;
	}

	
}
