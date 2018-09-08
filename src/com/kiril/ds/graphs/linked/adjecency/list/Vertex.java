package com.kiril.ds.graphs.linked.adjecency.list;

public class Vertex {
	String name;
	Node adjList;
	
	public Vertex(String name, Node aNode) {
		this.name = name;
		this.adjList = aNode;
	}
}
