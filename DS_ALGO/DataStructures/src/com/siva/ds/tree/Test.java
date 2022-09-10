package com.siva.ds.tree;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree tree = new BinarySearchTree();
		tree.insert(0);
		tree.insert(2);
		tree.insert(1);
		tree.insert(4);
		tree.insert(15);
		tree.insert(10);
		System.out.println(tree);
		
		tree.remove(2);
		System.out.println(tree);
	}

}
