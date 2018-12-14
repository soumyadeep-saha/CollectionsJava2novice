package com.soumyadeep.collections.arrayList;

import java.util.ArrayList;
import java.util.List;

public class MyArrayListSubRange {

	public static void main(String[] args) {

		/*
		 * Here we can see example for getting ArrayList content based on range of
		 * index. By specifing the start and end index of the range, you can get the
		 * sub-list.
		 */
		ArrayList<String> arrl = new ArrayList<String>();
		// adding elements to the end
		arrl.add("First");
		arrl.add("Second");
		arrl.add("Third");
		arrl.add("Random");
		arrl.add("Click");
		System.out.println("Actual ArrayList:" + arrl);
		List<String> list = arrl.subList(2, 4);
		System.out.println("Sub List: " + list);
	}
}
