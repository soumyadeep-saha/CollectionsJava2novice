package com.soumyadeep.collections.hashTable;

import java.util.HashMap;
import java.util.Hashtable;

public class MyHashtableCopy {

	public static void main(String[] args) {

		/*
		 * Below example shows how to copy another collection object to Hashtable. Below
		 * example copies all HashMap entries to Hashtable. putAll() method helps us to
		 * copy another collection object.
		 */
		Hashtable<String, String> hm = new Hashtable<String, String>();
		// add key-value pair to Hashtable
		hm.put("first", "FIRST INSERTED");
		hm.put("second", "SECOND INSERTED");
		hm.put("third", "THIRD INSERTED");
		System.out.println(hm);
		HashMap<String, String> subMap = new HashMap<String, String>();
		subMap.put("s1", "S1 VALUE");
		subMap.put("s2", "S2 VALUE");
		hm.putAll(subMap);
		System.out.println(hm);
	}
}
