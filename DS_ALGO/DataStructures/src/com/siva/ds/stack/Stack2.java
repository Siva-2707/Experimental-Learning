package com.siva.ds.stack;

import com.siva.ds.linkedList.Node;

public class Stack2<T>{
	
	Node<T> top = null;
	
	private int size = 0;
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public int size() {
		return this.size;
	}
	
	public void push(T data) {
		Node<T> newNode = new Node<>(data);
		if(top == null) {
			top = newNode;
		}
		else {
			newNode.nextNode = top;
			top = newNode;
		}
		
	}
	
	public T peek() {
		return top.data;
	}
	
	public T pop() {
		if(top != null) {
			T data = top.data;
			top = top.nextNode;
			size --;
			return data;
		}
		System.out.println("No data in the stack");
			return null;
	}

	@Override
	public String toString() {
//		return top.toString();
		StringBuffer sb = new StringBuffer();
		Node<T> refNode = top;
		while(refNode != null) {
			sb.append(" ---\n");
			sb.append("| "+refNode.data+" |\n");
			refNode = refNode.nextNode;
			if(refNode == null) {
				sb.append(" ---");
			}
		}
		return sb.toString();
	}
	
	
	
	
	
}
