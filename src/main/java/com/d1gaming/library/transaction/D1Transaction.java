package com.d1gaming.library.transaction;

import java.time.Instant;

import com.d1gaming.library.service.D1Service;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public class D1Transaction {
	
	@JsonProperty
	private String transactionId;
	
	@JsonProperty
	private D1Service transactionServiceCharged;
	
	@JsonProperty
	private Instant transactionTime;
	
	@JsonProperty
	private TransactionStatus transactionStatus;

	public D1Transaction() {
		
	}

	public D1Transaction(D1Service transactionServiceCharged, Instant transactionTime,
			TransactionStatus transactionStatus) {
		super();
		this.transactionServiceCharged = transactionServiceCharged;
		this.transactionTime = transactionTime;
		this.transactionStatus = transactionStatus;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public D1Service getTransactionServiceCharged() {
		return transactionServiceCharged;
	}

	public void setTransactionServiceCharged(D1Service transactionServiceCharged) {
		this.transactionServiceCharged = transactionServiceCharged;
	}

	public Instant getTransactionTime() {
		return transactionTime;
	}

	public void setTransactionTime(Instant transactionTime) {
		this.transactionTime = transactionTime;
	}

	public TransactionStatus getTransactionStatus() {
		return transactionStatus;
	}

	public void setTransactionStatus(TransactionStatus transactionStatus) {
		this.transactionStatus = transactionStatus;
	}
}