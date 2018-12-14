package com.soumyadeep.collections.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MySyncList {

	public static void main(String[] args) {

		/*
		 * The ArrayList is not synchornized (not thread-safe).
		 * Collections.synchronizedList() method helps to get thread safe list.
		 * Collections.synchronizedList() method Returns a synchronized (thread-safe)
		 * list backed by the specified list. In order to guarantee serial access, it is
		 * critical that all access to the backing list is accomplished through the
		 * returned list.
		 */
		List<String> li = new ArrayList<String>();
		List<String> sysLi = Collections.synchronizedList(li);
		System.out.println("Synchronized list got created...");
	}

}
