package com.d1gaming.library.request;

import com.d1gaming.library.challenge.Challenge;
import com.d1gaming.library.team.Team;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public class TeamChallengeRequest {

	@JsonProperty
	private Challenge challenge;
	
	
	@JsonProperty
	private Team team;

	
	public TeamChallengeRequest() {
		super();
	}
	
	public TeamChallengeRequest(Challenge challenge, Team team) {
		this.challenge = challenge;
		this.team = team;
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
	
}
