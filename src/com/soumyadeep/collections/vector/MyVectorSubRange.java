package com.soumyadeep.collections.vector;

import java.util.List;
import java.util.Vector;

public class MyVectorSubRange {

	public static void main(String[] args) {

		/*
		 * You can copy a range of vector content. The method subList() helps us to get
		 * sub range from the given vector object.
		 */
		Vector<String> vct = new Vector<String>();
		// adding elements to the end
		vct.add("First");
		vct.add("Second");
		vct.add("Third");
		vct.add("Random");
		vct.add("Click");
		System.out.println("Actual vector:" + vct);
		List<String> list = vct.subList(2, 4);
		System.out.println("Sub List: " + list);
	}

}
