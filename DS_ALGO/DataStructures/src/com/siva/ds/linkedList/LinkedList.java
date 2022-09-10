package com.siva.ds.linkedList;


public class LinkedList<T> {
	
	Node<T> headNode;
	Node<T> tailNode;
	private boolean detailedOutputFlag = false;
	
	
	private int size = 0;
	
	public int size() {
		return this.size;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public void clear() {
		headNode = null;
		size = 0;
	}
	
	
	public void insert(int index, T data) {
		if(index > size) {
			add(data);
			return;
		}
		
		if(headNode == null) {
			insertDataAtHead(data);
		}
		else if(index == size) {
			add(data);
		}
		else {
			Node<T> newNode = new Node<>(data);
			Node<T> currentNode = headNode;
			currentNode = traverseToIndex(index-1, currentNode);
			newNode.nextNode = currentNode.nextNode;
			currentNode.nextNode = newNode;
			size ++;
		}
//		System.out.println(toString());
	}
	

	private Node<T> traverseToIndex(int index, Node<T> currentNode) {
		
		for(int i = 0 ; i<index; i++) {
			currentNode = currentNode.nextNode;
		}
		return currentNode;
		
	}

	public void add(T data) {
		
		if(headNode == null) {
			insertDataAtHead(data);
		}
		else{
			Node<T> node = new Node<>(data);
			tailNode.nextNode = node;
			tailNode = node;
		}
		size ++;
		
	}
	public void setDetailedOutput(boolean input) {
		this.detailedOutputFlag = input;
	}
	
	public void insertDataAtHead(T data) {
		Node<T> newNode = new Node<>(data);
		if(headNode == null) {
			headNode = newNode;
			tailNode = headNode;
		}
		else {
			newNode.nextNode = headNode;
			headNode = newNode;
			size++;
		}
	}
	
	

	public T remove(int index) {
		if(index>size || headNode == null)
			return null;
		Node<T> returnNode;
		Node<T> currentNode = headNode;
		currentNode = traverseToIndex(index-1, currentNode);
		
		returnNode = currentNode.nextNode;
		if(returnNode == tailNode) {
			tailNode = currentNode;
		}
		currentNode.nextNode = returnNode.nextNode;
		size --;
		return returnNode.data;
		
	}
	
	public void reverse() {
		
		if(size == 1)
			return;
		
		Node<T> first = headNode;
		Node<T> second = first.nextNode;
		first.nextNode = null;
		Node<T> tempNode ;
		
		while(second != null) {
			tempNode = second.nextNode;
			second.nextNode = first;
			first = second;
			second = tempNode;
		}
		headNode = first;
		
	}
	
	public T getFirst() {
		return headNode.data;
	}
	
	public T getLast() {
		return tailNode.data;
	}
	
	
	@Override
	public String toString() {
		
		Node<T> currentNode = headNode;
		StringBuffer output = new StringBuffer();
		if(detailedOutputFlag) {
			output.append(currentNode);	
		}
		else {
			output.append("[");
			while(currentNode != null) {
				output.append(currentNode.data);
				currentNode = currentNode.nextNode;
				if(currentNode != null)
					output.append(",");
			}
			output.append("]");
		}
		return output.toString();
	}
}
