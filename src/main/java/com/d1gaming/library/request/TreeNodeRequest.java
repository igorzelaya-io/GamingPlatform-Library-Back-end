package com.d1gaming.library.request;

import com.d1gaming.library.node.TreeNode;
import com.d1gaming.library.tournament.Tournament;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public class TreeNodeRequest {

	@JsonProperty
	private TreeNode treeNodeTree;
	
	@JsonProperty
	private Tournament treeNodeTournament;
	
	
	public TreeNodeRequest() {
		super();
	}

	public TreeNodeRequest(TreeNode treeNodeTree, Tournament treeNodeTournament) {
		super();
		this.treeNodeTree = treeNodeTree;
		this.treeNodeTournament = treeNodeTournament;
	}

	public TreeNode getTreeNodeTree() {
		return treeNodeTree;
	}

	public void setTreeNodeTree(TreeNode treeNodeTree) {
		this.treeNodeTree = treeNodeTree;
	}

	public Tournament getTreeNodeTournament() {
		return treeNodeTournament;
	}

	public void setTreeNodeTournament(Tournament treeNodeTournament) {
		this.treeNodeTournament = treeNodeTournament;
	}
	
}
