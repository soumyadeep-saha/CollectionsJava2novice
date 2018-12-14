package com.soumyadeep.collections.collections;

import java.util.Collections;
import java.util.Set;

public class MyEmptySet {

	public static void main(String[] args) {

		/*
		 * Collections.emptySet() method returns the empty set (immutable). This set is
		 * serializable.
		 */
		Set<String> myEmptySet = Collections.<String>emptySet();
		System.out.println("Empty set: " + myEmptySet);

	}

}
