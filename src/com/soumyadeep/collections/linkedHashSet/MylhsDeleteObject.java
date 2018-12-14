package com.soumyadeep.collections.linkedHashSet;

import java.util.LinkedHashSet;

public class MylhsDeleteObject {

	public static void main(String[] args) {

		/*
		 * Below example shows how to delete user defined objects from LinkedHashSet.
		 * You can achieve this by implementing equals and hashcode methods at the user
		 * defined objects.
		 */
		LinkedHashSet<Priced> lhs = new LinkedHashSet<Priced>();
		lhs.add(new Priced("Banana", 20));
		lhs.add(new Priced("Apple", 40));
		lhs.add(new Priced("Orange", 30));
		for (Priced pr : lhs) {
			System.out.println(pr);
		}
		Priced key = new Priced("Banana", 20);
		System.out.println("deleting key from set...");
		lhs.remove(key);
		System.out.println("Elements after delete:");
		for (Priced pr : lhs) {
			System.out.println(pr);
		}
	}
}

class Priced {

	private String item;
	private int price;

	public Priced(String itm, int pr) {
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
		if (obj instanceof Priced) {
			Priced pp = (Priced) obj;
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
