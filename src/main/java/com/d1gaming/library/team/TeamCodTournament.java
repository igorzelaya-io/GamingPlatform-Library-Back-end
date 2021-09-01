package com.d1gaming.library.team;

import java.util.List;

import com.d1gaming.library.match.Match;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public class TeamCodTournament {

	@JsonProperty
	private String teamCodTournamentId;
	
	@JsonProperty
	private String teamTournamentId;
	
	@JsonProperty
	private int teamTournamentPoints;
	
	@JsonProperty
	private List<Match> teamCodTournamentMatches;
	
	@JsonProperty
	private int teamTournamentNumberOfMatchesPlayed;
	
	@JsonProperty
	private int teamTournamentNumberOfMatchesDraws;
	
	@JsonProperty
	private int teamTournamentNumberOfMatchesWins;
	
	@JsonProperty
	private int teamTournamentNumberOfMatchesLosses;
	
	@JsonProperty
	private int teamTournamentTotalKills;
	
	@JsonProperty
	private TeamTournamentStatus teamTournamentStatus;
	
	public TeamCodTournament() {
		super();
	}


	public TeamCodTournament(String teamTournamentId, int teamTournamentPoints,
			List<Match> teamCodTournamentMatches, int teamTournamentNumberOfMatchesPlayed,
			int teamTournamentNumberOfMatchesDraws, int teamTournamentNumberOfMatchesWins,
			int teamTournamentNumberOfMatchesLosses, int teamTournamentTotalKills,
			TeamTournamentStatus teamTournamentStatus) {
		super();
		this.teamTournamentId = teamTournamentId;
		this.teamTournamentPoints = teamTournamentPoints;
		this.teamCodTournamentMatches = teamCodTournamentMatches;
		this.teamTournamentNumberOfMatchesPlayed = teamTournamentNumberOfMatchesPlayed;
		this.teamTournamentNumberOfMatchesDraws = teamTournamentNumberOfMatchesDraws;
		this.teamTournamentNumberOfMatchesWins = teamTournamentNumberOfMatchesWins;
		this.teamTournamentNumberOfMatchesLosses = teamTournamentNumberOfMatchesLosses;
		this.teamTournamentTotalKills = teamTournamentTotalKills;
		this.teamTournamentStatus = teamTournamentStatus;
	}



	public String getTeamCodTournamentId() {
		return teamCodTournamentId;
	}

	public void setTeamCodTournamentId(String teamCodTournamentId) {
		this.teamCodTournamentId = teamCodTournamentId;
	}

	public String getTeamTournamentId() {
		return teamTournamentId;
	}

	public void setTeamTournamentId(String teamTournamentId) {
		this.teamTournamentId = teamTournamentId;
	}

	public int getTeamTournamentNumberOfMatchesPlayed() {
		return teamTournamentNumberOfMatchesPlayed;
	}

	public void setTeamTournamentNumberOfMatchesPlayed(int teamTournamentNumberOfMatchesPlayed) {
		this.teamTournamentNumberOfMatchesPlayed = teamTournamentNumberOfMatchesPlayed;
	}

	public int getTeamTournamentNumberOfMatchesDraws() {
		return teamTournamentNumberOfMatchesDraws;
	}

	public void setTeamTournamentNumberOfMatchesDraws(int teamTournamentNumberOfMatchesDraws) {
		this.teamTournamentNumberOfMatchesDraws = teamTournamentNumberOfMatchesDraws;
	}

	public int getTeamTournamentNumberOfMatchesWins() {
		return teamTournamentNumberOfMatchesWins;
	}

	public void setTeamTournamentNumberOfMatchesWins(int teamTournamentNumberOfMatchesWins) {
		this.teamTournamentNumberOfMatchesWins = teamTournamentNumberOfMatchesWins;
	}

	public int getTeamTournamentNumberOfMatchesLosses() {
		return teamTournamentNumberOfMatchesLosses;
	}

	public void setTeamTournamentNumberOfMatchesLosses(int teamTournamentNumberOfMatchesLosses) {
		this.teamTournamentNumberOfMatchesLosses = teamTournamentNumberOfMatchesLosses;
	}

	public int getTeamTournamentTotalKills() {
		return teamTournamentTotalKills;
	}

	public void setTeamTournamentTotalKills(int teamTournamentTotalKills) {
		this.teamTournamentTotalKills = teamTournamentTotalKills;
	}

	public int getTeamTournamentPoints() {
		return teamTournamentPoints;
	}

	public void setTeamTournamentPoints(int teamTournamentPoints) {
		this.teamTournamentPoints = teamTournamentPoints;
	}

	public List<Match> getTeamCodTournamentMatches() {
		return teamCodTournamentMatches;
	}

	public void setTeamCodTournamentMatches(List<Match> teamCodTournamentMatches) {
		this.teamCodTournamentMatches = teamCodTournamentMatches;
	}

	public TeamTournamentStatus getTeamTournamentStatus() {
		return teamTournamentStatus;
	}

	public void setTeamTournamentStatus(TeamTournamentStatus teamTournamentStatus) {
		this.teamTournamentStatus = teamTournamentStatus;
	}
	
}
