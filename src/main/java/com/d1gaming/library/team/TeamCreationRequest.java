package com.d1gaming.library.team;
import org.springframework.web.multipart.MultipartFile;

import com.d1gaming.library.user.User;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public class TeamCreationRequest {

	@JsonProperty
	private Team teamToRegister;
	
	@JsonProperty
	private User teamModerator;
	
	@JsonProperty
	private MultipartFile teamImage;
	
	public TeamCreationRequest() {
		super();
	}
	
	public TeamCreationRequest(Team teamToRegister, User teamModerator, MultipartFile teamImage) {
		super();
		this.teamToRegister = teamToRegister;
		this.teamModerator = teamModerator;
		this.teamImage = teamImage;
	}

	public Team getTeamToRegister() {
		return teamToRegister;
	}

	public void setTeamToRegister(Team teamToRegister) {
		this.teamToRegister = teamToRegister;
	}

	public User getTeamModerator() {
		return teamModerator;
	}

	public void setTeamModerator(User teamModerator) {
		this.teamModerator = teamModerator;
	}

	public MultipartFile getTeamImage() {
		return teamImage;
	}

	public void setTeamImage(MultipartFile teamImage) {
		this.teamImage = teamImage;
	}
	
}
