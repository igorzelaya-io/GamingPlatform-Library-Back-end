package com.d1gaming.library.tournament;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public class TournamentCreationRequest {

	@JsonProperty
	private Tournament tournamentToBeCreated;
	
	@JsonProperty
	private long tournamentDateInMilliseconds;
	
	@JsonProperty
	private String tournamentUserModeratorId;

	public TournamentCreationRequest(Tournament tournamentToBeCreated, String tournamentUserModeratorId) {
		super();
		this.tournamentToBeCreated = tournamentToBeCreated;
		this.tournamentUserModeratorId = tournamentUserModeratorId;
	}
	
	public TournamentCreationRequest() {
		super();
	}

	public Tournament getTournamentToBeCreated() {
		return tournamentToBeCreated;
	}

	public void setTournamentToBeCreated(Tournament tournamentToBeCreated) {
		this.tournamentToBeCreated = tournamentToBeCreated;
	}

	public long getTournamentDateInMilliseconds() {
		return tournamentDateInMilliseconds;
	}

	public void setTournamentDateInMilliseconds(long tournamentDateInMilliseconds) {
		this.tournamentDateInMilliseconds = tournamentDateInMilliseconds;
	}

	public String getTournamentUserModeratorId() {
		return tournamentUserModeratorId;
	}

	public void setTournamentUserModeratorId(String tournamentUserModeratorId) {
		this.tournamentUserModeratorId = tournamentUserModeratorId;
	}

}
