package com.d1gaming.library.team;

import java.io.Serializable;
import java.util.List;

import com.d1gaming.library.user.User;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public class Team implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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
	private User teamModerator;

	@JsonProperty
	private String teamEmail;
	
	@JsonProperty
	private List<TeamInviteRequest> teamRequests;
	
	@JsonProperty
	private transient boolean hasImage = false;
	
	@JsonProperty
	private int teamCodTotalLs;
	
	@JsonProperty
	private int teamCodTotalWs;
	
	@JsonProperty
	private int teamFifaTotalWs;
	
	@JsonProperty
	private int teamFifaTotalLs;
	
	@JsonProperty
	private int teamTotalPlays;
	
	public Team(){
		
	}

	public Team(String teamCountry, String teamName, List<User> teamUsers, TeamStatus teamStatus, 
				 User teamModerator, String teamEmail) {
		super();
		this.teamCountry = teamCountry;
		this.teamName = teamName;
		this.teamUsers = teamUsers;
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

	public int getTeamCodTotalLs() {
		return teamCodTotalLs;
	}

	public void setTeamCodTotalLs(int teamCodTotalLs) {
		this.teamCodTotalLs = teamCodTotalLs;
	}

	public int getTeamCodTotalWs() {
		return teamCodTotalWs;
	}

	public void setTeamCodTotalWs(int teamCodTotalWs) {
		this.teamCodTotalWs = teamCodTotalWs;
	}

	public int getTeamFifaTotalWs() {
		return teamFifaTotalWs;
	}

	public void setTeamFifaTotalWs(int teamFifaTotalWs) {
		this.teamFifaTotalWs = teamFifaTotalWs;
	}

	public int getTeamFifaTotalLs() {
		return teamFifaTotalLs;
	}

	public void setTeamFifaTotalLs(int teamFifaTotalLs) {
		this.teamFifaTotalLs = teamFifaTotalLs;
	}

	public int getTeamTotalPlays() {
		return teamTotalPlays;
	}

	public void setTeamTotalPlays(int teamTotalPlays) {
		this.teamTotalPlays = teamTotalPlays;
	}

	public boolean ishasImage() {
		return hasImage;
	}

	public void setHasImage(boolean hasImage) {
		this.hasImage = hasImage;
	}

}