package com.d1gaming.library.request;

import com.d1gaming.library.team.Team;
import com.d1gaming.library.tournament.Tournament;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public class TeamTournamentRequest {

	@JsonProperty
	private Tournament tournament;
	
	@JsonProperty
	private Team team;

	public TeamTournamentRequest() {
		super();
	}
	
	public TeamTournamentRequest(Tournament tournament, Team team) {
		super();
		this.tournament = tournament;
		this.team = team;
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
	
	
	
}
