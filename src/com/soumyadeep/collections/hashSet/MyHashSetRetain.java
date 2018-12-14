package com.soumyadeep.collections.hashSet;

import java.util.HashSet;

public class MyHashSetRetain {

	public static void main(String[] args) {

		/*
		 * Below example shows how to compare two sets, and retain the values which are
		 * common on both set objects. By calling retainAll() method you can do this
		 * operation.
		 */
		HashSet<String> hs = new HashSet<String>();
		// add elements to HashSet
		hs.add("first");
		hs.add("second");
		hs.add("third");
		hs.add("apple");
		hs.add("rat");
		System.out.println(hs);
		HashSet<String> subSet = new HashSet<String>();
		subSet.add("rat");
		subSet.add("second");
		subSet.add("first");
		hs.retainAll(subSet);
		System.out.println("HashSet content:");
		System.out.println(hs);
	}
}
