package com.kiril.ds.queue;

public class App {

	public static void main(String[] args) {
		Queue myQue = new Queue(5);
		myQue.insert(4);
		myQue.insert(7);
		myQue.insert(6);
		myQue.insert(2);
		myQue.insert(5);
		myQue.insert(99);
		myQue.insert(99);

		myQue.printAll();
	}

}
