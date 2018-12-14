package com.soumyadeep.collections.hashTable;

import java.util.Hashtable;
import java.util.Set;

public class MyHashtableRead {

	public static void main(String[] args) {

		/*
		 * Below example shows how to read elements from Hashtable. You can iterate
		 * through each and every element by getting all keys as set object. Using each
		 * element as a key from set, you can values from Hashtable.
		 */
		Hashtable<String, String> hm = new Hashtable<String, String>();
		// add key-value pair to Hashtable
		hm.put("first", "FIRST INSERTED");
		hm.put("second", "SECOND INSERTED");
		hm.put("third", "THIRD INSERTED");
		System.out.println(hm);
		Set<String> keys = hm.keySet();
		for (String key : keys) {
			System.out.println("Value of " + key + " is: " + hm.get(key));
		}
	}
}
