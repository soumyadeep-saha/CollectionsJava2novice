package com.soumyadeep.collections.hashSet;

import java.util.HashSet;

public class MyBasicHashSet {

	public static void main(String[] args) {

		/*
		 * Below example shows basic operations on HashSet object like creating object,
		 * adding elements, verifying whether the hashset is empty or not, removing an
		 * element, size of the hashset, and to check whether an object exists or not.
		 */
		HashSet<String> hs = new HashSet<String>();
		// add elements to HashSet
		hs.add("first");
		hs.add("second");
		hs.add("third");
		System.out.println(hs);
		System.out.println("Is HashSet empty? " + hs.isEmpty());
		hs.remove("third");
		System.out.println(hs);
		System.out.println("Size of the HashSet: " + hs.size());
		System.out.println("Does HashSet contains first element? " + hs.contains("first"));
	}

}
