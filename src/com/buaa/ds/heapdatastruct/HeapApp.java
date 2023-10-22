package com.buaa.ds.heapdatastruct;

public class HeapApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Heap heap = new Heap(31);
		heap.insert(30);
		heap.insert(34);
		heap.insert(22);
		heap.insert(1);
		heap.insert(234);
		heap.insert(43);
		heap.insert(8);
		heap.insert(66);
		heap.insert(75);
		heap.insert(43);
		heap.insert(5);
		heap.insert(90);
		heap.insert(55);
		heap.insert(37);
		heap.insert(3);
		heap.displayHeap();
	}

}
