package com.soumyadeep.collections.linkedHashMap;

import java.util.LinkedHashMap;
import java.util.Set;

public class MyDeleteKeyObject {

	public static void main(String[] args) {

		/*
		 * Below example shows how to delete user defined objects as a key from
		 * LinkedHashMap. You can achieve this by implementing equals and hashcode
		 * methods at the user defined objects.
		 */
		LinkedHashMap<PriceNew, String> hm = new LinkedHashMap<PriceNew, String>();
		hm.put(new PriceNew("Banana", 20), "Banana");
		hm.put(new PriceNew("Apple", 40), "Apple");
		hm.put(new PriceNew("Orange", 30), "Orange");
		printMap(hm);
		PriceNew key = new PriceNew("Banana", 20);
		System.out.println("Deleting key...");
		hm.remove(key);
		System.out.println("After deleting key:");
		printMap(hm);
	}

	public static void printMap(LinkedHashMap<PriceNew, String> map) {

		Set<PriceNew> keys = map.keySet();
		for (PriceNew p : keys) {
			System.out.println(p + "==>" + map.get(p));
		}
	}
}

class PriceNew {

	private String item;
	private int PriceNew;

	public PriceNew(String itm, int pr) {
		this.item = itm;
		this.PriceNew = pr;
	}

	public int hashCode() {
		System.out.println("In hashcode");
		int hashcode = 0;
		hashcode = PriceNew * 20;
		hashcode += item.hashCode();
		return hashcode;
	}

	public boolean equals(Object obj) {
		System.out.println("In equals");
		if (obj instanceof PriceNew) {
			PriceNew pp = (PriceNew) obj;
			return (pp.item.equals(this.item) && pp.PriceNew == this.PriceNew);
		} else {
			return false;
		}
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public int getPriceNew() {
		return PriceNew;
	}

	public void setPriceNew(int PriceNew) {
		this.PriceNew = PriceNew;
	}

	public String toString() {
		return "item: " + item + "  PriceNew: " + PriceNew;
	}
}
