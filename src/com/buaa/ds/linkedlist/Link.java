package com.buaa.ds.linkedlist;

public class Link {
	public int iDate;
	public double dData;
	public Link next;
	
	public Link(int i,double d){
		iDate = i;
		dData = d;
	}
	
	public void display(){
		System.out.println("{"+iDate+","+dData+"}");
	}
}
