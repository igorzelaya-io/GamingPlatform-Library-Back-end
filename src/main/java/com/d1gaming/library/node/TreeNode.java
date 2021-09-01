package com.d1gaming.library.node;

import java.io.Serializable;

import com.d1gaming.library.match.Match;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public class TreeNode implements Serializable {

	private static final long serialVersionUID = 1L;

	@JsonProperty
	private Match value;
	
	@JsonProperty
	private TreeNode left;
	
	@JsonProperty
	private TreeNode right;
	
	@JsonProperty
	private TreeNode rootNode;
	
	public TreeNode() {
		super();
	}
	
	public TreeNode(Match value) {
		super();
		this.value = value;
		this.left = null;
		this.right = null;
		this.rootNode = null;
	}

	public Match getValue() {
		return value;
	}

	public void setValue(Match value) {
		this.value = value;
	}

	public TreeNode getLeft() {
		return left;
	}

	public void setLeft(TreeNode left) {
		this.left = left;
	}

	public TreeNode getRight() {
		return right;
	}

	public void setRight(TreeNode right) {
		this.right = right;
	}

	public TreeNode getRootNode() {
		return rootNode;
	}

	public void setRootNode(TreeNode rootNode) {
		this.rootNode = rootNode;
	}

}
