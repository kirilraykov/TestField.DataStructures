package com.kiril.singlylinkedlist;


public class SingleLinkedList {

	private Node first;
	
	public SingleLinkedList() {
		// TODO Auto-generated constructor stub
	}
	
	public boolean isEmpty(){
		return (first == null);
	}
	
	//insert at the beginning
	public void insertFirst(int data){
		Node newNode = new Node();
		newNode.data = data;
		
		//setting the new node to be before the previous first
		newNode.next = first;
		first = newNode;
	}
	
	//insert at the end of the list
	public void insertLast(int data){
		Node current = first;
		
		while(current.next != null){
			current = current.next;
		}
		
		Node newNode = new Node();
		newNode.data = data;
		current.next = newNode;
	}
	
	//delete from the beginning
	public Node deleteFirst(){
		Node temp = first;
		first = first.next;
		return temp;
	}
	
	//print all nodes
	public void printList(){
		System.out.println("List (first --> last) ");
		Node current = first;
		while(current != null){
			current.displayNode();
			current = current.next;
		}
		System.out.println();
	}
}
