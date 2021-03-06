package com.soumyadeep.collections.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyMinNumber {

	public static void main(String[] args) {

		/*
		 * Collections.min() method returns the minimum element of the given collection,
		 * according to the natural ordering of its elements.
		 */
		List<Integer> li = new ArrayList<Integer>();
		li.add(23);
		li.add(44);
		li.add(12);
		li.add(45);
		li.add(2);
		li.add(16);
		System.out.println("Minimum element from the list: " + Collections.min(li));
	}

}
