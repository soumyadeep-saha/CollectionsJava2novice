package com.soumyadeep.collections.collections;

import java.util.Collections;
import java.util.List;

public class MyEmptyList {

	public static void main(String[] args) {

		/*
		 * Collections.emptyList() method returns the empty list (immutable). This list
		 * is serializable.
		 */
		List<String> myEmptyList = Collections.<String>emptyList();
		System.out.println("Empty list: " + myEmptyList);
	}
}
