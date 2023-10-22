package com.buaa.ds.StackAndQueue;

public class StackApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack stack = new Stack(10);
		stack.push(4);
		stack.push(6);
		stack.push(5);
		stack.push(34);
		stack.push(3);
		stack.push(9);
		stack.push(22);
		while(!stack.isEmpty()){
			long value = stack.pop();
			System.out.println(value);
		}
	}

}
