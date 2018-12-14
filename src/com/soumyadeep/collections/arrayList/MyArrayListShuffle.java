package com.soumyadeep.collections.arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class MyArrayListShuffle {

	public static void main(String[] args) {

		/*
		 * This example gives how to shuffle elements in the ArrayList. By calling
		 * Collections.shuffle() method you can shuffle the content of the ArrayList.
		 * Everytime you call shuffle() method, it generates different order of output.
		 */
		ArrayList<String> list = new ArrayList<String>();
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
