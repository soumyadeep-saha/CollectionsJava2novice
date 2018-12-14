package com.soumyadeep.collections.linkedList;

import java.util.LinkedList;
import java.util.List;

public class MyLinkedListSubRange {

	public static void main(String[] args) {

		/*
		 * Here we can see example for getting LinkedList content based on range of
		 * index. By specifing the start and end index of the range, you can get the
		 * sub-list.
		 */
		LinkedList<String> arrl = new LinkedList<String>();
		// adding elements to the end
		arrl.add("First");
		arrl.add("Second");
		arrl.add("Third");
		arrl.add("Random");
		arrl.add("Click");
		System.out.println("Actual LinkedList:" + arrl);
		List<String> list = arrl.subList(2, 4);
		System.out.println("Sub List: " + list);
	}

}
