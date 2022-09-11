package com.siva.ds.graph;


public class GraphDemo {

	public static void main(String[] args) {
		
		UndirectedGraph graph = new UndirectedGraph();
		
		graph.addVertex(0);
		graph.addVertex(1);
		graph.addVertex(2);
		graph.addVertex(3);
		graph.addVertex(4);
		graph.addVertex(5);
		graph.addVertex(6);
		
		graph.addEdge(0, new int[] {1,2});
		graph.addEdge(1, new int[] {3,2});
		graph.addEdge(2, 4);
		graph.addEdge(4, new int [] {3,5});
		graph.addEdge(5, 6);
		
		
		System.out.println(graph);
		
	}
	
}
