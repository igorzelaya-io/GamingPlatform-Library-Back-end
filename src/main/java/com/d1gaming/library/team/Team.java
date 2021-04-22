package com.d1gaming.library.team;

import java.util.List;

import com.d1gaming.library.challenge.Challenge;
import com.d1gaming.library.image.ImageModel;
import com.d1gaming.library.user.User;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public class Team {
	
	@JsonProperty
	private String teamId;
	
	@JsonProperty
	private String teamCountry;
	
	@JsonProperty
	private String teamName;
	
	@JsonProperty
	private TeamStatus teamStatus;
	
	@JsonProperty
	private List<User> teamUsers;

	@JsonProperty
	private List<Challenge> teamChallenges;
	
	@JsonProperty
	private User teamModerator;

	@JsonProperty
	private String teamEmail;
	
	@JsonProperty
	private List<TeamInviteRequest> teamRequests;
	
	@JsonProperty
	private ImageModel teamImage;
	
	public Team(){
		
	}

	public Team(String teamCountry, String teamName, List<User> teamUsers, TeamStatus teamStatus, 
				List<Challenge> teamChallenges, User teamModerator, String teamEmail) {
		super();
		this.teamCountry = teamCountry;
		this.teamName = teamName;
		this.teamUsers = teamUsers;
		this.teamChallenges = teamChallenges;
		this.teamModerator = teamModerator;
		this.teamEmail = teamEmail;
		this.teamStatus = teamStatus;
	}
	
	public Team(String teamName, String teamCountry, String teamEmail, TeamStatus teamStatus, User teamModerator) {
		this.teamName = teamName; 
		this.teamCountry = teamCountry;
		this.teamEmail = teamEmail;
		this.teamStatus = teamStatus;
		this.teamModerator = teamModerator;
	}

	public String getTeamId() {
		return teamId;
	}

	public void setTeamId(String teamId) {
		this.teamId = teamId;
	}

	public String getTeamCountry() {
		return teamCountry;
	}

	public void setTeamCountry(String teamCountry) {
		this.teamCountry = teamCountry;
	}
	
	public TeamStatus getTeamStatus() {
		return teamStatus;
	}

	public void setTeamStatus(TeamStatus teamStatus) {
		this.teamStatus = teamStatus;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public List<User> getTeamUsers() {
		return teamUsers;
	}

	public void setTeamUsers(List<User> teamUsers) {
		this.teamUsers = teamUsers;
	}

	public List<Challenge> getTeamChallenges() {
		return this.teamChallenges;
	}

	public void setTeamChallenges(List<Challenge> teamChallenges) {
		this.teamChallenges = teamChallenges;
	}

	public User getTeamModerator() {
		return teamModerator;
	}

	public void setTeamModerator(User teamModerator ) {
		this.teamModerator = teamModerator;
	}
	
	public String getTeamEmail() {
		return teamEmail;
	}

	public void setTeamEmail(String teamEmail) {
		this.teamEmail = teamEmail;
	}

	public List<TeamInviteRequest> getTeamRequests() {
		return teamRequests;
	}

	public void setTeamRequests(List<TeamInviteRequest> teamRequests) {
		this.teamRequests = teamRequests;
	}

	public ImageModel getTeamImage() {
		return teamImage;
	}

	public void setTeamImage(ImageModel teamImage) {
		this.teamImage = teamImage;
	}

}