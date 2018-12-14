package com.soumyadeep.collections.hashMap;

import java.util.HashMap;
import java.util.Set;

public class MyHashMapKeys {

	public static void main(String[] args) {

		/*
		 * Below example shows how to get all keys from the given HashMap. By calling
		 * keySet() method, you can get set object with all key values.
		 */
		HashMap<String, String> hm = new HashMap<String, String>();
		// add key-value pair to hashmap
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
