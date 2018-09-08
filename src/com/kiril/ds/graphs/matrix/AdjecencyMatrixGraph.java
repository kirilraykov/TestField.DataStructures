package com.kiril.ds.graphs.matrix;

import java.util.ArrayList;

public class AdjecencyMatrixGraph {

	private int vCount; // number of vertices
	private int eCount; // number of edges
	
	private ArrayList<Integer>[] adjecents; // array of integer lists
	
	public AdjecencyMatrixGraph(int vCount) {
		this.vCount = vCount;
		eCount = 0;
		
		adjecents = new ArrayList[vCount];
		
		for(int i = 0; i < vCount ; i++) {
			adjecents[i] = new ArrayList<>();
		}
	}

	public int getvCount() {
		return vCount;
	}

	public int geteCount() {
		return eCount;
	}
	
	public void addEdge(int source, int destination) {
		adjecents[source].add(destination);
		eCount++;
	}
	
	public Object[] adj(int source) {
		return adjecents[source].toArray();
	}
	
}
