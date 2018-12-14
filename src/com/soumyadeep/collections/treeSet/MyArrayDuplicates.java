package com.soumyadeep.collections.treeSet;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class MyArrayDuplicates {

	public static void main(String[] args) {

		/*
		 * The easiest way to remove duplicate entries from the given array is, create
		 * TreeSet object and add array entries to the TreeSet. Since the set doesnot
		 * support duplicate entries, you will get only unique elements left with
		 * TreeSet.
		 */
		String[] strArr = { "one", "two", "three", "four", "four", "five" };
		// convert string array to list
		List<String> tmpList = Arrays.asList(strArr);
		// create a treeset with the list, which eliminates duplicates
		TreeSet<String> unique = new TreeSet<String>(tmpList);
		System.out.println(unique);
	}

}
