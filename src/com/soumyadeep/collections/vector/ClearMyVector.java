package com.soumyadeep.collections.vector;

import java.util.Vector;

public class ClearMyVector {

	public static void main(String[] args) {

		/*
		 * Below example shows how to remove all elements from vector at once. You can
		 * call clear() method to delete all elements of a vector at one call
		 */
		Vector<String> vct = new Vector<String>();
		// adding elements to the end
		vct.add("First");
		vct.add("Second");
		vct.add("Third");
		vct.add("Random");
		System.out.println("Actual vector:" + vct);
		vct.clear();
		System.out.println("After clear vector:" + vct);
	}
}
