package com.soumyadeep.collections.linkedHashSet;

import java.util.LinkedHashSet;

public class MyLkdHashSetOperations {

	public static void main(String[] args) {

		/*
		 * Below example shows how to create LinkedHashSet object, adding elements to
		 * it, getting size of LinkedHashSet object, and is the set empty or not.
		 */
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		// add elements to HashSet
		lhs.add("first");
		lhs.add("second");
		lhs.add("third");
		System.out.println(lhs);
		System.out.println("LinkedHashSet size: " + lhs.size());
		System.out.println("Is LinkedHashSet emplty? : " + lhs.isEmpty());
	}
}
