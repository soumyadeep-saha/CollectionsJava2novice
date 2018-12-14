package com.soumyadeep.collections.collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MySyncMap {

	public static void main(String[] args) {

		/*
		 * The Map is not synchornized (not thread-safe). Collections.synchronizedMap()
		 * method returns a synchronized (thread-safe) map backed by the specified map.
		 * In order to guarantee serial access, it is critical that all access to the
		 * backing map is accomplished through the returned map.
		 */
		Map<String, String> mp = new HashMap<String, String>();
		Map<String, String> sysMapt = Collections.synchronizedMap(mp);
		System.out.println("Synchronized map got created...");
	}

}
