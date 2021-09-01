package com.d1gaming.library.node;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public class BinaryTree implements Serializable {

	private static final long serialVersionUID = 1L;

	@JsonProperty
	private List<TreeRound> binaryTreeRounds;
	
	@JsonProperty
	private int binaryTreeNumberOfRounds;

	
	public BinaryTree() {
		super();
	}
	
	public BinaryTree(List<TreeRound> binaryTreeRounds, int binaryTreeNumberOfRounds) {
		super();
		this.binaryTreeRounds = binaryTreeRounds;
		this.binaryTreeNumberOfRounds = binaryTreeNumberOfRounds;
	}
	
	public List<TreeRound> getBinaryTreeRounds() {
		return binaryTreeRounds;
	}

	public void setBinaryTreeRounds(List<TreeRound> binaryTreeRounds) {
		this.binaryTreeRounds = binaryTreeRounds;
	}

	public int getBinaryTreeNumberOfRounds() {
		return binaryTreeNumberOfRounds;
	}

	public void setBinaryTreeNumberOfRounds(int binaryTreeNumberOfRounds) {
		this.binaryTreeNumberOfRounds = binaryTreeNumberOfRounds;
	}

}
