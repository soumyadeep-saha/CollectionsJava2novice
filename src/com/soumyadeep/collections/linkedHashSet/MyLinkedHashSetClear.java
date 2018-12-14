package com.soumyadeep.collections.linkedHashSet;

import java.util.LinkedHashSet;

public class MyLinkedHashSetClear {

	public static void main(String[] args) {

		/*
		 * Below example shows how to delete all elements from LinkedHashSet object. By
		 * using clear() method, we can delete all elements at once.
		 */
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		// add elements to HashSet
		lhs.add("first");
		lhs.add("second");
		lhs.add("third");
		System.out.println("My LinkedHashSet content:");
		System.out.println(lhs);
		System.out.println("Clearing LinkedHashSet:");
		lhs.clear();
		System.out.println("Content After clear:");
		System.out.println(lhs);

	}
}
