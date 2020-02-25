package com.practice.LinkedList;

class Node{
	public int i;
	public Node next;
}

class Linked{
	public Node getNewnode(int x){
		Node a = new Node();
		a.i = x;
		a.next=null;
		return a;
	}
	
	public Node insert(int i,Node node) {
		if(node == null) {
			return getNewnode(i);
		}
		else {
			node.next =insert(i,node.next);  
		}
		return node;
	}
	
	public void printList(Node node) {
		if(node == null) {
			return;
		}
			System.out.print(node.i+" ");
			printList(node.next);
	}
}

public class LinkedList {
	
	public static void main(String args[]) {
		
		Node root = null;
		Linked a = new Linked();
		
		root = a.insert(12,root);
		root = a.insert(97, root);
		root = a.insert(87, root);
		root = a.insert(11, root);
		
		a.printList(root);
		
		
	}

}
