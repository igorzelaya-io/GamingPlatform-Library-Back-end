package com.d1gaming.library.match;

import com.d1gaming.library.team.Team;
import com.d1gaming.library.tournament.Tournament;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public class Match {

	@JsonProperty
	private String matchId;
	
	@JsonProperty
	private Tournament matchTournament;
	
	@JsonProperty
	private Team matchLocalTeam;
	
	@JsonProperty
	private Team matchAwayTeam;

	@JsonProperty
	private int localTeamMatchScore;
	
	@JsonProperty
	private int awayTeamMatchScore;

	@JsonProperty
	private MatchStatus matchStatus;
	
	@JsonProperty
	private Team matchWinningTeam;
	
	
	public Match(Tournament matchTournament, Team matchLocalTeam, Team matchAwayTeam,
			int localTeamMatchScore, int awayTeamMatchScore, MatchStatus matchStatus) {
		super();
		this.matchTournament = matchTournament;
		this.matchLocalTeam = matchLocalTeam;
		this.matchAwayTeam = matchAwayTeam;
		this.localTeamMatchScore = localTeamMatchScore;
		this.awayTeamMatchScore = awayTeamMatchScore;
		this.matchStatus = matchStatus;
	}

	public Match() {
		super();
	}

	public String getMatchId() {
		return matchId;
	}

	public void setMatchId(String matchId) {
		this.matchId = matchId;
	}

	public Tournament getMatchTournament() {
		return matchTournament;
	}

	public void setMatchTournament(Tournament matchTournament) {
		this.matchTournament = matchTournament;
	}

	public Team getMatchLocalTeam() {
		return matchLocalTeam;
	}

	public void setMatchLocalTeam(Team matchLocalTeam) {
		this.matchLocalTeam = matchLocalTeam;
	}

	public Team getMatchAwayTeam() {
		return matchAwayTeam;
	}

	public void setMatchAwayTeam(Team matchAwayTeam) {
		this.matchAwayTeam = matchAwayTeam;
	}

	public int getLocalTeamMatchScore() {
		return localTeamMatchScore;
	}

	public void setLocalTeamMatchScore(int localTeamMatchScore) {
		this.localTeamMatchScore = localTeamMatchScore;
	}

	public int getAwayTeamMatchScore() {
		return awayTeamMatchScore;
	}

	public void setAwayTeamMatchScore(int awayTeamMatchScore) {
		this.awayTeamMatchScore = awayTeamMatchScore;
	}

	public MatchStatus getMatchStatus() {
		return matchStatus;
	}

	public void setMatchStatus(MatchStatus matchStatus) {
		this.matchStatus = matchStatus;
	}

	public Team getMatchWinningTeam() {
		return matchWinningTeam;
	}

	public void setMatchWinningTeam(Team matchWinningTeam) {
		this.matchWinningTeam = matchWinningTeam;
	}
}
