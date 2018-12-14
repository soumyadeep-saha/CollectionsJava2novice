package com.soumyadeep.collections.treeSet;

import java.util.TreeSet;

public class MyDuplicateEntry {

	public static void main(String[] args) {

		/*
		 * The easiest way to find duplicate entries from the given array is, create
		 * TreeSet object and add array entries to the TreeSet. Since the set doesnot
		 * support duplicate entries, you can easily findout duplicate entries. Below
		 * example add each element to the set, and checks the returns status.
		 */
		String[] strArr = { "one", "two", "three", "four", "four", "five" };
		TreeSet<String> unique = new TreeSet<String>();
		for (String str : strArr) {
			if (!unique.add(str)) {
				System.out.println("Duplicate Entry is: " + str);
			}
		}
	}

}
