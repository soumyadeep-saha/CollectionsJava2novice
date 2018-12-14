package com.soumyadeep.collections.hashTable;

import java.util.Hashtable;

public class MyHashtableKeySearch {

	public static void main(String[] args) {

		/*
		 * Below example shows how to search a key from the Hashtable. The method
		 * containsKey() helps us to find whether the specified key exists or not.
		 */
		Hashtable<String, String> hm = new Hashtable<String, String>();
		// add key-value pair to Hashtable
		hm.put("first", "FIRST INSERTED");
		hm.put("second", "SECOND INSERTED");
		hm.put("third", "THIRD INSERTED");
		System.out.println(hm);
		if (hm.containsKey("first")) {
			System.out.println("The Hashtable contains key first");
		} else {
			System.out.println("The Hashtable does not contains key first");
		}
		if (hm.containsKey("fifth")) {
			System.out.println("The Hashtable contains key fifth");
		} else {
			System.out.println("The Hashtable does not contains key fifth");
		}
	}
}
