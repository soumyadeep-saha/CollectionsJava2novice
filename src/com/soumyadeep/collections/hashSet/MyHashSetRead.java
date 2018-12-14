package com.soumyadeep.collections.hashSet;

import java.util.HashSet;
import java.util.Iterator;

public class MyHashSetRead {

	public static void main(String[] args) {

		/*
		 * Below example shows how to read all elements from the HashSet objects. You
		 * can iterate through HashSet by getting Iterator object. By calling iterator()
		 * method, you can get Iterator object.
		 */
		HashSet<String> hs = new HashSet<String>();
		// add elements to HashSet
		hs.add("first");
		hs.add("second");
		hs.add("third");
		Iterator<String> itr = hs.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
