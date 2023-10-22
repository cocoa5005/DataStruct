package com.buaa.ds.linkedlist;

public class LinkListApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkList linkList = new LinkList();
		linkList.insertFirst(1, 3);
		linkList.insertFirst(4, 5);
		linkList.insertFirst(3, 76);
		linkList.insertFirst(6, 7);
		linkList.insertFirst(8, 99);
		linkList.deleteFirst();
		linkList.displayLinkList();
	}

}
