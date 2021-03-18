package com.d1gaming.library.tournament;

import com.d1gaming.library.user.User;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public class TournamentCreationRequest {

	@JsonProperty
	private Tournament tournamentToBeCreated;
	
	@JsonProperty
	private long tournamentDateInMilliseconds;
	
	@JsonProperty
	private User tournamentUserModerator;

	public TournamentCreationRequest(Tournament tournamentToBeCreated, User tournamentUserModerator) {
		super();
		this.tournamentToBeCreated = tournamentToBeCreated;
		this.tournamentUserModerator = tournamentUserModerator;
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

	public User getTournamentUserModerator() {
		return tournamentUserModerator;
	}

	public void setTournamentUserModerator(User tournamentUserModerator) {
		this.tournamentUserModerator = tournamentUserModerator;
	}

}
