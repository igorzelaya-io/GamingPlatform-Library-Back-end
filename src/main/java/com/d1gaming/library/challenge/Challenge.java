package com.d1gaming.library.challenge;
import java.time.Instant;
import java.util.Map;

import com.d1gaming.library.team.Team;
import com.d1gaming.library.user.User;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public class Challenge {
	
	Challenge(){
		
	}
	
	@JsonProperty
	private String challengeId;
	
	@JsonProperty
	private String challengeName;
	
	@JsonProperty
	private User challengeUserAdmin;
	
	@JsonProperty
	private ChallengeStatus challengeStatus;
	
	@JsonProperty
	private Instant challengeDate;
	
	@JsonProperty
	private Map<String,Object> challengeHostPlayers;

	@JsonProperty
	private Map<String,Object> challengeOpponentPlayers;
	
	@JsonProperty
	private Team challengeHostTeam;
	
	@JsonProperty
	private Team challengeOpponentTeam;
	
	@JsonProperty
	private double challengeCashPrize;
	
	@JsonProperty
	private double challengeTokenFee;
	
	public Challenge(String challengeId, String challengeName, User challengeUserAdmin,ChallengeStatus challengeStatus, Instant challengeDate, Map<String,Object> challengeHost, Map<String, Object> challengeOpponent ,Team challengeHostTeam,Team challengeOpponentTeam, double challengeCashPrice, double challengeTokenFee) {
		this.challengeId = challengeId;
		this.challengeName = challengeName;
		this.challengeUserAdmin = challengeUserAdmin;
		this.challengeStatus = challengeStatus;
		this.challengeDate = challengeDate;
		this.challengeHostPlayers = challengeHost;
		this.challengeOpponentPlayers = challengeOpponent;
		this.challengeHostTeam = challengeHostTeam;
		this.challengeOpponentTeam = challengeOpponentTeam;
		this.challengeCashPrize = challengeCashPrice;
		this.challengeTokenFee = challengeTokenFee;
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
	
	public User getChallengeUserAdmin() {
		return this.challengeUserAdmin;
	}
	
	public void setChallengeUserAdmin(User user) {
		this.challengeUserAdmin = user;
	}

	public ChallengeStatus getChallengeStatus() {
		return challengeStatus;
	}

	public void setChallengeStatus(ChallengeStatus challengeStatus) {
		this.challengeStatus = challengeStatus;
	}

	public Instant getChallengeDate() {
		return challengeDate;
	}

	public void setChallengeDate(Instant challengeDate) {
		this.challengeDate = challengeDate;
	}

	public Map<String,Object> getChallengeHostPlayers() {
		return challengeHostPlayers;
	}

	public void setChallengeHostPlayers(Map<String,Object> challengeHost) {
		this.challengeHostPlayers = challengeHost;
	}

	public Map<String,Object> getChallengeOpponentPlayers() {
		return challengeOpponentPlayers;
	}

	public void setChallengeOpponentPlayers(Map<String,Object> challengeOpponent) {
		this.challengeOpponentPlayers = challengeOpponent;
	}

	public Team getChallengeHostTeam() {
		return challengeHostTeam;
	}

	public void setChallengeHostTeam(Team challengeHostTeam) {
		this.challengeHostTeam = challengeHostTeam;
	}

	public Team getChallengeOpponentTeam() {
		return challengeOpponentTeam;
	}

	public void setChallengeOpponentTeam(Team challengeOpponentTeam) {
		this.challengeOpponentTeam = challengeOpponentTeam;
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

}
