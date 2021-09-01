package com.d1gaming.library.challenge;
import java.io.Serializable;
import java.util.Date;

import com.d1gaming.library.team.Team;
import com.d1gaming.library.tournament.TournamentTeamSize;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public class Challenge implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@JsonProperty
	private String challengeId;
	
	@JsonProperty
	private String challengeName; 
	
	@JsonProperty
	private String challengeGame;

	@JsonProperty
	private String challengeCodGameMode;
	
	@JsonProperty
	private String challengeGameMode;
	
	@JsonProperty
	private String challengePlatforms;
	
	@JsonProperty
	private String challengeMatchesNumber;
	
	@JsonProperty
	private String challengeModeratorId;
	
	@JsonProperty
	private TournamentTeamSize challengeNumberOfPlayersPerTeam;
	
	@JsonProperty
	private ChallengeStatus challengeStatus;
	
	@JsonProperty
	private Date challengeDate;
		
	@JsonProperty
	private Team challengeHostTeam;
	
	@JsonProperty
	private Team challengeAwayTeam;
	
	@JsonProperty
	private Team challengeWinningTeam;
	
	@JsonProperty
	private double challengeCashPrize;
	
	@JsonProperty
	private double challengeTokenFee;
	
	@JsonProperty
	private String challengeRegion;
	
	@JsonProperty
	private boolean startedChallenge;
	
	@JsonProperty
	private int numberOfPlayedMatches;
	
	public Challenge(){
		super();
	} 

	public Challenge(String challengeId, String challengeName, String challengeGame,
			String challengeCodGameMode, String challengeMatchesNumber,
			String challengeModeratorId, TournamentTeamSize challengeNumberOfPlayersPerTeam,
			ChallengeStatus challengeStatus, Date challengeDate, Team challengeHostTeam, Team challengeOpponentTeam,
			Team challengeWinningTeam, double challengeCashPrize, double challengeTokenFee, String challengeRegion,
			boolean startedChallenge) {
		super();
		this.challengeId = challengeId;
		this.challengeName = challengeName;
		this.challengeGame = challengeGame;
		this.challengeCodGameMode = challengeCodGameMode;
		this.challengeMatchesNumber = challengeMatchesNumber;
		this.challengeModeratorId = challengeModeratorId;
		this.challengeNumberOfPlayersPerTeam = challengeNumberOfPlayersPerTeam;
		this.challengeStatus = challengeStatus;
		this.challengeDate = challengeDate;
		this.challengeHostTeam = challengeHostTeam;
		this.challengeAwayTeam = challengeOpponentTeam;
		this.challengeWinningTeam = challengeWinningTeam;
		this.challengeCashPrize = challengeCashPrize;
		this.challengeTokenFee = challengeTokenFee;
		this.challengeRegion = challengeRegion;
		this.startedChallenge = startedChallenge;
	}

	public String getChallengeId() {
		return challengeId;
	}

	public void setChallengeId(String challengeId) {
		this.challengeId = challengeId;
	}

	public String getChallengeName() {
		return challengeName;
	}

	public void setChallengeName(String challengeName) {
		this.challengeName = challengeName;
	}

	public String getChallengeGame() {
		return challengeGame;
	}

	public void setChallengeGame(String challengeGame) {
		this.challengeGame = challengeGame;
	}

	public String getChallengeCodGameMode() {
		return challengeCodGameMode;
	}

	public void setChallengeCodGameMode(String challengeCodGameMode) {
		this.challengeCodGameMode = challengeCodGameMode;
	}

	public String getChallengePlatforms() {
		return challengePlatforms;
	}

	public void setChallengePlatforms(String challengePlatforms) {
		this.challengePlatforms = challengePlatforms;
	}

	public String getChallengeMatchesNumber() {
		return challengeMatchesNumber;
	}

	public void setChallengeMatchesNumber(String challengeMatchesNumber) {
		this.challengeMatchesNumber = challengeMatchesNumber;
	}

	public String getChallengeModeratorId() {
		return challengeModeratorId;
	}

	public void setChallengeModeratorId(String challengeModeratorId) {
		this.challengeModeratorId = challengeModeratorId;
	}

	public TournamentTeamSize getChallengeNumberOfPlayersPerTeam() {
		return challengeNumberOfPlayersPerTeam;
	}

	public void setChallengeNumberOfPlayersPerTeam(TournamentTeamSize challengeNumberOfPlayersPerTeam) {
		this.challengeNumberOfPlayersPerTeam = challengeNumberOfPlayersPerTeam;
	}

	public ChallengeStatus getChallengeStatus() {
		return challengeStatus;
	}

	public void setChallengeStatus(ChallengeStatus challengeStatus) {
		this.challengeStatus = challengeStatus;
	}

	public Date getChallengeDate() {
		return challengeDate;
	}

	public void setChallengeDate(Date challengeDate) {
		this.challengeDate = challengeDate;
	}

	public Team getChallengeHostTeam() {
		return challengeHostTeam;
	}

	public void setChallengeHostTeam(Team challengeHostTeam) {
		this.challengeHostTeam = challengeHostTeam;
	}

	public Team getChallengeAwayTeam() {
		return challengeAwayTeam;
	}

	public void setChallengeAwayTeam(Team challengeAwayTeam) {
		this.challengeAwayTeam = challengeAwayTeam;
	}

	public Team getChallengeWinningTeam() {
		return challengeWinningTeam;
	}

	public void setChallengeWinningTeam(Team challengeWinningTeam) {
		this.challengeWinningTeam = challengeWinningTeam;
	}

	public double getChallengeCashPrize() {
		return challengeCashPrize;
	}

	public void setChallengeCashPrize(double challengeCashPrize) {
		this.challengeCashPrize = challengeCashPrize;
	}

	public double getChallengeTokenFee() {
		return challengeTokenFee;
	}

	public void setChallengeTokenFee(double challengeTokenFee) {
		this.challengeTokenFee = challengeTokenFee;
	}

	public String getChallengeRegion() {
		return this.challengeRegion;
	}

	public void setChallengeRegion(String challengeRegion) {
		this.challengeRegion = challengeRegion;
	}

	public boolean isStartedChallenge() {
		return startedChallenge;
	}

	public void setStartedChallenge(boolean startedChallenge) {
		this.startedChallenge = startedChallenge;
	}

	public String getChallengeGameMode() {
		return challengeGameMode;
	}

	public void setChallengeGameMode(String challengeGameMode) {
		this.challengeGameMode = challengeGameMode;
	}

	public int getNumberOfPlayedMatches() {
		return numberOfPlayedMatches;
	}

	public void setNumberOfPlayedMatches(int numberOfPlayedMatches) {
		this.numberOfPlayedMatches = numberOfPlayedMatches;
	}

}