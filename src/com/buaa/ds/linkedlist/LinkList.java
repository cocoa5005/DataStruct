package com.buaa.ds.linkedlist;

public class LinkList {
	public Link first;
	
	public LinkList(){
		first = null;
	}
	
	public boolean isEmpty(){
		return (first == null);
	}
	
	public void insertFirst(int i,double f){
		Link newlink = new Link(i,f);
		newlink.next = first;
		first = newlink;
	}
	
	public Link deleteFirst(){
		Link temp = first;
		first = first.next;
		return first;
	}
	
	public void displayLinkList(){
		Link current = first;
		while(current != null){
			current.display();
			current = current.next;
		}
	}
	
	public Link find(int key){
		Link current = first;
		while(current.iDate != key){
			if(current.next == null){
				return null;
			}else{
				current= current.next;
			}
		}
		return current;
	}
	
	public Link deleteByKey(int key){
		Link current = first;
		Link previous = first;
		while(current.iDate != key){
			if(current.next == null){
				return null;
			}else{
				previous =  current;
				current= current.next;
			}
		}
		if(current == first){
			first =  first.next;
		}else{
			previous.next = current.next;
		}
		return current;
	}
}
