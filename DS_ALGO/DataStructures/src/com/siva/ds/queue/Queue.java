package com.siva.ds.queue;

import com.siva.ds.linkedList.Node;

public class Queue<T> {
	
	private Node<T> first;
	private Node<T> last;
	public int size = 0;
	public Queue(){
		
	}
	
	public Queue(T data){
		Node<T> newNode = new Node<T>(data);
		this.last = newNode;
		this.first = last;
		size++;
	}
	
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
		size++;
	}
	
	public T dequeue() {
		if(first != null) {
			T data = first.data;
			first = first.nextNode;
			size--;
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
	
	public boolean isEmpty() {
		return size == 0;
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
