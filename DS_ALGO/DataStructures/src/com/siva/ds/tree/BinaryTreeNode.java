package com.siva.ds.tree;

public class BinaryTreeNode {

	int data;
	BinaryTreeNode leftNode;
	BinaryTreeNode rightNode;
	
	public BinaryTreeNode(int data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "\n{data:" + data + ", leftNode:" + leftNode + ", rightNode:" + rightNode + "}";
	}
	
	
}
