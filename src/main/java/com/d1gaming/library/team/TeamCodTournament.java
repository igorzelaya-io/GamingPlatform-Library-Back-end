package com.d1gaming.library.team;

import java.util.List;

import com.d1gaming.library.match.Match;
import com.d1gaming.library.tournament.Tournament;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public class TeamCodTournament {

	@JsonProperty
	private String teamCodTournamentId;
	
	@JsonProperty
	private Tournament teamCodTournament;
	
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
	
	public TeamCodTournament() {
		super();
	}

	public TeamCodTournament(Tournament teamCodTournament, List<Match> teamCodTOurnamentMatches, int teamTournamentNumberOfMatchesPlayed,
			int teamTournamentNumberOfMatchesDraws, int teamTournamentNumberOfMatchesWins, int teamTournamentPoints, 
			int teamTournamentNumberOfMatchesLosses, int teamTournamentTotalKills) {
		super();
		this.teamCodTournament = teamCodTournament;
		this.teamCodTournamentMatches = teamCodTOurnamentMatches;
		this.teamTournamentNumberOfMatchesPlayed = teamTournamentNumberOfMatchesPlayed;
		this.teamTournamentPoints = teamTournamentPoints; 
		this.teamTournamentNumberOfMatchesDraws = teamTournamentNumberOfMatchesDraws;
		this.teamTournamentNumberOfMatchesWins = teamTournamentNumberOfMatchesWins;
		this.teamTournamentNumberOfMatchesLosses = teamTournamentNumberOfMatchesLosses;
		this.teamTournamentTotalKills = teamTournamentTotalKills;
	}

	public String getTeamCodTournamentId() {
		return teamCodTournamentId;
	}

	public void setTeamCodTournamentId(String teamCodTournamentId) {
		this.teamCodTournamentId = teamCodTournamentId;
	}

	public Tournament getTeamCodTournament() {
		return teamCodTournament;
	}

	public void setTeamCodTournament(Tournament teamCodTournament) {
		this.teamCodTournament = teamCodTournament;
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

}
