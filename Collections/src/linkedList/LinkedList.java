package linkedList;

import java.util.Collections;
import java.util.Iterator;

public class LinkedList {

	public static void main(String[] args) {

		java.util.LinkedList<String> ll = new java.util.LinkedList<>();
		ll.addFirst("Aditya");
		ll.add("Nikhil");
		ll.add("Swapnil");
		ll.addLast("Last");
		Iterator<String> iter = ll.descendingIterator();
		
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		java.util.LinkedList<String> l1 = new java.util.LinkedList<>();
		
		l1 = (java.util.LinkedList<String>) ll.clone();
		l1.remove(1);
		System.out.println(l1);
		System.out.println(ll);
		Collections.sort(ll);
		System.out.println(ll);
		Collections.reverse(ll);
		System.out.println(ll);
	}

}
