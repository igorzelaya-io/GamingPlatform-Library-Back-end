package com.d1gaming.library.match;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public class DisputedMatch {

	@JsonProperty
	private String disputedMatchDocumentId;
	
	@JsonProperty
	private String disputedMatchChallengeId;
	
	@JsonProperty
	private String disputedMatchTournamentId;
	
	@JsonProperty
	private String disputedMatchMatchId;
	
	@JsonProperty
	private String disputedMatchImageBytes;
	
	@JsonProperty
	private DisputedMatchStatus disputedMatchStatus;
	
	public DisputedMatch() {
		super();
	}

	public DisputedMatch(String disputedMatchDocumentId, String disputedMatchChallengeId,
			String disputedMatchTournamentId, String disputedMatchMatchId, String disputedMatchImageBytes, DisputedMatchStatus disputedMatchStatus) {
		super();
		this.disputedMatchDocumentId = disputedMatchDocumentId;
		this.disputedMatchChallengeId = disputedMatchChallengeId;
		this.disputedMatchTournamentId = disputedMatchTournamentId;
		this.disputedMatchMatchId = disputedMatchMatchId;
		this.disputedMatchImageBytes = disputedMatchImageBytes;
		this.disputedMatchStatus = disputedMatchStatus;
	}

	public String getDisputedMatchDocumentId() {
		return disputedMatchDocumentId;
	}

	public void setDisputedMatchDocumentId(String disputedMatchDocumentId) {
		this.disputedMatchDocumentId = disputedMatchDocumentId;
	}

	public String getDisputedMatchChallengeId() {
		return disputedMatchChallengeId;
	}

	public void setDisputedMatchChallengeId(String disputedMatchChallengeId) {
		this.disputedMatchChallengeId = disputedMatchChallengeId;
	}

	public String getDisputedMatchTournamentId() {
		return disputedMatchTournamentId;
	}

	public void setDisputedMatchTournamentId(String disputedMatchTournamentId) {
		this.disputedMatchTournamentId = disputedMatchTournamentId;
	}

	public String getDisputedMatchMatchId() {
		return disputedMatchMatchId;
	}

	public void setDisputedMatchMatchId(String disputedMatchMatchId) {
		this.disputedMatchMatchId = disputedMatchMatchId;
	}

	public String getDisputedMatchImageBytes() {
		return disputedMatchImageBytes;
	}

	public void setDisputedMatchImageBytes(String disputedMatchImageBytes) {
		this.disputedMatchImageBytes = disputedMatchImageBytes;
	}

	public DisputedMatchStatus getDisputedMatchStatus() {
		return disputedMatchStatus;
	}

	public void setDisputedMatchStatus(DisputedMatchStatus disputedMatchStatus) {
		this.disputedMatchStatus = disputedMatchStatus;
	}
	
}
