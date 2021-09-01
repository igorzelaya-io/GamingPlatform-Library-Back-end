package com.d1gaming.library.node;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public class TreeRound implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@JsonProperty
	private List<TreeNode> treeRoundNodes;
	
	@JsonProperty
	private int treeRoundLevel;
	
	public TreeRound() {
		super();
	}
	
	public TreeRound(List<TreeNode> treeRoundNodes, int treeRoundLevel) {
		this.treeRoundLevel = treeRoundLevel;
		this.treeRoundNodes = treeRoundNodes;
	}

	public List<TreeNode> getTreeRoundNodes() {
		return treeRoundNodes;
	}

	public void setTreeRoundNodes(List<TreeNode> treeRoundNodes) {
		this.treeRoundNodes = treeRoundNodes;
	}

	public int getTreeRoundLevel() {
		return treeRoundLevel;
	}

	public void setTreeRoundLevel(int treeRoundLevel) {
		this.treeRoundLevel = treeRoundLevel;
	}
	
	
}
