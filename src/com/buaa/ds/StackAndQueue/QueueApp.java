package com.buaa.ds.StackAndQueue;

public class QueueApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue queue = new Queue(10);
		queue.insert(84);
		queue.insert(83);
		queue.insert(454);
		queue.insert(45);
		queue.insert(7);
		queue.insert(73);
		queue.insert(854);
		queue.remove();
		queue.remove();
		queue.remove();
		queue.insert(91);
		queue.insert(8);
		while(!queue.isEmpty()){
			long temp = queue.remove();
			System.out.println(temp);
		}
	}

}
