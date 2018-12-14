package com.soumyadeep.collections.linkedList;

import java.util.Collections;
import java.util.LinkedList;

public class MyLinkedListReverse {

	public static void main(String[] args) {

		/*
		 * This example shows how to reverse LinkedList content. You can reverse the
		 * content by calling Collections.reverse() method. You have to pass LinkedList
		 * instance to this method, which reverses the content.
		 */
		LinkedList<String> list = new LinkedList<String>();
		list.add("Java");
		list.add("Cric");
		list.add("Play");
		list.add("Watch");
		list.add("Glass");
		Collections.reverse(list);
		System.out.println("Results after reverse operation:");
		for (String str : list) {
			System.out.println(str);
		}
	}
}
