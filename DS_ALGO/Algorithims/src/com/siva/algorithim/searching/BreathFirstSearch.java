package com.siva.algorithim.searching;

import com.siva.ds.linkedList.LinkedList;
import com.siva.ds.queue.Queue;
import com.siva.ds.tree.*;
public class BreathFirstSearch {

	BinarySearchTree tree = null;
	
	public BreathFirstSearch(BinarySearchTree tree) {
		this.tree = tree;
	}
	
	public boolean search(int valueToBeFound) {
		BinaryTreeNode currentNode = tree.rootNode;
		LinkedList<Integer> bfsList = new LinkedList<>();
		Queue<BinaryTreeNode> queue = new Queue<>();
		
		
		queue.enqueue(currentNode);
		while(!queue.isEmpty()) {
			currentNode = queue.dequeue();
			bfsList.add(currentNode.data);
			
			if(currentNode.data == valueToBeFound) {
				System.out.println(bfsList);
				return true;
			}
			if(currentNode.leftNode != null) {
				queue.enqueue(currentNode.leftNode);
			}
			if(currentNode.rightNode != null) {
				queue.enqueue(currentNode.rightNode);
			}
		}
		System.out.println(bfsList);
		return false;
	}
	
	public boolean searchRecursive(int valueToBeFound, Queue<BinaryTreeNode> queue) {
			if(!queue.isEmpty()) {
				BinaryTreeNode currentNode = queue.dequeue();
				if(currentNode.data == valueToBeFound)
					return true;
				if(currentNode.leftNode != null) {
					queue.enqueue(currentNode.leftNode);
				}
				if(currentNode.rightNode != null) {
					queue.enqueue(currentNode.rightNode);
				}
				return searchRecursive(valueToBeFound, queue);
			}
		return false;
		
		
	}
	
}
