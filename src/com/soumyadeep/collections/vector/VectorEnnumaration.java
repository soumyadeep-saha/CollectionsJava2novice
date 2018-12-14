package com.soumyadeep.collections.vector;

import java.util.Enumeration;
import java.util.Vector;

public class VectorEnnumaration {

	public static void main(String[] args) {

		/*
		 * Below example shows how to iterate through vector using Enumeration object.
		 * You can get Enumeration object by calling elements() method.
		 */
		Vector<String> vct = new Vector<String>();
		// adding elements to the end
		vct.add("First");
		vct.add("Second");
		vct.add("Third");
		vct.add("Random");
		Enumeration<String> enm = vct.elements();
		while (enm.hasMoreElements()) {
			System.out.println(enm.nextElement());
		}
	}

}
