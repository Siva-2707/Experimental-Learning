package com.siva.ds.tree;

public class BinaryTreeNode {

	public int data;
	public BinaryTreeNode leftNode;
	public BinaryTreeNode rightNode;
	
	public BinaryTreeNode(int data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "\n{data:" + data + ", leftNode:" + leftNode + ", rightNode:" + rightNode + "}";
	}
	
	
}
