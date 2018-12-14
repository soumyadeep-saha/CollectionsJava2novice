package com.soumyadeep.collections.treeMap;

import java.util.TreeMap;

public class MyTreeMapCopy {

	public static void main(String[] args) {

		/*
		 * Below example shows how to copy another collection entries to TreeMap. By
		 * using putAll() method, you can copy all entries from another collections to
		 * TreeMap.
		 */
		TreeMap<String, String> hm = new TreeMap<String, String>();
		// add key-value pair to TreeMap
		hm.put("first", "FIRST INSERTED");
		hm.put("second", "SECOND INSERTED");
		hm.put("third", "THIRD INSERTED");
		System.out.println(hm);
		TreeMap<String, String> subMap = new TreeMap<String, String>();
		subMap.put("s1", "S1 VALUE");
		subMap.put("s2", "S2 VALUE");
		hm.putAll(subMap);
		System.out.println(hm);
	}

}
