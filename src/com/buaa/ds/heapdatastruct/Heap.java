package com.buaa.ds.heapdatastruct;

public class Heap {
	private int maxsize;
	private int currentsize;
	private Node[] heaparray;
	public Heap(int max){
		maxsize = max;
		currentsize = 0;
		heaparray = new Node[maxsize];
	}
	public boolean isEmpty(){
		return currentsize == 0;
	}
	public boolean insert(int key){
		if(currentsize == maxsize)
			return false;
		Node newnode = new Node(key);
		heaparray[currentsize] = newnode;
		trickleup(currentsize++);
		return true;
	}
	public void trickleup(int index){
		int parent = (index-1)/2;
		Node bottom = heaparray[index];
		while(index >0 && heaparray[parent].getiData()<bottom.getiData()){
			heaparray[index]=heaparray[parent];
			index = parent;
			parent = (parent-1)/2;
		}
		heaparray[index] = bottom;
	}
	public Node remove(){
		Node root = heaparray[0];
		heaparray[0] = heaparray[--currentsize];
		trickledown(0);
		return root;
	}
	public void trickledown(int index){
		Node top = heaparray[index];
		int largerchild;
		while(index<currentsize/2){
			int leftchild = index*2+1;
			int rightchild = index*2+2;
			if(leftchild <currentsize&&heaparray[leftchild].getiData()>heaparray[rightchild].getiData()){
				largerchild = leftchild;
			}else{
				largerchild = rightchild;
			}
			if(top.getiData()>heaparray[largerchild].getiData())
				break;
			heaparray[index] = heaparray[largerchild];
			index = largerchild;
		}
		heaparray[index] = top;
	}
	
	public boolean change(int index,int newvalue){
		if(index<0||index>=currentsize)
			return false;
		int oldvalue = heaparray[index].getiData();
		heaparray[index].setiData(newvalue);
		if(oldvalue>newvalue)
			trickledown(index);
		else
			trickleup(index);
		return true;
		
	}
	public void displayHeap(){
		System.out.println("heaparray:");
		for(int k = 0;k< currentsize;k++)
			if(heaparray[k] != null)
				System.out.print(heaparray[k].getiData()+' ');
			else
				System.out.print("--");
		System.out.println();
		int nBlanks = 32;//每一行空格
		int itemPerRow = 1;//每一行的元素个数
		int column = 0;//记录每行的元素是第几个
		int j = 0;
		String dots="-----------------------";
		System.out.println(dots+dots);
		while(currentsize>0){
			if(column ==0)
				for(int k=0;k<nBlanks;k++)
					System.out.print(' ');
			System.out.print(heaparray[j].getiData());
			if(++j==currentsize)
				break;
			if(++column==itemPerRow){
				nBlanks /= 2;
				itemPerRow *= 2;
				column = 0;
				System.out.println();
			}else{
				for(int k=0;k<nBlanks*2-2;k++)
					System.out.print(' ');
			}
		}
		System.out.println("\n"+dots+dots);
	}
}
