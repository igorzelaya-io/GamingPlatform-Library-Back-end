package com.d1gaming.library.node;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public class TreeRound {
	
	@JsonProperty
	private TreeNode[] treeRoundNodes;
	
	@JsonProperty
	private int treeRoundLevel;
	
	public TreeRound() {
		super();
	}
	
	public TreeRound(TreeNode[] treeRoundNodes, int treeRoundLevel) {
		this.treeRoundLevel = treeRoundLevel;
		this.treeRoundNodes = treeRoundNodes;
	}

	public TreeNode[] getTreeRoundNodes() {
		return treeRoundNodes;
	}

	public void setTreeRoundNodes(TreeNode[] treeRoundNodes) {
		this.treeRoundNodes = treeRoundNodes;
	}

	public int getTreeRoundLevel() {
		return treeRoundLevel;
	}

	public void setTreeRoundLevel(int treeRoundLevel) {
		this.treeRoundLevel = treeRoundLevel;
	}
	
	
}
