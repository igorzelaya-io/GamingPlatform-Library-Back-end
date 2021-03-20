package com.d1gaming.library.request;

import com.d1gaming.library.tournament.Tournament;
import com.d1gaming.library.user.User;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public class UserTournamentRequest {

	@JsonProperty
	private Tournament tournament;
	
	@JsonProperty
	private User user;
	
	public UserTournamentRequest() {
		
	}
	
	public UserTournamentRequest(Tournament tournament, User user) {
		this.tournament = tournament;
		this.user = user;
	}

	public Tournament getTournament() {
		return tournament;
	}

	public void setTournament(Tournament tournament) {
		this.tournament = tournament;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}
