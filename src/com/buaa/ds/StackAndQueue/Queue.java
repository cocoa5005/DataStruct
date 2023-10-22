package com.buaa.ds.StackAndQueue;

public class Queue {
	
	public int maxsize;
	public long[] queueArray;
	public int font;
	public int rear;
	public int nItem;
	
	public Queue(int s){
		maxsize = s;
		queueArray = new long[maxsize];
		font = 0;
		rear = -1;
		nItem = 0;
	}
	
	public void insert(long value){
		if(rear==maxsize){
			rear = -1;
		}
		queueArray[++rear] = value;
		nItem++;
	}
	
	public long remove(){
		long temp = queueArray[font++];
		if(font == maxsize){
			font = 0;
		}
		nItem --;
		return temp;
	}
	
	public long peekFront(){
		return queueArray[font];
	}
	
	public boolean isEmpty(){
		return nItem ==0;
	}
	
	public boolean isFull(){
		return nItem == maxsize;
	}
	
	public int getSize(){
		return nItem;
	}
}
