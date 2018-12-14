package com.soumyadeep.collections.treeSet;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class MySetWithCollection {

	public static void main(String[] args) {

		/*
		 * Below example shows how to create TreeSet with other collection. By passing
		 * another collection to the TreeSet constructor, you can copy entire
		 * collections elements to the TreeSet.
		 */
		List<String> li = new ArrayList<String>();
		li.add("one");
		li.add("two");
		li.add("three");
		li.add("four");
		System.out.println("List: " + li);
		// create a treeset with the list
		TreeSet<String> myset = new TreeSet<String>(li);
		System.out.println("Set: " + myset);
	}

}
