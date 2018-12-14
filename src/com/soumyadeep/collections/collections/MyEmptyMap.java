package com.soumyadeep.collections.collections;

import java.util.Collections;
import java.util.Map;

public class MyEmptyMap {

	public static void main(String[] args) {

		/*
		 * Collections.emptyMap() method returns the empty map (immutable). This map is
		 * serializable.
		 */
		Map<String, String> myEmptyMap = Collections.<String, String>emptyMap();
		System.out.println("Empty map: " + myEmptyMap);
	}
}
