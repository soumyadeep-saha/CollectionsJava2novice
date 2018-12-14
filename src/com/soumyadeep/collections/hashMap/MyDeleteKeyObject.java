package com.soumyadeep.collections.hashMap;

import java.util.HashMap;
import java.util.Set;

public class MyDeleteKeyObject {

	public static void main(String[] args) {

		/*
		 * Below example shows how to delete user defined objects as a key from HashMap.
		 * You can achieve this by implementing equals and hashcode methods at the user
		 * defined objects.
		 */
		HashMap<PriceNew, String> hm = new HashMap<PriceNew, String>();
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

	public static void printMap(HashMap<PriceNew, String> map) {

		Set<PriceNew> keys = map.keySet();
		for (PriceNew p : keys) {
			System.out.println(p + "==>" + map.get(p));
		}
	}
}

class PriceNew {

	private String item;
	private int price;

	public PriceNew(String itm, int pr) {
		this.item = itm;
		this.price = pr;
	}

	public int hashCode() {
		System.out.println("In hashcode");
		int hashcode = 0;
		hashcode = price * 20;
		hashcode += item.hashCode();
		return hashcode;
	}

	public boolean equals(Object obj) {
		System.out.println("In equals");
		if (obj instanceof Price) {
			PriceNew pp = (PriceNew) obj;
			return (pp.item.equals(this.item) && pp.price == this.price);
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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String toString() {
		return "item: " + item + "  price: " + price;
	}

}
