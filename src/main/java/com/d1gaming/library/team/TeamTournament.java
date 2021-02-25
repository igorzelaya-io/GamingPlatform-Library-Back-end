package com.d1gaming.library.team;

import com.d1gaming.library.tournament.Tournament;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public class TeamTournament {

	@JsonProperty
	private String teamTournamentId;
	
	@JsonProperty
	private Tournament teamTournament;
	
	@JsonProperty
	private int teamTournamentMatchesWins;
	
	@JsonProperty
	private int teamTournamentMatchesLosses;
	
	public TeamTournament() {
		super();
	}

	public TeamTournament(String teamTournamentId, Tournament teamTournament, int teamTournamentMatchesWins,
			int teamTournamentMatchesLosses) {
		super();
		this.teamTournamentId = teamTournamentId;
		this.teamTournament = teamTournament;
		this.teamTournamentMatchesWins = teamTournamentMatchesWins;
		this.teamTournamentMatchesLosses = teamTournamentMatchesLosses;
	}

	public String getTeamTournamentId() {
		return teamTournamentId;
	}

	public void setTeamTournamentId(String teamTournamentId) {
		this.teamTournamentId = teamTournamentId;
	}

	public Tournament getTeamTournament() {
		return teamTournament;
	}

	public void setTeamTournament(Tournament teamTournament) {
		this.teamTournament = teamTournament;
	}

	public int getTeamTournamentMatchesWins() {
		return teamTournamentMatchesWins;
	}

	public void setTeamTournamentMatchesWins(int teamTournamentMatchesWins) {
		this.teamTournamentMatchesWins = teamTournamentMatchesWins;
	}

	public int getTeamTournamentMatchesLosses() {
		return teamTournamentMatchesLosses;
	}

	public void setTeamTournamentMatchesLosses(int teamTournamentMatchesLosses) {
		this.teamTournamentMatchesLosses = teamTournamentMatchesLosses;
	}
	
	
	
}
