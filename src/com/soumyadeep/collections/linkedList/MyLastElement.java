package com.soumyadeep.collections.linkedList;

import java.util.LinkedList;

public class MyLastElement {

	public static void main(String[] args) {

		/*
		 * Below example shows how to read last element from LinkedList. LinkedList
		 * provides few methods to read last element, those methods are:
		 * 
		 * getLast(): Returns the last element in this list. peekLast(): Retrieves, but
		 * does not remove, the last element of this list, or returns null if this list
		 * is empty.
		 */
		LinkedList<String> arrl = new LinkedList<String>();
		arrl.add("First");
		arrl.add("Second");
		arrl.add("Third");
		arrl.add("Random");
		System.out.println("Last Element: " + arrl.getLast());
		System.out.println("Last Element: " + arrl.peekLast());
	}
}
