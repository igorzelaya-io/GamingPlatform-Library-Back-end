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
	private int tournamentLimitNumberOfTeams;
	
	@JsonProperty
	private int tournamentNumberOfTeams;
	
	@JsonProperty
	private TournamentStatus tournamentStatus;
	
	@JsonProperty
	private User tournamentModerator;

	@JsonProperty
	private Date tournamentDate;

	@JsonProperty
	private TournamentMode tournamentGameMode;
		
	@JsonProperty
	private String tournamentPlatforms;
	
	@JsonProperty
	private double tournamentCashPrice;
	
	@JsonProperty
	private int tournamentEntryFee;
	
	@JsonProperty 
	private String tournamentRegion;
	
	@JsonProperty
	private TournamentFormat tournamentFormat;
	
	@JsonProperty
	private TournamentTeamSize tournamentTeamSize;
	
	@JsonProperty
	private String tournamentDescription;
	
	@JsonProperty
	private String tournamentGame;
	
	@JsonProperty
	private String tournamentCodGameMode;
	
	@JsonProperty
	private String tournamentMatchesNumber;
	
	
	public Tournament() {
		super();
	}

	public Tournament(String tournamentName, List<Team> tournamentTeams, TournamentStatus tournamentStatus,
			User tournamentModerator, Date tournamentDate, TournamentMode tournamentGameMode) {
		super();
		this.tournamentName = tournamentName;
		this.tournamentTeams = tournamentTeams;
		this.tournamentStatus = tournamentStatus;
		this.tournamentModerator = tournamentModerator;
		this.tournamentDate = tournamentDate;
		this.tournamentGameMode = tournamentGameMode;
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

	public TournamentMode getTournamentGameMode() {
		return tournamentGameMode;
	}

	public void setTournamentGameMode(TournamentMode tournamentType) {
		this.tournamentGameMode = tournamentType;
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
		return tournamentEntryFee;
	}

	public void setTournamentTokenEntryFee(int tournamentTokenEntryFee) {
		this.tournamentEntryFee = tournamentTokenEntryFee;
	}

	public String getTournamentRegion() {
		return tournamentRegion;
	}

	public void setTournamentRegion(String tournamentRegion) {
		this.tournamentRegion = tournamentRegion;
	}

	public int getLimitNumberOfTeams() {
		return tournamentLimitNumberOfTeams;
	}

	public void setLimitNumberOfTeams(int limitNumberOfTeams) {
		this.tournamentLimitNumberOfTeams = limitNumberOfTeams;
	}

	public TournamentMode getTournamentType() {
		return tournamentGameMode;
	}

	public void setTournamentType(TournamentMode tournamentType) {
		this.tournamentGameMode = tournamentType;
	}

	public TournamentFormat getTournamentFormat() {
		return tournamentFormat;
	}

	public void setTournamentFormat(TournamentFormat tournamentFormat) {
		this.tournamentFormat = tournamentFormat;
	}

	public TournamentTeamSize getTournametTeamSize() {
		return tournamentTeamSize;
	}

	public void setTournametTeamSize(TournamentTeamSize tournametTeamSize) {
		this.tournamentTeamSize = tournametTeamSize;
	}

	public String getTournamentDescription() {
		return tournamentDescription;
	}

	public void setTournamentDescription(String tournamentDescription) {
		this.tournamentDescription = tournamentDescription;
	}

	public String getTournamentGame() {
		return tournamentGame;
	}

	public void setTournamentGame(String tournamentGame) {
		this.tournamentGame = tournamentGame;
	}

	public String getTournamentCodGameMode() {
		return tournamentCodGameMode;
	}

	public void setTournamentCodGameMode(String tournamentCodGameMode) {
		this.tournamentCodGameMode = tournamentCodGameMode;
	}

	public String getTournamentMatchesNumber() {
		return tournamentMatchesNumber;
	}

	public void setTournamentMatchesNumber(String tournamentMatchesNumber) {
		this.tournamentMatchesNumber = tournamentMatchesNumber;
	}
	
}
