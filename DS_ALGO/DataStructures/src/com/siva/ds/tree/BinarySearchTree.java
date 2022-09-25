package com.siva.ds.tree;

public class BinarySearchTree {

	public BinaryTreeNode rootNode = null;
	
	
	public BinarySearchTree() {
		
	}
	
	public BinarySearchTree(int data) {
		defineRoot(data);
	}
	
	public void defineRoot(int data) {
		rootNode = new BinaryTreeNode(data);
	}
	
	public BinarySearchTree insert(int data) {
		
		//Checking if root node is null and seting the value for it.
		if(rootNode == null) {
			defineRoot(data);
			return this; 
		}	
		else {
			BinaryTreeNode refNode = rootNode;
			//Looping through each node
			while(refNode != null) {
				//Checking if the data that is to be inserted is greater than the current node data.
				if(data > refNode.data) {
					//If it greater and the right node is null. Inserting data.
					if(refNode.rightNode == null) {
						refNode.rightNode = new BinaryTreeNode(data);
						break;
					}
					//If right node is not null, moving to the right node.
					refNode = refNode.rightNode;
				}
				//If the required data is less than the current node.
				else {
					//And if the left node is null, inserting data into it.
					if(refNode.leftNode == null) {
						refNode.leftNode = new BinaryTreeNode(data);
						break;
					}
					//Else just moving to the left node.
					refNode = refNode.leftNode;
				}
			}
		}
		return this;
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
				
				//Case 1: For handling tail element.
				if(refNode.leftNode == null && refNode.rightNode == null) {
					if(parentNode.rightNode == refNode) {
						parentNode.rightNode = null;
					}
					else {
						parentNode.leftNode = null;
					}
					return;
				}
				
				//Case 2: For handling element when right node is null
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
				
				//Case 3: For handling element when right node is present and sub nodes are also present for right node.
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
