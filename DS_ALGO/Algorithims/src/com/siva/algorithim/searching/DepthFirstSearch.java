package com.siva.algorithim.searching;

import java.util.ArrayList;
import java.util.List;

import com.siva.ds.tree.BinarySearchTree;

public class DepthFirstSearch {
	
	BinarySearchTree tree;
	public DepthFirstSearch(BinarySearchTree tree) {
		this.tree = tree;
	}
	public List inOrder() {
		return traverseInOrder();
	}
	private List traverseInOrder() {
		return null;
	}
	/*
	preOrder()
	postOrder()
	         6
	     5	    9
	   3   1  7   10
	
	*/
}
