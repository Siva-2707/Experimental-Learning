package com.siva.ds.linkedList;

public class Node<T> {
	
	public T data;
	public Node<T> nextNode;
	
	public Node(T data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + ", nextNode=" + nextNode + "]";
	}
	
	
	
}
