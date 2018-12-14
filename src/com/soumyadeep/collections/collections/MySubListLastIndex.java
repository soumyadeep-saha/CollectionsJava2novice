package com.soumyadeep.collections.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MySubListLastIndex {

	public static void main(String[] args) {

		/*
		 * Collections.lastIndexOfSubList() method returns the starting position of the
		 * last occurrence of the specified target list within the specified source
		 * list, or -1 if there is no such occurrence.
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
		list.add("jdbc");
		list.add("php");
		list.add("javascript");
		list.add("ruby");
		list.add("servlets");
		List<String> subList = new ArrayList<String>();
		subList.add("php");
		subList.add("javascript");
		subList.add("ruby");
		System.out.println("Last index of sublist: " + Collections.lastIndexOfSubList(list, subList));
	}

}
