package com.kiril.ds.graphs.linked.adjecency.list;

public class BetterGraph {
	Vertex[] arrayOfLists;
	int indexCounter;
	boolean undirected = true;
	
	public BetterGraph(int vCount) {
		arrayOfLists = new Vertex[vCount];
	}
	
	public void addVertex(String name) {
		arrayOfLists[indexCounter] = new Vertex(name, null);
		indexCounter++;
	}
	
	public void addEdges(String sourceVertex, String destinationVertex) {
		int vertex1Index = getIndex(sourceVertex);
		int vertex2Index = getIndex(destinationVertex);
		
		arrayOfLists[vertex1Index].adjList = new Node(vertex2Index, arrayOfLists[vertex1Index].adjList);
	}

	private int getIndex(String destinationVertex) {
		for(int i = 0; i < arrayOfLists.length; i++) {
			if(arrayOfLists[i].name.equals(destinationVertex))
				return i;
		}
		return -1;
	}
	
	public void print() {
		for(int i = 0; i < arrayOfLists.length; i++) {
			System.out.print(arrayOfLists[i].name);
			for(Node aNode = arrayOfLists[i].adjList; aNode != null; aNode = aNode.next) {
				System.out.print(" ----->>> "+arrayOfLists[aNode.vertexIndex].name);
			}
			System.out.println("\n");
		}
	}
}
