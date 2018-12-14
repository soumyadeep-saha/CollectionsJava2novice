package com.soumyadeep.collections.vector;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class MyElementCheck {

	public static void main(String[] args) {

		/*
		 * Below example shows how to find whether a vector contains list of objects or
		 * not. The method containsAll() helps us to find the match.
		 */
		Vector<String> vct = new Vector<String>();
		vct.add("First");
		vct.add("Second");
		vct.add("Third");
		vct.add("Random");
		List<String> list = new ArrayList<String>();
		list.add("Second");
		list.add("Random");
		System.out.println("Does vector contains all list elements?: " + vct.containsAll(list));
		list.add("one");
		System.out.println("Does vector contains all list elements?: " + vct.containsAll(list));
	}

}
