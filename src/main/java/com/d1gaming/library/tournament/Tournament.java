 package com.d1gaming.library.tournament;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Stack;

import com.d1gaming.library.node.BinaryTree;
import com.d1gaming.library.team.Team;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.google.cloud.firestore.annotation.Exclude;

@JsonSerialize
public class Tournament implements Serializable {

	private static final long serialVersionUID = 1L;

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
	private String tournamentModeratorId;

	@JsonProperty
	private Date tournamentDate;

	@JsonProperty
	private String tournamentGameMode;
		
	@JsonProperty
	private String tournamentPlatforms;
	
	@JsonProperty
	private double tournamentCashPrize;
	
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
	
	@JsonProperty
	private Stack<Team> tournamentTeamBracketStack;
	
	@JsonProperty
	private List<Team> tournamentLeaderboardForLeague;
	
	@JsonProperty
	private boolean isStartedTournament;
	
	@JsonIgnore
	private String tournamentBase64BracketTree;
	
	@JsonProperty
	private BinaryTree tournamentBinaryTree;
	
	@JsonProperty
	private Team tournamentWinningTeam;
	
	public Tournament() {
		super();
	}

	public Tournament(String tournamentName, List<Team> tournamentTeams, TournamentStatus tournamentStatus,
			String tournamentModeratorId, Date tournamentDate, String tournamentGameMode) {
		super();
		this.tournamentName = tournamentName;
		this.tournamentTeams = tournamentTeams;
		this.tournamentStatus = tournamentStatus;
		this.tournamentModeratorId = tournamentModeratorId;
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

	public int getTournamentLimitNumberOfTeams() {
		return tournamentLimitNumberOfTeams;
	}

	public void setTournamentLimitNumberOfTeams(int tournamentLimitNumberOfTeams) {
		this.tournamentLimitNumberOfTeams = tournamentLimitNumberOfTeams;
	}

	public int getTournamentNumberOfTeams() {
		return tournamentNumberOfTeams;
	}

	public void setTournamentNumberOfTeams(int tournamentNumberOfTeams) {
		this.tournamentNumberOfTeams = tournamentNumberOfTeams;
	}

	public TournamentStatus getTournamentStatus() {
		return tournamentStatus;
	}

	public void setTournamentStatus(TournamentStatus tournamentStatus) {
		this.tournamentStatus = tournamentStatus;
	}

	public String getTournamentModeratorId() {
		return tournamentModeratorId;
	}

	public void setTournamentModeratorId(String tournamentModeratorId) {
		this.tournamentModeratorId = tournamentModeratorId;
	}

	public Date getTournamentDate() {
		return tournamentDate;
	}

	public void setTournamentDate(Date tournamentDate) {
		this.tournamentDate = tournamentDate;
	}

	public String getTournamentGameMode() {
		return tournamentGameMode;
	}

	public void setTournamentGameMode(String tournamentGameMode) {
		this.tournamentGameMode = tournamentGameMode;
	}

	public String getTournamentPlatforms() {
		return tournamentPlatforms;
	}

	public void setTournamentPlatforms(String tournamentPlatforms) {
		this.tournamentPlatforms = tournamentPlatforms;
	}

	public double getTournamentCashPrize() {
		return tournamentCashPrize;
	}

	public void setTournamentCashPrize(double tournamentCashPrize) {
		this.tournamentCashPrize = tournamentCashPrize;
	}

	public int getTournamentEntryFee() {
		return tournamentEntryFee;
	}

	public void setTournamentEntryFee(int tournamentEntryFee) {
		this.tournamentEntryFee = tournamentEntryFee;
	}

	public String getTournamentRegion() {
		return tournamentRegion;
	}

	public void setTournamentRegion(String tournamentRegion) {
		this.tournamentRegion = tournamentRegion;
	}

	public TournamentFormat getTournamentFormat() {
		return tournamentFormat;
	}

	public void setTournamentFormat(TournamentFormat tournamentFormat) {
		this.tournamentFormat = tournamentFormat;
	}

	public TournamentTeamSize getTournamentTeamSize() {
		return tournamentTeamSize;
	}

	public void setTournamentTeamSize(TournamentTeamSize tournamentTeamSize) {
		this.tournamentTeamSize = tournamentTeamSize;
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

	public Stack<Team> getTournamentTeamBracketStack() {
		return tournamentTeamBracketStack;
	}

	public void setTournamentTeamBracketStack(Stack<Team> tournamentTeamBracketStack) {
		this.tournamentTeamBracketStack = tournamentTeamBracketStack;
	}

	public List<Team> getTournamentLeaderboardForLeague() {
		return tournamentLeaderboardForLeague;
	}

	public void setTournamentLeaderboardForLeague(List<Team> tournamentLeaderboardForLeague) {
		this.tournamentLeaderboardForLeague = tournamentLeaderboardForLeague;
	}

	public boolean isStartedTournament() {
		return isStartedTournament;
	}

	public void setStartedTournament(boolean isStartedTournament) {
		this.isStartedTournament = isStartedTournament;
	}

	public String getTournamentBase64BracketTree() {
		return tournamentBase64BracketTree;
	}
	
	public void setTournamentBase64BracketTree(String tournamentBase64BracketTree) {
		this.tournamentBase64BracketTree = tournamentBase64BracketTree;
	}

	@Exclude
	public BinaryTree getTournamentBinaryTree() {
		return tournamentBinaryTree;
	}

	public void setTournamentBinaryTree(BinaryTree tournamentBinaryTree) {
		this.tournamentBinaryTree = tournamentBinaryTree;
	}
	
	public Team getTournamentWinningTeam() {
		return this.tournamentWinningTeam;
	}
	
	public void setTournamentWinningTeam(Team winningTeam) {
		this.tournamentWinningTeam = winningTeam;
	}

}
