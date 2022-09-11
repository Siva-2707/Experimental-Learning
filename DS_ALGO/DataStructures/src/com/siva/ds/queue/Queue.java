package com.siva.ds.queue;

import com.siva.ds.linkedList.Node;

public class Queue<T> {
	
	private Node<T> first;
	private Node<T> last;
	
	public void enqueue(T data) {
		
		Node<T> newNode = new Node<T>(data);
		if(first == null) {
			last = newNode;
			first = last;
		}
		else {
			last.nextNode = newNode;
			last = newNode;
		}
		
	}
	
	public T dequeue() {
		if(first != null) {
			T data = first.data;
			first = first.nextNode;
			return data;
		}
		else {
			System.out.println("Queue is empty");
			return null;
		}
	}
	
	public T peek() {
		if(first != null) {
			return first.data;
		}
		return null;
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		Node<T> refNode = first;
		sb.append(" <--<--Queue direction--<--<\n");
		sb.append("[");
		while(refNode != null) {
			sb.append(refNode.data);
			refNode = refNode.nextNode;
			if(refNode != null) {
				sb.append("|");
			}
		}
		sb.append("]");
		return sb.toString();
	}

}
