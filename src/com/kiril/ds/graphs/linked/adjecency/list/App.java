package com.kiril.ds.graphs.linked.adjecency.list;

public class App {

	public static void main(String[] args) {
		BetterGraph graph = new BetterGraph(5);
		
		graph.addVertex("St Peterson");
		graph.addVertex("Paroco");
		graph.addVertex("Sandy Shores");
		graph.addVertex("Upton Beach");
		graph.addVertex("Tsarigradsko");
		
		graph.addEdges("St Peterson", "Paroco");
		graph.addEdges("St Peterson", "Upton Beach");
		graph.addEdges("Paroco", "Tsarigradsko");
		graph.addEdges("Paroco", "Upton Beach");
		graph.addEdges("Sandy Shores", "Paroco");
		graph.addEdges("Upton Beach", "St Peterson");
		graph.addEdges("Upton Beach", "Sandy Shores");
		graph.addEdges("Tsarigradsko", "St Peterson");
		
		graph.print();

	}

}
