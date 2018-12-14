package com.soumyadeep.collections.linkedHashSet;

import java.util.LinkedHashSet;

public class MyDistElementEx {

	public static void main(String[] args) {

		/*
		 * Below example shows how to avoid duplicate user defined objects from
		 * LinkedHashSet. You can achieve this by implementing equals and hashcode
		 * methods at the user defined objects.
		 */
		LinkedHashSet<Price> lhm = new LinkedHashSet<Price>();
		lhm.add(new Price("Banana", 20));
		lhm.add(new Price("Apple", 40));
		lhm.add(new Price("Orange", 30));
		for (Price pr : lhm) {
			System.out.println(pr);
		}
		Price duplicate = new Price("Banana", 20);
		System.out.println("inserting duplicate object...");
		lhm.add(duplicate);
		System.out.println("After insertion:");
		for (Price pr : lhm) {
			System.out.println(pr);
		}
	}
}

class Price {

	private String item;
	private int price;

	public Price(String itm, int pr) {
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
			Price pp = (Price) obj;
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