package com.soumyadeep.collections.linkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class MyLhsIterateEx {

	public static void main(String[] args) {

		/*
		 * Below example shows how to read all elements from LinkedHashSet object by
		 * using Iterator object.
		 */
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		// add elements to HashSet
		lhs.add("first");
		lhs.add("second");
		lhs.add("third");
		Iterator<String> itr = lhs.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
