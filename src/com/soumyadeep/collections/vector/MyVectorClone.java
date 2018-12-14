package com.soumyadeep.collections.vector;

import java.util.Vector;

public class MyVectorClone {

	public static void main(String[] args) {

		/*
		 * Below example shows how to create exactly same object as available vector
		 * object. You can use clone() method to create similar copy of vector.
		 */
		Vector<String> vct = new Vector<String>();
		// adding elements to the end
		vct.add("First");
		vct.add("Second");
		vct.add("Third");
		vct.add("Random");
		System.out.println("Actual vector:" + vct);
		Vector<String> copy = (Vector<String>) vct.clone();
		System.out.println("Cloned vector:" + copy);
	}

}
