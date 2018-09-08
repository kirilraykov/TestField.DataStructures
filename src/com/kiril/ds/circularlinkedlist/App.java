package com.kiril.ds.circularlinkedlist;

public class App {

	public static void main(String[] args) {
		CircularLinkedList list = new CircularLinkedList();
		list.insertFirst(5);
		list.insertFirst(2);
		list.insertFirst(1);
		list.insertFirst(7);
		
		list.insertLast(0);

		list.printList();
	}

}
