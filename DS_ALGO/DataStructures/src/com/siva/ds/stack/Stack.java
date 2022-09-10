package com.siva.ds.stack;

import com.siva.ds.linkedList.LinkedList;

public class Stack <T>{
	
	private LinkedList<T> list;
	
	public Stack(){
		list = new LinkedList<>();
	}
	
	public void push(T data) {
		list.add(data);
	}
	
	public T pop() {
		if(list.isEmpty())
			return null;
		return list.remove(list.size()-1);
	}
	
	public T lookup() {
		return list.getLast();
	}
	
	public int size() {
		return list.size();
	}
	
	@Override
	public String toString() {
		return list.toString();
	}
	
	
}
