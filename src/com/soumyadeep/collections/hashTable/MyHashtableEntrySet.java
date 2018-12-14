package com.soumyadeep.collections.hashTable;

import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Set;

public class MyHashtableEntrySet {

	public static void main(String[] args) {

		/*
		 * Below example shows how to get key-value pair as Entry object. Entry object
		 * provides getter methods to access key-value objects. entrySet() method
		 * returns Set object with Entry values.
		 */
		Hashtable<String, String> hm = new Hashtable<String, String>();
		// add key-value pair to Hashtable
		hm.put("first", "FIRST INSERTED");
		hm.put("second", "SECOND INSERTED");
		hm.put("third", "THIRD INSERTED");
		System.out.println(hm);
		// getting value for the given key from Hashtable
		Set<Entry<String, String>> entires = hm.entrySet();
		for (Entry<String, String> ent : entires) {
			System.out.println(ent.getKey() + " ==> " + ent.getValue());
		}
	}
}
