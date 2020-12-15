package com.d1gaming.library.tournament;

import java.util.Date;
import java.util.List;

import com.d1gaming.library.team.Team;
import com.d1gaming.library.user.User;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public class Tournament {

	@JsonProperty
	private String tournamentId;
	
	@JsonProperty
	private String tournamentName;

	@JsonProperty
	private List<Team> tournamentTeams;
	
	@JsonProperty
	private TournamentStatus tournamentStatus;
	
	@JsonProperty
	private User tournamentModerator;

	@JsonProperty
	private Date tournamentDate;

	@JsonProperty
	private TournamentType tournamentType;
	
	public Tournament() {
		
	}

	public Tournament(String tournamentName, List<Team> tournamentTeams, TournamentStatus tournamentStatus,
			User tournamentModerator, Date tournamentDate, TournamentType tournamentType) {
		super();
		this.tournamentName = tournamentName;
		this.tournamentTeams = tournamentTeams;
		this.tournamentStatus = tournamentStatus;
		this.tournamentModerator = tournamentModerator;
		this.tournamentDate = tournamentDate;
		this.tournamentType = tournamentType;
	}

	public String getTournamentId() {
		return tournamentId;
	}

	public void setTournamentId(String tournamentId) {
		this.tournamentId = tournamentId;
	}

	public String getTournamentName() {
		return tournamentName;
	}

	public void setTournamentName(String tournamentName) {
		this.tournamentName = tournamentName;
	}

	public List<Team> getTournamentTeams() {
		return tournamentTeams;
	}

	public void setTournamentTeams(List<Team> tournamentTeams) {
		this.tournamentTeams = tournamentTeams;
	}

	public TournamentStatus getTournamentStatus() {
		return tournamentStatus;
	}

	public void setTournamentStatus(TournamentStatus tournamentStatus) {
		this.tournamentStatus = tournamentStatus;
	}

	public User getTournamentModerator() {
		return tournamentModerator;
	}

	public void setTournamentModerator(User tournamentModerator) {
		this.tournamentModerator = tournamentModerator;
	}

	public Date getTournamentDate() {
		return tournamentDate;
	}

	public void setTournamentDate(Date tournamentDate) {
		this.tournamentDate = tournamentDate;
	}

	public TournamentType getTournamentType() {
		return tournamentType;
	}

	public void setTournamentType(TournamentType tournamentType) {
		this.tournamentType = tournamentType;
	}
	
}
