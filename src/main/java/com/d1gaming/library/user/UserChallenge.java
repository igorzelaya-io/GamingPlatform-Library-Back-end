package com.d1gaming.library.user;

import java.io.Serializable;
import java.util.List;

import com.d1gaming.library.challenge.Challenge;
import com.d1gaming.library.match.Match;
import com.d1gaming.library.team.Team;
import com.d1gaming.library.team.TeamTournamentStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public class UserChallenge implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@JsonProperty
	private String userChallengeId;

	@JsonProperty
	private Team userChallengeTeam;
	
	@JsonProperty
	private List<Match> userChallengeMatches;
	
	@JsonProperty
	private int userChallengeMatchesWins;
	
	@JsonProperty
	private int userChallengeMatchesLosses;
	
	@JsonProperty
	private TeamTournamentStatus userChallengeStatus;
	
	public UserChallenge() {
		super();
	}

	public UserChallenge(String userChallengeId, Team userChallengeTeam,
			List<Match> userChallengeMatches, int userChallengeMatchesWins, int userChallengeMatchesLosses,
			TeamTournamentStatus userChallengeStatus) {
		super();
		this.userChallengeId = userChallengeId;
		this.userChallengeTeam = userChallengeTeam;
		this.userChallengeMatches = userChallengeMatches;
		this.userChallengeMatchesWins = userChallengeMatchesWins;
		this.userChallengeMatchesLosses = userChallengeMatchesLosses;
		this.userChallengeStatus = userChallengeStatus;
	}

	public String getUserChallengeId() {
		return userChallengeId;
	}

	public void setUserChallengeId(String userChallengeId) {
		this.userChallengeId = userChallengeId;
	}

	public Team getUserChallengeTeam() {
		return userChallengeTeam;
	}

	public void setUserChallengeTeam(Team userChallengeTeam) {
		this.userChallengeTeam = userChallengeTeam;
	}

	public List<Match> getUserChallengeMatches() {
		return userChallengeMatches;
	}

	public void setUserChallengeMatches(List<Match> userChallengeMatches) {
		this.userChallengeMatches = userChallengeMatches;
	}

	public int getUserChallengeMatchesWins() {
		return userChallengeMatchesWins;
	}

	public void setUserChallengeMatchesWins(int userChallengeMatchesWins) {
		this.userChallengeMatchesWins = userChallengeMatchesWins;
	}

	public int getUserChallengeMatchesLosses() {
		return userChallengeMatchesLosses;
	}

	public void setUserChallengeMatchesLosses(int userChallengeMatchesLosses) {
		this.userChallengeMatchesLosses = userChallengeMatchesLosses;
	}

	public TeamTournamentStatus getUserChallengeStatus() {
		return userChallengeStatus;
	}

	public void setUserChallengeStatus(TeamTournamentStatus userChallengeStatus) {
		this.userChallengeStatus = userChallengeStatus;
	}
}
