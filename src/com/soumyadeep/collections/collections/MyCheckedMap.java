package com.soumyadeep.collections.collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MyCheckedMap {

	public static void main(String[] args) {

		/*
		 * Collections.checkedMap() method returns a dynamically typesafe view of the
		 * specified map. Any attempt to insert a mapping whose key or value have the
		 * wrong type will result in an immediate ClassCastException. Similarly, any
		 * attempt to modify the value currently associated with a key will result in an
		 * immediate ClassCastException, whether the modification is attempted directly
		 * through the map itself, or through a Map.Entry instance obtained from the
		 * map's entry set view.
		 */
		Map myMap = new HashMap();
		myMap.put("one", 1);
		myMap.put("two", 2);
		myMap.put("three", 3);
		myMap.put("four", 4);
		Map chkMap = Collections.checkedMap(myMap, String.class, Integer.class);
		System.out.println("Checked map content: " + chkMap);
		// you can add any type of elements to myMap object
		myMap.put(10, "ten");
		// you cannot add any type of elements to chkMap object, doing so
		// throws ClassCastException
		chkMap.put(10, "ten"); // throws ClassCastException
	}
}
