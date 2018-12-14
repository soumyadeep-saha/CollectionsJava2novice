package com.soumyadeep.collections.hashMap;

import java.util.HashMap;
import java.util.Set;

public class MyHashMapRead {

	public static void main(String[] args) {

		/*
		 * Below example shows how to read add elements from HashMap. The method
		 * keySet() returns all key entries as a set object. Iterating through each key,
		 * we can get corresponding value object.
		 */
		HashMap<String, String> hm = new HashMap<String, String>();
		// add key-value pair to hashmap
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
