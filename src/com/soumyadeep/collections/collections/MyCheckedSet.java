package com.soumyadeep.collections.collections;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class MyCheckedSet {

	public static void main(String[] args) {

		/*
		 * Collections.checkedSet() method returns a dynamically typesafe view of the
		 * specified set. Any attempt to insert an element of the wrong type will result
		 * in an immediate ClassCastException. Assuming a set contains no incorrectly
		 * typed elements prior to the time a dynamically typesafe view is generated,
		 * and that all subsequent access to the set takes place through the view, it is
		 * guaranteed that the set cannot contain an incorrectly typed element.
		 */
		Set mySet = new HashSet();
		mySet.add("one");
		mySet.add("two");
		mySet.add("three");
		mySet.add("four");
		Set chkSet = Collections.checkedSet(mySet, String.class);
		System.out.println("Checked set content: " + chkSet);
		// you can add any type of elements to mySet object
		mySet.add(10);
		// you cannot add any type of elements to chkSet object, doing so
		// throws ClassCastException
		chkSet.add(10); // throws ClassCastException
	}

}
