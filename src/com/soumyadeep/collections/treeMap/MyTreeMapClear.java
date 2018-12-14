package com.soumyadeep.collections.treeMap;

import java.util.TreeMap;

public class MyTreeMapClear {

	public static void main(String[] args) {

		/*
		 * Below example shows how to delete all elements from the given TreeMap at one
		 * call. By calling clear() method, we can delete all key-value pairs from
		 * TreeMap.
		 */
		TreeMap<String, String> hm = new TreeMap<String, String>();
		// add key-value pair to TreeMap
		hm.put("first", "FIRST INSERTED");
		hm.put("second", "SECOND INSERTED");
		hm.put("third", "THIRD INSERTED");
		System.out.println("My TreeMap content:");
		System.out.println(hm);
		System.out.println("Clearing TreeMap:");
		hm.clear();
		System.out.println("Content After clear:");
		System.out.println(hm);

	}

}
