package com.soumyadeep.collections.hashTable;

import java.util.Hashtable;
import java.util.Set;

public class MyHashtableKeys {

	public static void main(String[] args) {

		/*
		 * Below example shows how to get list of keys. keySet() method returns Set
		 * object will all keys.
		 */
		Hashtable<String, String> hm = new Hashtable<String, String>();
		// add key-value pair to Hashtable
		hm.put("first", "FIRST INSERTED");
		hm.put("second", "SECOND INSERTED");
		hm.put("third", "THIRD INSERTED");
		System.out.println(hm);
		Set<String> keys = hm.keySet();
		for (String key : keys) {
			System.out.println(key);
		}
	}

}
