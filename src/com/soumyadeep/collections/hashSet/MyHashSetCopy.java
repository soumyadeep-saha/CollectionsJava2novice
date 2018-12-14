package com.soumyadeep.collections.hashSet;

import java.util.HashSet;

public class MyHashSetCopy {

	public static void main(String[] args) {

		/*
		 * Below example shows how to copy another collection object to HashSet object.
		 * By calling addAll() method you can copy another collection to HashSet object.
		 */
		HashSet<String> hs = new HashSet<String>();
		// add elements to HashSet
		hs.add("first");
		hs.add("second");
		hs.add("third");
		System.out.println(hs);
		HashSet<String> subSet = new HashSet<String>();
		subSet.add("s1");
		subSet.add("s2");
		hs.addAll(subSet);
		System.out.println("HashSet content after adding another collection:");
		System.out.println(hs);

	}

}
