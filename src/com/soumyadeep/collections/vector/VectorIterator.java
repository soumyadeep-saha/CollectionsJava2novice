package com.soumyadeep.collections.vector;

import java.util.Iterator;
import java.util.Vector;

public class VectorIterator {

	public static void main(String[] args) {

		/*
		 * Below example shows how to iterate through vector using iterator object. You
		 * can get iterator object by calling iterator() method.
		 */
		Vector<String> vct = new Vector<String>();
		// adding elements to the end
		vct.add("First");
		vct.add("Second");
		vct.add("Third");
		vct.add("Random");
		Iterator<String> itr = vct.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
