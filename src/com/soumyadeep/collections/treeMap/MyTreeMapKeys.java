package com.soumyadeep.collections.treeMap;

import java.util.Set;
import java.util.TreeMap;

public class MyTreeMapKeys {

	public static void main(String[] args) {

		/*
		 * Below example shows how to get all keys from the given TreeMap. By using
		 * keySet() method, you can get all key entries as a Set object.
		 */
		TreeMap<String, String> hm = new TreeMap<String, String>();
		// add key-value pair to TreeMap
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
