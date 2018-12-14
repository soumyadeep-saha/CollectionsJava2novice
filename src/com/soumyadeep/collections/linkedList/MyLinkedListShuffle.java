package com.soumyadeep.collections.linkedList;

import java.util.Collections;
import java.util.LinkedList;

public class MyLinkedListShuffle {

	public static void main(String[] args) {

		/*
		 * This example gives how to shuffle elements in the LinkedList. By calling
		 * Collections.shuffle() method you can shuffle the content of the LinkedList.
		 * Everytime you call shuffle() method, it generates different order of output.
		 */
		LinkedList<String> list = new LinkedList<String>();
		list.add("Java");
		list.add("Cric");
		list.add("Play");
		list.add("Watch");
		list.add("Glass");
		list.add("Movie");
		list.add("Girl");

		Collections.shuffle(list);
		System.out.println("Results after shuffle operation:");
		for (String str : list) {
			System.out.println(str);
		}

		Collections.shuffle(list);
		System.out.println("Results after shuffle operation:");
		for (String str : list) {
			System.out.println(str);
		}
	}
}
