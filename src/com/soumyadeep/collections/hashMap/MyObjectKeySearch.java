package com.soumyadeep.collections.hashMap;

import java.util.HashMap;
import java.util.Set;

public class MyObjectKeySearch {

	public static void main(String[] args) {

		/*
		 * Below example shows how to search user defined objects as a key from HashMap.
		 * You can achieve this by implementing equals and hashcode methods at the user
		 * defined objects.
		 */
		HashMap<Prices, String> hm = new HashMap<Prices, String>();
		hm.put(new Prices("Banana", 20), "Banana");
		hm.put(new Prices("Apple", 40), "Apple");
		hm.put(new Prices("Orange", 30), "Orange");
		printMap(hm);
		Price key = new Price("Banana", 20);
		System.out.println("Does key available? " + hm.containsKey(key));
	}

	public static void printMap(HashMap<Prices, String> map) {

		Set<Prices> keys = map.keySet();
		for (Prices p : keys) {
			System.out.println(p + "==>" + map.get(p));
		}
	}
}

class Prices {

	private String item;
	private int price;

	public Prices(String itm, int pr) {
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
		if (obj instanceof Prices) {
			Prices pp = (Prices) obj;
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
