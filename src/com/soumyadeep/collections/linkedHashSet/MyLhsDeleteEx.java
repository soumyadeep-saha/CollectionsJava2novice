package com.soumyadeep.collections.linkedHashSet;

import java.util.LinkedHashSet;

public class MyLhsDeleteEx {

	public static void main(String[] args) {

		/*
		 * Below example shows how to delete specific element from LinkedHashSet object.
		 */
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		// add elements to HashSet
		lhs.add("first");
		lhs.add("second");
		lhs.add("third");
		System.out.println(lhs);
		lhs.remove("second");
		System.out.println("Elements after deleting an element:");
		System.out.println(lhs);

	}

}
