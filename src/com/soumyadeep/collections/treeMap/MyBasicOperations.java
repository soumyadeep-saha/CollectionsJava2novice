package com.soumyadeep.collections.treeMap;

import java.util.TreeMap;

public class MyBasicOperations {

	public static void main(String[] args) {

		/*
		 * Below example shows basic operations on TreeMap like creating an object,
		 * adding key-value pair objects, getting value by passing key object, checking
		 * whether the map has elements or not, deleting specific entry, and size of the
		 * TreeMap.
		 */
		TreeMap<String, String> hm = new TreeMap<String, String>();
		// add key-value pair to TreeMap
		hm.put("first", "FIRST INSERTED");
		hm.put("second", "SECOND INSERTED");
		hm.put("third", "THIRD INSERTED");
		System.out.println(hm);
		// getting value for the given key from TreeMap
		System.out.println("Value of second: " + hm.get("second"));
		System.out.println("Is TreeMap empty? " + hm.isEmpty());
		hm.remove("third");
		System.out.println(hm);
		System.out.println("Size of the TreeMap: " + hm.size());
	}

}
