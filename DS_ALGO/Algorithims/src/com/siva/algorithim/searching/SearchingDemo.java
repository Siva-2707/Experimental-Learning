package com.siva.algorithim.searching;

import com.siva.ds.queue.Queue;
import com.siva.ds.tree.*;

public class SearchingDemo {

	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();
		tree.insert(7).insert(5).insert(1).insert(6).insert(2).insert(9).insert(8).insert(10);
	
		
		//Breath first search testing
		/*  
		BreathFirstSearch bfs = new BreathFirstSearch(tree);
		boolean result1 = bfs.search(90);
		System.out.println(result1);
		boolean result2 = bfs.searchRecursive(9, new Queue<BinaryTreeNode>(tree.rootNode));
		System.out.println(result2);
		
		*/
		
		
		//Depth first search testing.
		 
		DepthFirstSearch dfs = new DepthFirstSearch(tree);
//		System.out.println(dfs.inOrder());
//		System.out.println(dfs.preOrder());
		System.out.println(dfs.postOrder());
		
		

	}

}
