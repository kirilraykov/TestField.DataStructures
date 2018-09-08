package com.kiril.ds.graphs.matrix;

public class App {

	public static void main(String[] args) {
		
		AdjecencyMatrixGraph graph = new AdjecencyMatrixGraph(5);
		graph.addEdge(0, 1);
		graph.addEdge(0, 3);
		graph.addEdge(1, 2);
		graph.addEdge(2, 1);
		graph.addEdge(2, 3);
		graph.addEdge(3, 0);
		
		Object[] values = graph.adj(0);
		for(Object val : values) {
			System.out.println(val);
		}
		
	}

}
