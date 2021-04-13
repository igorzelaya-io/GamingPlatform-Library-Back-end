package com.d1gaming.library.user;

import com.d1gaming.library.team.Team;
import com.d1gaming.library.tournament.Tournament;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public class UserTournament {

	@JsonProperty
	private String userTournamentId;
	
	@JsonProperty
	private Tournament userTournament;
	
	@JsonProperty
	private Team userTournamentTeam;
	
	@JsonProperty
	private int userTournamentMatchesWins;
	
	@JsonProperty
	private int userTournamentMatchesLosses;
	
	public UserTournament() {
		super();
	}
	
	public UserTournament(Tournament userTournaments, Team userTournamentTeam, int userTournamentMatchesWins, int userTournamentMatchesLosses) {
		super();
		this.userTournament = userTournaments; 
		this.userTournamentMatchesWins = userTournamentMatchesWins;
		this.userTournamentMatchesLosses = userTournamentMatchesLosses;
		this.userTournamentTeam = userTournamentTeam;
	}

	public Tournament getUserTournaments() {
		return userTournament;
	}

	public void setUserTournaments(Tournament userTournaments) {
		this.userTournament = userTournaments;
	}

	public int getUserTournamentMatchesWins() {
		return userTournamentMatchesWins;
	}

	public void setUserTournamentMatchesWins(int userTournamentMatchesWins) {
		this.userTournamentMatchesWins = userTournamentMatchesWins;
	}

	public int getUserTournamentMatchesLosses() {
		return userTournamentMatchesLosses;
	}

	public void setUserTournamentMatchesLosses(int userTournamentMatchesLosses) {
		this.userTournamentMatchesLosses = userTournamentMatchesLosses;
	}

	public String getUserTournamentsId() {
		return userTournamentId;
	}

	public void setUserTournamentsId(String userTournamentsId) {
		this.userTournamentId = userTournamentsId;
	}

	public Tournament getUserTournament() {
		return userTournament;
	}

	public void setUserTournament(Tournament userTournament) {
		this.userTournament = userTournament;
	}

	public Team getUserTournamentTeam() {
		return userTournamentTeam;
	}

	public void setUserTournamentTeam(Team userTournamentTeam) {
		this.userTournamentTeam = userTournamentTeam;
	}
	
}
