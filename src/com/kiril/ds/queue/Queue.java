package com.kiril.ds.queue;

public class Queue {

	private int maxSize;
	private long[] queueArray;
	private int front;
	private int rear;
	private int nItems; //counter to maintain the number of items in the queue
	
	public Queue(int size) {
		this.maxSize = size;
		this.queueArray = new long[maxSize];
		front = 0;
		rear = -1;
		nItems = 0;
	}
	
	public void insert(long j){
		//if rear is equal to the max elemnt, set the rear to the beginning of the queue
		if(rear == maxSize - 1)
			rear = -1;
		rear++;
		queueArray[rear] = j;
		nItems++;
	}
	
	//remove item from the front of the queue
	public long remove(){
		long temp = queueArray[front];
		front++;
		
		//if we removed all elements, utillize the entire array again
		if(front == maxSize)
			front = 0;
		nItems--;
		
		return temp;
	}
	
	public long peakFront(){
		return queueArray[front];
	}
	
	public boolean isEmpty(){
		return (nItems == 0);
	}
	
	public boolean isFull(){
		return (nItems == maxSize);
	}
	
	public void printAll(){
		System.out.print("[ ");
		for(int i = 0; i < queueArray.length; i++){
			System.out.print(queueArray[i] + " ");
		}
		System.out.println("]");
	}
	
	
}
