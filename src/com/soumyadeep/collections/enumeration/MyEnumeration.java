package com.soumyadeep.collections.enumeration;

import java.util.Enumeration;
import java.util.Vector;

public class MyEnumeration {

	public static void main(String[] args) {

		/*
		 * A class that implements Enumeration interface provides access to series of
		 * elements one at a time. You need to call nextElement method to get next
		 * element in the series. Also hasMoreElements() method gives you status about
		 * the availability of next element in the series.
		 * 
		 */
		Vector<String> lang = new Vector<>();
		Enumeration<String> en = lang.elements();
		lang.add("JAVA");
		lang.add("JSP");
		lang.add("SERVLET");
		lang.add("EJB");
		lang.add("PHP");
		lang.add("PERL");
		while (en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
	}

}
