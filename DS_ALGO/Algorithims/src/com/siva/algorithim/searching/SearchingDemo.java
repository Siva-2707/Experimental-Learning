package com.siva.algorithim.searching;

import com.siva.ds.queue.Queue;
import com.siva.ds.tree.*;

public class SearchingDemo {

	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();
		tree.insert(0);
		tree.insert(1);
		tree.insert(3);
		tree.insert(4);
		tree.insert(10);
		tree.insert(2);
		tree.insert(90);
		
		BreathFirstSearch bfs = new BreathFirstSearch(tree);
//		boolean result1 = bfs.search(90);
//		System.out.println(result1);
		boolean result2 = bfs.searchRecursive(9, new Queue<BinaryTreeNode>(tree.rootNode));
		System.out.println(result2);
	}

}
