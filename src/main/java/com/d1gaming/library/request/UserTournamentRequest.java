package com.d1gaming.library.request;

import com.d1gaming.library.team.Team;
import com.d1gaming.library.tournament.Tournament;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public class UserTournamentRequest {

	@JsonProperty
	private Tournament tournament;
	
	@JsonProperty
	private Team team;
	
	@JsonProperty
	private String userId;
	
	public UserTournamentRequest() {
		super();
	}
	
	public UserTournamentRequest(Tournament tournament, Team team, String userId) {
		this.tournament = tournament;
		this.team = team;
		this.userId = userId;
	}

	public Tournament getTournament() {
		return tournament;
	}

	public void setTournament(Tournament tournament) {
		this.tournament = tournament;
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
