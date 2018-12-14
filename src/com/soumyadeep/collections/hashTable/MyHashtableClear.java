package com.soumyadeep.collections.hashTable;

import java.util.Hashtable;

public class MyHashtableClear {

	public static void main(String[] args) {

		/*
		 * Below example shows how to delete all key-values at one call from Hashtable.
		 * By calling clear() method, we can remove all elements from Hashtable at once.
		 */
		Hashtable<String, String> hm = new Hashtable<String, String>();
        //add key-value pair to Hashtable
        hm.put("first", "FIRST INSERTED");
        hm.put("second", "SECOND INSERTED");
        hm.put("third","THIRD INSERTED");
        System.out.println("My Hashtable content:");
        System.out.println(hm);
        System.out.println("Clearing Hashtable:");
        hm.clear();
        System.out.println("Content After clear:");
        System.out.println(hm);
	}
}
