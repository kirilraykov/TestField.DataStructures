package com.kiril.ds.doublylinkedlist;

public class App {

	public static void main(String[] args) {
		DoubleLinkedList2 list = new DoubleLinkedList2();
		list.insertFirst(50);
		list.insertFirst(10);
		list.insertFirst(30);
		list.insertFirst(50);
		
		list.printForward();
		
//		list.insertFirst(10);
		list.insertLast(20);
//		
		list.printForward();
//		
		list.deleteFirst();
//		
		list.printForward();
//		
//		list.deleteLast();
//		
//		list.printForward();
//		
		list.insertAfterSpecificNode(20, 66);
//		
		list.printForward();
//		
		list.deleteKey(66);
//		
		list.printForward();
		
		list.deleteKey(30);
//		
		list.printForward();
		
		list.deleteKey(50);
//		
		list.printForward();
//		
//		list.insertLast(44);
//		
//		list.printForward();
//		
//		list.insertAfterSpecificNode(44, 66);
//		
//		list.printForward();
	}

}
