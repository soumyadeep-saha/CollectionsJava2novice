package com.soumyadeep.collections.linkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class MyReverseIter {

	public static void main(String[] args) {

		/*
		 * Below example shows how to iterate through LinkedList in reverse order. The
		 * method descendingIterator() returns an Iterator object with reverse order. By
		 * iterating through it, you can get the elements in the reverse order.
		 */
		LinkedList<String> arrl = new LinkedList<String>();
		arrl.add("First");
		arrl.add("Second");
		arrl.add("Third");
		arrl.add("Random");
		Iterator<String> itr = arrl.descendingIterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
