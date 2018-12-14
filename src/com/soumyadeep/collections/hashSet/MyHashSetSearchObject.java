package com.soumyadeep.collections.hashSet;

import java.util.HashSet;

public class MyHashSetSearchObject {

	public static void main(String[] args) {

		/*
		 * Below example shows how to search user defined objects from HashSet. You can
		 * achieve this by implementing equals and hashcode methods at the user defined
		 * objects
		 */
		HashSet<PriceNew> lhs = new HashSet<PriceNew>();
		lhs.add(new PriceNew("Banana", 20));
		lhs.add(new PriceNew("Apple", 40));
		lhs.add(new PriceNew("Orange", 30));
		for (PriceNew pr : lhs) {
			System.out.println(pr);
		}
		PriceNew key = new PriceNew("Banana", 20);
		System.out.println("Does set contains key? " + lhs.contains(key));
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
		if (obj instanceof PriceNew) {
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
