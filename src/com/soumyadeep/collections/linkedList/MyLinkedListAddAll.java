package com.soumyadeep.collections.linkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyLinkedListAddAll {

	public static void main(String[] args) {

		/*
		 * Here we can see example for copying another collection instance objects to
		 * existing LinkedList.
		 */
		LinkedList<String> arrl = new LinkedList<String>();
		// adding elements to the end
		arrl.add("First");
		arrl.add("Second");
		arrl.add("Third");
		arrl.add("Random");
		System.out.println("Actual LinkedList:" + arrl);
		List<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		arrl.addAll(list);
		System.out.println("After Copy: " + arrl);
	}

}
