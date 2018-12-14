package com.soumyadeep.collections.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsAddAll {

	public static void main(String[] args) {

		/*
		 * Collections.addAll() method adds all of the specified elements to the
		 * specified collection. Elements to be added may be specified individually or
		 * as an array. The behavior of this convenience method is identical to that of
		 * c.addAll(Arrays.asList(elements)), but this method is likely to run
		 * significantly faster under most implementations.
		 */
		List<String> myList = new ArrayList<String>();
		myList.add("java");
		myList.add("c");
		myList.add("c++");
		System.out.println("Initial list:" + myList);
		Collections.addAll(myList, "perl", "php");
		System.out.println("After adding elements:" + myList);
		String[] strArr = { ".Net", "unix" };
		Collections.addAll(myList, strArr);
		System.out.println("After adding array:" + myList);
	}

}
