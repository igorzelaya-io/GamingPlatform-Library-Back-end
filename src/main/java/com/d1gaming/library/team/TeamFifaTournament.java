package com.d1gaming.library.team;

import java.util.List;

import com.d1gaming.library.match.Match;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public class TeamFifaTournament {

	@JsonProperty
	private String teamFifaTournamentId;
	
	@JsonProperty
	private String teamTournamentId;
	
	@JsonProperty
	private List<Match> teamTournamentMatches;
	
	@JsonProperty
	private int teamTournamentPoints;
	
	@JsonProperty
	private int teamTournamentNumberOfMatchesPlayed;
	
	@JsonProperty
	private int teamTournamentMatchesDraws;
	
	@JsonProperty
	private int teamTournamentMatchesWins; 
	
	@JsonProperty
	private int teamTournamentMatchesLosses;
	
	@JsonProperty
	private int teamTournamentGoalsScored;
	
	@JsonProperty
	private int teamTournamentGoalsReceived;
	
	@JsonProperty
	private int teamTournamentGoalsDifference;
	
	@JsonProperty
	private TeamTournamentStatus teamTournamentStatus;
		
	public TeamFifaTournament() {
		super();
	}

	public TeamFifaTournament(String teamTournamentId, List<Match> teamTournamentMatches, int teamTournamentPoints, 
			int teamTournamentNumberOfMatchesPlayed, int teamTournamentMatchesDraws,
			int teamTournamentMatchesWins, int teamTournamentMatchesLosses, int teamTournamentGoalsScored,
			int teamTournamentGoalsReceived, int teamTournamentGoalsDifference, TeamTournamentStatus teamTournamentStatus) {
		super();
		this.teamTournamentId = teamTournamentId;
		this.teamTournamentMatches = teamTournamentMatches;
		this.teamTournamentPoints = teamTournamentPoints;
		this.teamTournamentNumberOfMatchesPlayed = teamTournamentNumberOfMatchesPlayed; 
		this.teamTournamentMatchesDraws = teamTournamentMatchesDraws;
		this.teamTournamentMatchesWins = teamTournamentMatchesWins;
		this.teamTournamentMatchesLosses = teamTournamentMatchesLosses;
		this.teamTournamentGoalsScored = teamTournamentGoalsScored;
		this.teamTournamentGoalsReceived = teamTournamentGoalsReceived;
		this.teamTournamentGoalsDifference = teamTournamentGoalsDifference;
		this.teamTournamentStatus = teamTournamentStatus;
	}

	public String getTeamFifaTournamentId() {
		return this.teamFifaTournamentId;
	}

	public void setTeamFifaTournamentId(String teamFifaTournamentId) {
		this.teamFifaTournamentId = teamFifaTournamentId;
	}

	public String getTeamTournamentId() {
		return teamTournamentId;
	}

	public void setTeamTournamentId(String teamTournamentId) {
		this.teamTournamentId = teamTournamentId;
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

	public int getTeamTournamentMatchesDraws() {
		return teamTournamentMatchesDraws;
	}

	public void setTeamTournamentMatchesDraws(int teamTournamentMatchesDraws) {
		this.teamTournamentMatchesDraws = teamTournamentMatchesDraws;
	}

	public int getTeamTournamentGoalsScored() {
		return teamTournamentGoalsScored;
	}

	public void setTeamTournamentGoalsScored(int teamTournamentGoalsScored) {
		this.teamTournamentGoalsScored = teamTournamentGoalsScored;
	}

	public int getTeamTournamentGoalsReceived() {
		return teamTournamentGoalsReceived;
	}

	public void setTeamTournamentGoalsReceived(int teamTournamentGoalsReceived) {
		this.teamTournamentGoalsReceived = teamTournamentGoalsReceived;
	}

	public int getTeamTournamentGoalsDifference() {
		return teamTournamentGoalsDifference;
	}

	public void setTeamTournamentGoalsDifference(int teamTournamentGoalsDifference) {
		this.teamTournamentGoalsDifference = teamTournamentGoalsDifference;
	}

	public List<Match> getTeamTournamentMatches() {
		return teamTournamentMatches;
	}

	public void setTeamTournamentMatches(List<Match> teamTournamentMatches) {
		this.teamTournamentMatches = teamTournamentMatches;
	}

	public int getTeamTournamentNumberOfMatchesPlayed() {
		return teamTournamentNumberOfMatchesPlayed;
	}

	public void setTeamTournamentNumberOfMatchesPlayed(int teamTournamentNumberOfMatchesPlayed) {
		this.teamTournamentNumberOfMatchesPlayed = teamTournamentNumberOfMatchesPlayed;
	}

	public int getTeamTournamentPoints() {
		return teamTournamentPoints;
	}

	public void setTeamTournamentPoints(int teamTournamentPoints) {
		this.teamTournamentPoints = teamTournamentPoints;
	}

	public TeamTournamentStatus getTeamTournamentStatus() {
		return teamTournamentStatus;
	}

	public void setTeamTournamentStatus(TeamTournamentStatus teamTournamentStatus) {
		this.teamTournamentStatus = teamTournamentStatus;
	}

}
