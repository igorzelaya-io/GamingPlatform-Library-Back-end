package com.d1gaming.library.request;

import com.d1gaming.library.match.Match;
import com.d1gaming.library.team.Team;
import com.d1gaming.library.tournament.Tournament;
import com.d1gaming.library.user.User;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public class MatchTournamentRequest {

	@JsonProperty
	private String matchTournamentTournamentId;
	
	@JsonProperty
	private Team matchTournamentTeam;
	
	@JsonProperty
	private Match matchTournamentMatch;
	
	public MatchTournamentRequest() {
		super();
	}

	public MatchTournamentRequest(String matchTournamentTournamentId, Match matchTournamentMatch, Team matchTournamentTeam) {
		super();
		this.matchTournamentTournamentId = matchTournamentTournamentId;
		this.matchTournamentMatch = matchTournamentMatch;
		this.matchTournamentTeam = matchTournamentTeam;
	}
		
	public String getMatchTournamentTournamentId() {
		return matchTournamentTournamentId;
	}

	public void setMatchTournamentTournamentId(String matchTournamentTournamentId) {
		this.matchTournamentTournamentId = matchTournamentTournamentId;
	}

	public Match getMatchTournamentMatch() {
		return matchTournamentMatch;
	}

	public void setMatchTournamentMatch(Match matchTournamentMatch) {
		this.matchTournamentMatch = matchTournamentMatch;
	}
	
	public Team getMatchTournamentTeam() {
		return matchTournamentTeam;
	}

	public void setMatchTournamentTeam(Team matchTournamentTeam) {
		this.matchTournamentTeam = matchTournamentTeam;
	}
	
}
