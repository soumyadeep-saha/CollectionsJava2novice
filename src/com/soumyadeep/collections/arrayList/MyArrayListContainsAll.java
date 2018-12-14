package com.soumyadeep.collections.arrayList;

import java.util.ArrayList;
import java.util.List;

public class MyArrayListContainsAll {

	public static void main(String[] args) {

		/*
		 * Here we can see example for finding whether the instance of an ArrayList
		 * contains all objects of another Collection instance. Here we are checking
		 * with another List instance.
		 */
		ArrayList<String> arrl = new ArrayList<String>();
		arrl.add("First");
		arrl.add("Second");
		arrl.add("Third");
		arrl.add("Random");
		List<String> list = new ArrayList<String>();
		list.add("Second");
		list.add("Random");
		System.out.println("Does ArrayList contains all list elements?: " + arrl.containsAll(list));
		list.add("one");
		System.out.println("Does ArrayList contains all list elements?: " + arrl.containsAll(list));
	}
}
