package com.soumyadeep.collections.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyListDisjoint {

	public static void main(String[] args) {

		/*
		 * Collections.disjoint() method returns true if the two specified collections
		 * have no elements in common. Care must be exercised if this method is used on
		 * collections that do not comply with the general contract for Collection.
		 * Implementations may elect to iterate over either collection and test for
		 * containment in the other collection (or to perform any equivalent
		 * computation). If either collection uses a nonstandard equality test (as does
		 * a SortedSet whose ordering is not compatible with equals, or the key set of
		 * an IdentityHashMap), both collections must use the same nonstandard equality
		 * test, or the result of this method is undefined.
		 */
		List<String> sl = new ArrayList<String>();
		sl.add("apple");
		sl.add("java");
		sl.add("c++");
		sl.add("unix");
		sl.add("orange");
		sl.add("airtel");
		List<String> tl = new ArrayList<String>();
		tl.add("job");
		tl.add("oracle");
		tl.add("jungle");
		tl.add("cricket");
		boolean isCommon = Collections.disjoint(sl, tl);
		System.out.println("Does not found any common elements? " + isCommon);
		tl.add("java");
		isCommon = Collections.disjoint(sl, tl);
		System.out.println("Does not found any common elements? " + isCommon);
	}

}
