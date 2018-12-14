package com.soumyadeep.collections.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyItrRemoveElement {

	public static void main(String[] args) {

		/*
		 * Below example shows how to remove an element from collection object using
		 * Iterator object. The remove() method removes from the underlying collection
		 * the last element returned by the iterator
		 */

		String removeElem = "Perl";
		List<String> myList = new ArrayList<String>();
		myList.add("Java");
		myList.add("Unix");
		myList.add("Oracle");
		myList.add("C++");
		myList.add("Perl");
		System.out.println("Before remove:");
		System.out.println(myList);
		Iterator<String> itr = myList.iterator();
		while (itr.hasNext()) {
			if (removeElem.equals(itr.next())) {
				itr.remove();
			}
		}
		System.out.println("After remove:");
		System.out.println(myList);
	}

}
