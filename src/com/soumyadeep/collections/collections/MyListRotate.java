package com.soumyadeep.collections.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyListRotate {

	public static void main(String[] args) {

		/*
		 * Collections.rotate() method rotates the elements in the specified list by the
		 * specified distance. After calling this method, the element at index i will be
		 * the element previously at index (i - distance) mod list.size(), for all
		 * values of i between 0 and list.size()-1, inclusive. This method has no effect
		 * on the size of the list.
		 */
		List<String> list = new ArrayList<String>();
		list.add("java");
		list.add("c");
		list.add("c++");
		list.add("unix");
		list.add("perl");
		list.add("php");
		list.add("javascript");
		list.add("ruby");
		list.add(".net");
		System.out.println(list);
		Collections.rotate(list, 3);
		System.out.println("List after rotation:");
		System.out.println(list);
	}

}
