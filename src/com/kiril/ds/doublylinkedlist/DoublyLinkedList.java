package com.kiril.ds.doublylinkedlist;

public class DoublyLinkedList {
	private Node first;
	private Node last;
	
	public DoublyLinkedList() {
		// TODO Auto-generated constructor stub
	}
	
	public boolean isEmpty(){
		return first == null;
	}
	
	public void insertFirst(int data){
		Node newNode = new Node();
		newNode.data = data;
		
		if(isEmpty()){
			last = newNode; //if empty last will refer to the new node being created
		}else{
			first.previous = newNode;
		}
		
		newNode.next = first; //the new node's next field will point to the old first
		this.first = newNode;
	}
	
	public void insertLast(int data){
		Node newNode = new Node();
		newNode.data = data;
		
		if(isEmpty()){
			first = newNode;
		}else{
			last.next = newNode; //assigning old last to newnode
			newNode.previous = last; //the old last will be the newnode's previous
		}
		
		this.last = newNode; //LinkedList's last should point to the newly added node
	}
	
	//assume non-empty list
	public Node deleteFirst(){
		Node temp = first;
		
		//if there is only one item in the list
		if(first.next == null){
			last = null;
		}else{
			first.next.previous = null; //the list's first node will point to null as a previous(because we are deleting it)
		}
		
		first = first.next; //the list's first node will point to the node following the node currently deleted
		return temp;
	}
	
	//assume non-empty list
	public Node deleteLast(){
		Node temp = last;
		
		//if there is only one item in the list
		if(first.next == null){
			first = null;
		}else{
			last.previous.next = null;
		}
		
		last = last.previous;
		return temp;
	}
	
	//assume non-empty list
	public boolean insertAfterSpecificNode(int dataKey, int data){
		Node current = first; //start from the first node
		
		//if there isnt a node with this key
		while(current.data != dataKey){
			current = current.next;
			if(current == null)
				return false;
		}
		
		//creating the new node which we are adding after the found one
		Node newNode = new Node();
		newNode.data = data;
		
		if(current == last){
			//current.next = null;
			last = newNode;
		}else{
			newNode.next = current.next; //new node's next field should point to the node ahead of the current one
			current.next.previous = newNode;
		}
		
		newNode.previous = current;
		current.next = newNode;
		
		return true;
	}
	
	public Node deleteKey(int key) {
		Node current = first;

		while (current.data != key) {
			current = current.next;

			if (current == null)
				return null;
		}

		if (current == last) {
			last = current.previous;
			current.previous.next = null;
		}
		
		else if (current == first) {
			first = current.next;
			current.next.previous = null;
		} 
		
		else {
			current.next.previous = current.previous;
			current.previous.next = current.next;
		}

		return current;

	}
	
	public void printForward(){
		System.out.print("List (first --> last): ");
		Node current = first;
		while(current != null){
			current.displayNode();
			current = current.next;
		}
		System.out.println();
	}
	
	public void printBackward(){
		System.out.print("List (last --> first): ");
		Node current = last;
		while(current != null){
			current.displayNode();
			current = current.previous;
		}
		System.out.println();
	}
	
}
