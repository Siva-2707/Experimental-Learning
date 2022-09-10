package com.siva.ds.tree;

public class BinarySearchTree {

	BinaryTreeNode rootNode = null;
	
	
	public BinarySearchTree() {
		
	}
	
	public BinarySearchTree(int data) {
		defineRoot(data);
	}
	
	public void defineRoot(int data) {
		rootNode = new BinaryTreeNode(data);
	}
	
	public void insert(int data) {
		if(rootNode == null) {
			defineRoot(data);
			return;
		}	
		else {
			BinaryTreeNode refNode = rootNode;
			while(refNode != null) {
				if(data > refNode.data) {
					if(refNode.rightNode == null) {
						refNode.rightNode = new BinaryTreeNode(data);
						break;
					}
					refNode = refNode.rightNode;
				}
				else {
					if(refNode.leftNode == null) {
						refNode.leftNode = new BinaryTreeNode(data);
						break;
					}
					refNode = refNode.leftNode;
				}
			}
		}
	}
	
	public boolean lookup(int val) {
		
		if(rootNode == null)
			return false;
		BinaryTreeNode refNode = rootNode;
		
		while(refNode != null) {
			if(val < refNode.data) {
				//Go left
				refNode = refNode.leftNode;
			}
			else if(val > refNode.data) {
				//Go right
				refNode = refNode.rightNode;
			}
			else if(val == refNode.data) {
				return true;
			}
			
		}
		
		return false;
		
	}
	
	public void remove(int val) {
		
		if(rootNode == null) {
			return;
		}
		
		
		BinaryTreeNode refNode = rootNode;
		BinaryTreeNode  parentNode = null;
		while(refNode != null) {
			if(val < refNode.data) {
				//Go left
				parentNode = refNode;
				refNode = refNode.leftNode;
			}
			else if(val > refNode.data) {
				//Go right
				parentNode = refNode;
				refNode = refNode.rightNode;
			}
			else if(val == refNode.data) {
				
				//For handling tail element.
				if(refNode.leftNode == null && refNode.rightNode == null) {
					if(parentNode.rightNode == refNode) {
						parentNode.rightNode = null;
					}
					else {
						parentNode.leftNode = null;
					}
					return;
				}
				
				//For handling element when right node is null
				//(Where there is no greater element than the  current element)
				else if(refNode.rightNode == null) {
					if(parentNode.rightNode == refNode) {
						parentNode.rightNode = refNode.leftNode;
					}
					else {
						parentNode.leftNode = refNode.leftNode;
					}
					return;
				}
				
				//For handling element when right node is present and sub nodes are also present for right node.
				else{
					
					BinaryTreeNode innerLoopNode = refNode;
					//Looping to find the smallest tail element of the right side branch.
					while(innerLoopNode.rightNode != null) {
						BinaryTreeNode tempNode = null;
						innerLoopNode = innerLoopNode.rightNode;
						while(innerLoopNode.leftNode != null) {
							tempNode = innerLoopNode;
							innerLoopNode = innerLoopNode.leftNode;
						}
						if(innerLoopNode.rightNode == null) {
							tempNode.leftNode = null;
						}
					}
					//Once found, replacing the found element with the element that is to be removed.
					innerLoopNode.rightNode = refNode.rightNode;
					innerLoopNode.leftNode = refNode.leftNode;
					if(parentNode.rightNode == refNode) {
						parentNode.rightNode = innerLoopNode;
					}
					else {
						parentNode.leftNode = innerLoopNode;
					}
					break;
				}
			}
		}
		
	}

	@Override
	public String toString() {
		return "BinarySearchTree [rootNode=" + rootNode + "]";
	}
	
	
	
}
