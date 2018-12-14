package com.soumyadeep.collections.linkedHashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class MyLhsAddAllEx {

	public static void main(String[] args) {

		/*
		 * Below example shows how to add all elements from another collection to
		 * LinkedHashSet object. By using addAll() method, we can add all elements from
		 * another collection object.
		 */
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		// add elements to HashSet
		lhs.add("first");
		lhs.add("second");
		lhs.add("third");
		System.out.println(lhs);
		HashSet<String> subSet = new HashSet<String>();
		subSet.add("s1");
		subSet.add("s2");
		lhs.addAll(subSet);
		System.out.println("LinkedHashSet content after adding another collection:");
		System.out.println(lhs);

	}

}
