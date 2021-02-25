package com.d1gaming.library.user;

import com.d1gaming.library.tournament.Tournament;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public class UserTournament {

	@JsonProperty
	private String userTournamentsId;
	
	@JsonProperty
	private Tournament userTournament;
	
	@JsonProperty
	private int userTournamentMatchesWins;
	
	@JsonProperty
	private int userTournamentMatchesLosses;
	
	public UserTournament() {
		super();
	}
	
	public UserTournament(String userTournamentsId, Tournament userTournaments, int userTournamentMatchesWins, int userTournamentMatchesLosses) {
		super();
		this.userTournamentsId = userTournamentsId;
		this.userTournament = userTournaments; 
		this.userTournamentMatchesWins = userTournamentMatchesWins;
		this.userTournamentMatchesLosses = userTournamentMatchesLosses;
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
	
}
