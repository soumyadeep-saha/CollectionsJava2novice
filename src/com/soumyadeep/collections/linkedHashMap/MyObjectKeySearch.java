package com.soumyadeep.collections.linkedHashMap;

import java.util.LinkedHashMap;
import java.util.Set;

public class MyObjectKeySearch {

	public static void main(String[] args) {

		LinkedHashMap<Prices, String> hm = new LinkedHashMap<Prices, String>();
		hm.put(new Prices("Banana", 20), "Banana");
		hm.put(new Prices("Apple", 40), "Apple");
		hm.put(new Prices("Orange", 30), "Orange");
		printMap(hm);
		Prices key = new Prices("Banana", 20);
		System.out.println("Does key available? " + hm.containsKey(key));
	}

	public static void printMap(LinkedHashMap<Prices, String> map) {

		Set<Prices> keys = map.keySet();
		for (Prices p : keys) {
			System.out.println(p + "==>" + map.get(p));
		}
	}
}

class Prices {

	private String item;
	private int Prices;

	public Prices(String itm, int pr) {
		this.item = itm;
		this.Prices = pr;
	}

	public int hashCode() {
		System.out.println("In hashcode");
		int hashcode = 0;
		hashcode = Prices * 20;
		hashcode += item.hashCode();
		return hashcode;
	}

	public boolean equals(Object obj) {
		System.out.println("In equals");
		if (obj instanceof Prices) {
			Prices pp = (Prices) obj;
			return (pp.item.equals(this.item) && pp.Prices == this.Prices);
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

	public int getPrices() {
		return Prices;
	}

	public void setPrices(int Prices) {
		this.Prices = Prices;
	}

	public String toString() {
		return "item: " + item + "  Prices: " + Prices;
	}
}
