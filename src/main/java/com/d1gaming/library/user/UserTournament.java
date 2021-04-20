package com.d1gaming.library.user;

import java.util.List;

import com.d1gaming.library.match.Match;
import com.d1gaming.library.team.Team;
import com.d1gaming.library.team.TeamTournamentStatus;
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
	
	@JsonProperty
	private List<Match> userTournamentMatches;
	
	@JsonProperty
	private TeamTournamentStatus userTournamentStatus;
	
	public UserTournament() {
		super();
	}
	
	public UserTournament(Tournament userTournaments, Team userTournamentTeam, int userTournamentMatchesWins, int userTournamentMatchesLosses, List<Match> userTournamentMatches
						, TeamTournamentStatus userTournamentStatus) {
		super();
		this.userTournament = userTournaments; 
		this.userTournamentMatchesWins = userTournamentMatchesWins;
		this.userTournamentMatchesLosses = userTournamentMatchesLosses;
		this.userTournamentTeam = userTournamentTeam;
		this.userTournamentStatus = userTournamentStatus;
	}

	public String getUserTournamentId() {
		return userTournamentId;
	}

	public void setUserTournamentId(String userTournamentId) {
		this.userTournamentId = userTournamentId;
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

	public List<Match> getUserTournamentMatches() {
		return userTournamentMatches;
	}

	public void setUserTournamentMatches(List<Match> userTournamentMatches) {
		this.userTournamentMatches = userTournamentMatches;
	}

	public TeamTournamentStatus getUserTournamentStatus() {
		return userTournamentStatus;
	}

	public void setUserTournamentStatus(TeamTournamentStatus userTournamentStatus) {
		this.userTournamentStatus = userTournamentStatus;
	}
}