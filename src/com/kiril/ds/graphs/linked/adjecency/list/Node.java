package com.kiril.ds.graphs.linked.adjecency.list;

public class Node {
	public int vertexIndex;
	public Node next;
	
	public Node(int vertexIndex, Node next) {
		this.vertexIndex = vertexIndex;
		this.next = next;
	}
}
