package com.d1gaming.library.request;

import com.d1gaming.library.match.Match;
import com.d1gaming.library.team.Team;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public class MatchChallengeRequest {

	@JsonProperty
	private String matchChallengeChallengeId;
	
	@JsonProperty
	private Match matchChallengeMatch;
	
	@JsonProperty
	private Team matchChallengeTeam;
	
	public MatchChallengeRequest() {
		super();
	}

	public MatchChallengeRequest(String matchChallengeChallengeId, Match matchChallengeMatch, Team matchChallengeTeam) {
		super();
		this.matchChallengeChallengeId = matchChallengeChallengeId;
		this.matchChallengeMatch = matchChallengeMatch;
		this.matchChallengeTeam = matchChallengeTeam;
	}

	public String getMatchChallengeChallengeId() {
		return matchChallengeChallengeId;
	}

	public void setMatchChallengeChallengeId(String matchChallengeChallengeId) {
		this.matchChallengeChallengeId = matchChallengeChallengeId;
	}

	public Match getMatchChallengeMatch() {
		return matchChallengeMatch;
	}

	public void setMatchChallengeMatch(Match matchChallengeMatch) {
		this.matchChallengeMatch = matchChallengeMatch;
	}

	public Team getMatchChallengeTeam() {
		return matchChallengeTeam;
	}

	public void setMatchChallengeTeam(Team matchChallengeTeam) {
		this.matchChallengeTeam = matchChallengeTeam;
	}
	
}
