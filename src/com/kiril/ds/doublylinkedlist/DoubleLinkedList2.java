package com.kiril.ds.doublylinkedlist;

public class DoubleLinkedList2 {
	private Node first;
	private Node last;
	
	public DoubleLinkedList2() {
		// TODO Auto-generated constructor stub
	}
	
	public boolean isEmpty(){
		return first == null;
	}
	
	public void insertFirst(int data){
		Node newNode = new Node();
		newNode.data = data;
		
		if(isEmpty()){
			last = newNode;
		}else{
			first.previous = newNode;
		}
		
		newNode.next = first;
		first = newNode;
	}
	
	public void insertLast(int data){
		Node newNode = new Node();
		newNode.data = data;
		
		if(isEmpty())
			first = newNode;
		else{
			newNode.previous = last;
			last.next = newNode;
		}
		
		last = newNode;
		
	}
	
	//assume non-empty list
	public Node deleteFirst(){
		Node temp = new Node();
		temp = first;
		
		if(first.next == null){
			last = null;
		}else{
			first.next.previous = null;
		}
		
		first = first.next;
		return temp;
	}
	
	//assume non-empty list
	public Node deleteLast(){
		Node temp = last;
		
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
		Node current = first;
		
		while(current.data != dataKey){
			current = current.next;
			
			if(current == null)
				return false;
		}
		
		Node newNode = new Node();
		newNode.data = data;
		
		if(current == last)
			last = newNode;
		else{
		newNode.next = current.next;
		current.next.previous = newNode;
		}
		
		current.next = newNode;
		newNode.previous = current;
		
		return true;
	}
	
	public Node deleteKey(int key){
		Node current = first;
		
		while(current.data != key){
			current = current.next;
			
			if(current == null)
				return null;
		}
		
		if(current == last){
			last = current.previous;
			current.previous.next = null;
		}
		
		else if(current == first){
			first = current.next;
			current.next.previous = null;
		}
		else{
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
