package com.kiril.ds.doublylinkedlist;

public class Node {
	
	public Node next;
	public Node previous;
	
	public int data;
	
	public void displayNode(){
		System.out.print("{ " + data + " } ");
	}
}
