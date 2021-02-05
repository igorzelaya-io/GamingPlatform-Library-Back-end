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
	private int limitNumberOfTeams;
	
	@JsonProperty
	private int tournamentNumberOfTeams;
	
	@JsonProperty
	private TournamentStatus tournamentStatus;
	
	@JsonProperty
	private User tournamentModerator;

	@JsonProperty
	private Date tournamentDate;

	@JsonProperty
	private TournamentMode tournamentType;
		
	@JsonProperty
	private String tournamentPlatforms;
	
	@JsonProperty
	private double tournamentCashPrice;
	
	@JsonProperty
	private int tournamentTokenEntryFee;
	
	@JsonProperty 
	private String tournamentRegion;
	
	@JsonProperty
	private TournamentFormat tournamentFormat;
	
	@JsonProperty
	private TournamentTeamSize tournametTeamSize;
	
	@JsonProperty
	private String tournamentDescription;
	
	
	public Tournament() {
		super();
	}

	public Tournament(String tournamentName, List<Team> tournamentTeams, TournamentStatus tournamentStatus,
			User tournamentModerator, Date tournamentDate, TournamentMode tournamentType) {
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

	public TournamentMode getTournamentMode() {
		return tournamentType;
	}

	public void setTournamentMode(TournamentMode tournamentType) {
		this.tournamentType = tournamentType;
	}

	public int getTournamentNumberOfTeams() {
		return tournamentNumberOfTeams;
	}

	public void setTournamentNumberOfTeams(int tournamentNumberOfTeams) {
		this.tournamentNumberOfTeams = tournamentNumberOfTeams;
	}

	public String getTournamentPlatforms() {
		return tournamentPlatforms;
	}

	public void setTournamentPlatforms(String tournamentPlatforms) {
		this.tournamentPlatforms = tournamentPlatforms;
	}

	public double getTournamentCashPrice() {
		return tournamentCashPrice;
	}

	public void setTournamentCashPrice(double tournamentCashPrice) {
		this.tournamentCashPrice = tournamentCashPrice;
	}

	public int getTournamentTokenEntryFee() {
		return tournamentTokenEntryFee;
	}

	public void setTournamentTokenEntryFee(int tournamentTokenEntryFee) {
		this.tournamentTokenEntryFee = tournamentTokenEntryFee;
	}

	public String getTournamentRegion() {
		return tournamentRegion;
	}

	public void setTournamentRegion(String tournamentRegion) {
		this.tournamentRegion = tournamentRegion;
	}

	public int getLimitNumberOfTeams() {
		return limitNumberOfTeams;
	}

	public void setLimitNumberOfTeams(int limitNumberOfTeams) {
		this.limitNumberOfTeams = limitNumberOfTeams;
	}

	public TournamentMode getTournamentType() {
		return tournamentType;
	}

	public void setTournamentType(TournamentMode tournamentType) {
		this.tournamentType = tournamentType;
	}

	public TournamentFormat getTournamentFormat() {
		return tournamentFormat;
	}

	public void setTournamentFormat(TournamentFormat tournamentFormat) {
		this.tournamentFormat = tournamentFormat;
	}

	public TournamentTeamSize getTournametTeamSize() {
		return tournametTeamSize;
	}

	public void setTournametTeamSize(TournamentTeamSize tournametTeamSize) {
		this.tournametTeamSize = tournametTeamSize;
	}
	
}
