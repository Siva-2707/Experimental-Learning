package com.siva.algorithim.searching;

import java.util.LinkedList;
import java.util.List;

import com.siva.ds.tree.BinarySearchTree;
import com.siva.ds.tree.BinaryTreeNode;

public class DepthFirstSearch {
	
	BinarySearchTree tree;
	public DepthFirstSearch(BinarySearchTree tree) {
		this.tree = tree;
	}
	public List<Integer> inOrder() {
		return traverseInOrder(tree.rootNode, new LinkedList<Integer>());
	}
	public List<Integer> preOrder(){
		return traversePreOrder(tree.rootNode, new LinkedList<Integer>());
	}
	
	public List<Integer> postOrder(){
		return traversePostOrder(tree.rootNode, new LinkedList<Integer>());
	}
	
	
	//Left Node -> Parent Node -> Right Node 
	private List<Integer> traverseInOrder(BinaryTreeNode node, List<Integer> list) {
		if(node.leftNode != null) {
			list = traverseInOrder(node.leftNode, list);
		}
		list.add(node.data);
		if(node.rightNode != null) {
			list = traverseInOrder(node.rightNode, list);
		}
		
		return list;
	}
	//Parent Node -> Left Node -> Right Node
	private List<Integer> traversePreOrder(BinaryTreeNode node, List<Integer> list) {
		
		list.add(node.data);
		if(node.leftNode != null) {
			list = traversePreOrder(node.leftNode, list);
		}
		if(node.rightNode != null)
			list = traversePreOrder(node.rightNode, list);
		
		return list;
	}
	
	private List<Integer> traversePostOrder(BinaryTreeNode node, List<Integer> list){
		
		if(node.leftNode != null) {
			list = traversePostOrder(node.leftNode, list);
		}
		if(node.rightNode != null)
			list = traversePostOrder(node.rightNode, list);
		
		list.add(node.data);
		return list;
	}
	/*
	preOrder()
	postOrder()
	        
	         7
	       /   \
	     5	    9
	   1   6    8 10
	     2
	*/
}
