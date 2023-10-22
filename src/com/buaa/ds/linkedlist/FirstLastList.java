package com.buaa.ds.linkedlist;

public class FirstLastList {
	public Link first;
	public Link last;
	
	public FirstLastList(){
		first = null;
		last = null;
	}
	
	public boolean isEmpty(){
		return first == null;
	}
	
	public void insertFirst(int i,double d){
		Link newLink = new Link(i,d);
		if(isEmpty()){
			last = newLink;
		}
		newLink.next = first;
		first = newLink;
	}
	
	public void insertLast(int i,double d){
		Link newLink = new Link(i,d);
		if(isEmpty()){
			first = newLink;
		}else{
			last.next = newLink;
		}
		last = newLink;
	}
	
	public Link deleteFirst(){
		Link temp = first;
		if(first.next == null){
			last = null;
		}
		first = first.next;
		return temp;
	}
	
	public void displayLinkList(){
		Link current = first;
		while(current != null){
			current.display();
			current = current.next;
		}
	}
}
