package com.soumyadeep.collections.linkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class MyLinkedListIterate {

	public static void main(String[] args) {

		/*
		 * Here we can see example for reading all elements from LinkedList by using
		 * Iterator. Also you can iterate through the LinkedList based on index too.
		 */
		LinkedList<String> arrl = new LinkedList<String>();
		// adding elements to the end
		arrl.add("First");
		arrl.add("Second");
		arrl.add("Third");
		arrl.add("Random");
		Iterator<String> itr = arrl.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
