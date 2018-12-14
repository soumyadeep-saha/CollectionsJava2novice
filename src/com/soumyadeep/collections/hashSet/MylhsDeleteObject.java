package com.soumyadeep.collections.hashSet;

import java.util.HashSet;

public class MylhsDeleteObject {

	public static void main(String[] args) {

		HashSet<Prices> lhs = new HashSet<Prices>();
		lhs.add(new Prices("Banana", 20));
		lhs.add(new Prices("Apple", 40));
		lhs.add(new Prices("Orange", 30));
		for (Prices pr : lhs) {
			System.out.println(pr);
		}
		Prices key = new Prices("Banana", 20);
		System.out.println("deleting key from set...");
		lhs.remove(key);
		System.out.println("Elements after delete:");
		for (Prices pr : lhs) {
			System.out.println(pr);
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
