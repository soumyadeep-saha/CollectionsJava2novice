package com.soumyadeep.collections.collections;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class MySyncSet {

	public static void main(String[] args) {

		/*
		 * The Set is not synchornized (not thread-safe). Collections.synchronizedSet()
		 * method returns a synchronized (thread-safe) set backed by the specified set.
		 * In order to guarantee serial access, it is critical that all access to the
		 * backing set is accomplished through the returned set.
		 */
		Set<String> ss = new HashSet<String>();
		Set<String> sysSet = Collections.synchronizedSet(ss);
		System.out.println("Synchronized set got created...");

	}

}
