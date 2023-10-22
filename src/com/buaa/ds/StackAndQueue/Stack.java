package com.buaa.ds.StackAndQueue;

public class Stack {
	
	public int maxsize;
	public long[] array;
	public int top;
	
	public Stack(int s){
		maxsize = s;
		array = new long[maxsize];
		top = -1;
	}
	
	public void push(long value){
		array[++top] = value;
	}
	
	public long  pop(){
		return array[top--];
	}
	
	public long peek(){
		return array[top];
	}
	
	public boolean isEmpty(){
		return top == -1;
	}
	
	public boolean isFull(){
		return top == maxsize - 1;
	}
}
