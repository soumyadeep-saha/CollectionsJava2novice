package com.soumyadeep.collections.hashSet;

import java.util.HashSet;

public class MyHashSetToArray {

	public static void main(String[] args) {

		/*
		 * Below example shows how to copy all elements from HashSet to an array. By
		 * calling toArray() method and passing existing array object to this method, we
		 * can copy all elements of HashSet to an array.
		 */
		HashSet<String> hs = new HashSet<String>();
		// add elements to HashSet
		hs.add("first");
		hs.add("second");
		hs.add("third");
		System.out.println("HashSet content: ");
		System.out.println(hs);
		String[] strArr = new String[hs.size()];
		hs.toArray(strArr);
		System.out.println("Copied array content:");
		for (String str : strArr) {
			System.out.println(str);
		}
	}

}
