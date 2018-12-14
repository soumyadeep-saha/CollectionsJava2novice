package com.soumyadeep.collections.collections;

import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class MyEnumerationToList {

	public static void main(String[] args) {

		/*
		 * Collections.list() method returns an array list containing the elements
		 * returned by the specified enumeration in the order they are returned by the
		 * enumeration. This method provides interoperability between legacy APIs that
		 * return enumerations and new APIs that require collections.
		 */
		Vector<String> vct = new Vector<String>();
		vct.add("one");
		vct.add("two");
		vct.add("three");
		vct.add("four");
		vct.add("five");
		Enumeration<String> enm = vct.elements();
		List<String> ll = Collections.list(enm);
		System.out.println("List elements: " + ll);
	}
}
