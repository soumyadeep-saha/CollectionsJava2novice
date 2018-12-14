package com.soumyadeep.collections.linkedList;

import java.util.LinkedList;

public class MyFirstElement {

	public static void main(String[] args) {

		/*
		 * Below example shows how to read first element from LinkedList. LinkedList
		 * provides few methods to read first element, those methods are:
		 * 
		 * element(): Retrieves, but does not remove, the head (first element) of this
		 * list. getFirst(): Returns the first element in this list. peek(): Retrieves,
		 * but does not remove, the head (first element) of this list. peekFirst():
		 * Retrieves, but does not remove, the first element of this list, or returns
		 * null if this list is empty.
		 */
		LinkedList<String> arrl = new LinkedList<String>();
		arrl.add("First");
		arrl.add("Second");
		arrl.add("Third");
		arrl.add("Random");
		System.out.println("First Element: " + arrl.element());
		System.out.println("First Element: " + arrl.getFirst());
		System.out.println("First Element: " + arrl.peek());
		System.out.println("First Element: " + arrl.peekFirst());

	}

}
