package com.d1gaming.library.team;

import java.util.List;

import com.d1gaming.library.match.Match;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public class TeamCodChallenge {

	@JsonProperty
	private String teamCodChallengeId;

	@JsonProperty 
	private String teamChallengeId;
	
	@JsonProperty
	private int teamChallengePoints;
	
	@JsonProperty
	private List<Match> teamCodChallengeMatches;
	
	@JsonProperty
	private int teamChallengeNumberOfMatchesPlayed;
	
	@JsonProperty
	private int teamChallengeNumberOfMatchesDraws;
	
	@JsonProperty
	private int teamChallengeNumberOfMatchesWins;
	
	@JsonProperty
	private int teamChallengeNumberOfMatchesLosses;
	
	@JsonProperty
	private int teamChallengeTotalKills;
	
	@JsonProperty
	private TeamTournamentStatus teamChallengeStatus;
	
	@JsonProperty
	private String teamChallengeTeamId;
	
	public TeamCodChallenge() {
		super();
	}
	
	public TeamCodChallenge(String teamChallengeId, List<Match> teamCodChallengeMatches,
			int teamChallengePoints, int teamChallengeNumberOfMatchesPlayed,
			int teamChallengeNumberOfMatchesDraws, int teamChallengeNumberOfMatchesWins,
			int teamChallengeNumberOfMatchesLosses, int teamChallengeTotalKills,
			TeamTournamentStatus teamChallengeStatus) {
		super();
		this.teamChallengeId = teamChallengeId;
		this.teamChallengePoints = teamChallengePoints;
		this.teamCodChallengeMatches = teamCodChallengeMatches;
		this.teamChallengeNumberOfMatchesPlayed = teamChallengeNumberOfMatchesPlayed;
		this.teamChallengeNumberOfMatchesDraws = teamChallengeNumberOfMatchesDraws;
		this.teamChallengeNumberOfMatchesWins = teamChallengeNumberOfMatchesWins;
		this.teamChallengeNumberOfMatchesLosses = teamChallengeNumberOfMatchesLosses;
		this.teamChallengeTotalKills = teamChallengeTotalKills;
		this.teamChallengeStatus = teamChallengeStatus;
	}

	public String getTeamCodChallengeId() {
		return teamCodChallengeId;
	}

	public void setTeamCodChallengeId(String teamCodChallengeId) {
		this.teamCodChallengeId = teamCodChallengeId;
	}

	public String getTeamChallengeId() {
		return teamChallengeId;
	}

	public void setTeamChallengeId(String teamChallengeId) {
		this.teamChallengeId = teamChallengeId;
	}

	public int getTeamChallengePoints() {
		return teamChallengePoints;
	}

	public void setTeamChallengePoints(int teamChallengePoints) {
		this.teamChallengePoints = teamChallengePoints;
	}

	public List<Match> getTeamCodChallengeMatches() {
		return teamCodChallengeMatches;
	}

	public void setTeamCodChallengeMatches(List<Match> teamCodChallengeMatches) {
		this.teamCodChallengeMatches = teamCodChallengeMatches;
	}

	public int getTeamChallengeNumberOfMatchesPlayed() {
		return teamChallengeNumberOfMatchesPlayed;
	}

	public void setTeamChallengeNumberOfMatchesPlayed(int teamChallengeNumberOfMatchesPlayed) {
		this.teamChallengeNumberOfMatchesPlayed = teamChallengeNumberOfMatchesPlayed;
	}

	public int getTeamChallengeNumberOfMatchesDraws() {
		return teamChallengeNumberOfMatchesDraws;
	}

	public void setTeamChallengeNumberOfMatchesDraws(int teamChallengeNumberOfMatchesDraws) {
		this.teamChallengeNumberOfMatchesDraws = teamChallengeNumberOfMatchesDraws;
	}

	public int getTeamChallengeNumberOfMatchesWins() {
		return teamChallengeNumberOfMatchesWins;
	}

	public void setTeamChallengeNumberOfMatchesWins(int teamChallengeNumberOfMatchesWins) {
		this.teamChallengeNumberOfMatchesWins = teamChallengeNumberOfMatchesWins;
	}

	public int getTeamChallengeNumberOfMatchesLosses() {
		return teamChallengeNumberOfMatchesLosses;
	}

	public void setTeamChallengeNumberOfMatchesLosses(int teamChallengeNumberOfMatchesLosses) {
		this.teamChallengeNumberOfMatchesLosses = teamChallengeNumberOfMatchesLosses;
	}

	public int getTeamChallengeTotalKills() {
		return teamChallengeTotalKills;
	}

	public void setTeamChallengeTotalKills(int teamChallengeTotalKills) {
		this.teamChallengeTotalKills = teamChallengeTotalKills;
	}

	public TeamTournamentStatus getTeamChallengeStatus() {
		return teamChallengeStatus;
	}

	public void setTeamChallengeStatus(TeamTournamentStatus teamChallengeStatus) {
		this.teamChallengeStatus = teamChallengeStatus;
	}

	public String getTeamChallengeTeamId() {
		return teamChallengeTeamId;
	}

	public void setTeamChallengeTeamId(String teamChallengeTeamId) {
		this.teamChallengeTeamId = teamChallengeTeamId;
	}
	
}
