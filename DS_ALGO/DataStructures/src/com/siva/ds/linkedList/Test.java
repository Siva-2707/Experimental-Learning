package com.siva.ds.linkedList;

public class Test {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		
		list.insert(0, 1);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.insert(2, 5);
		list.add(9);
		System.out.println(list);
		System.out.println(list.remove(3));
		System.out.println(list);
		list.setDetailedOutput(true);
		list.reverse();
		System.out.println(list);
	}

}
