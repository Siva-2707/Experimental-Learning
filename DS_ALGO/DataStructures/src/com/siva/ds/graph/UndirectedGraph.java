package com.siva.ds.graph;

import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;

public class UndirectedGraph {
	
	
	
	private int numberOfNodes;
	private Map<Integer,LinkedList<Integer>> adjacentList;
	public UndirectedGraph() {
		numberOfNodes = 0;
		adjacentList = new TreeMap<>();
	}

	@Override
	public String toString() {
		return adjacentList.toString();
	}
	
	//Adding points to the graph
	public void addVertex(int node) {
		adjacentList.put(node,new LinkedList<>());
		numberOfNodes++;
	}
	
	public void addEdge(int currentNode, int connectingNode) {
		adjacentList.get(currentNode).add(connectingNode);
		adjacentList.get(connectingNode).add(currentNode);
	}
	
	public void addEdge(int currentNode, int[] connectingNodes) {
		for(int connectingNode : connectingNodes) {
			addEdge(currentNode, connectingNode);
		}
	}
	
	
	public int getSize() {
		return numberOfNodes;
	}
	
	//Connecting points in the graph. And can add weightage if needed.
}
