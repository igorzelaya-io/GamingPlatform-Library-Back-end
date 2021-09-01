package com.d1gaming.library.request;

import com.d1gaming.library.challenge.Challenge;
import com.d1gaming.library.team.Team;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public class UserChallengeRequest {

	@JsonProperty
	private Challenge challenge;
	
	@JsonProperty
	private Team team;
	
	@JsonProperty
	private String userId;
	
	public UserChallengeRequest() {
		super();
	}

	public UserChallengeRequest(Challenge challenge, Team team, String userId) {
		super();
		this.challenge = challenge;
		this.team = team;
		this.userId = userId;
	}

	public Challenge getChallenge() {
		return challenge;
	}

	public void setChallenge(Challenge challenge) {
		this.challenge = challenge;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	
}
