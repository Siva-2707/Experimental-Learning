package com.siva.ds.queue;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<Integer> queue = new Queue<>();
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		System.out.println(queue);

	}

}
