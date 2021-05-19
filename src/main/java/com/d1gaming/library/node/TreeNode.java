package com.d1gaming.library.node;

import com.d1gaming.library.match.Match;

public class TreeNode {

	private Match value;
	
	private TreeNode left;
	
	private TreeNode right;
	
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
