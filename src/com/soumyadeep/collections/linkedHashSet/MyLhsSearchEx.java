package com.soumyadeep.collections.linkedHashSet;

import java.util.LinkedHashSet;

public class MyLhsSearchEx {

	public static void main(String[] args) {

		/*
		 * Below example shows how to find specific element from LinkedHashSet object.
		 */
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		// add elements to HashSet
		lhs.add("first");
		lhs.add("second");
		lhs.add("third");
		System.out.println(lhs);
		System.out.println("Does set contains 'first'? " + lhs.contains("first"));
	}

}
