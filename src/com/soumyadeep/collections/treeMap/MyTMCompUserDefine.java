package com.soumyadeep.collections.treeMap;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

public class MyTMCompUserDefine {

	public static void main(String[] args) {

		/*
		 * Below example shows how to sort user defined objects by using comparator
		 * object. You can include you own custom sorting logic with compare method. By
		 * passing comparator object to the TreeMap, you can sort the keys based on the
		 * logic provided inside the compare method.
		 */
		// By using name comparator (String comparison)
		TreeMap<Emplye, String> tm = new TreeMap<Emplye, String>(new MyNameComp());
		tm.put(new Emplye("Ram", 3000), "RAM");
		tm.put(new Emplye("John", 6000), "JOHN");
		tm.put(new Emplye("Crish", 2000), "CRISH");
		tm.put(new Emplye("Tom", 2400), "TOM");
		Set<Emplye> keys = tm.keySet();
		for (Emplye key : keys) {
			System.out.println(key + " ==> " + tm.get(key));
		}
		System.out.println("===================================");
		// By using salary comparator (int comparison)
		TreeMap<Emplye, String> trmap = new TreeMap<Emplye, String>(new MySalaryComp());
		trmap.put(new Emplye("Ram", 3000), "RAM");
		trmap.put(new Emplye("John", 6000), "JOHN");
		trmap.put(new Emplye("Crish", 2000), "CRISH");
		trmap.put(new Emplye("Tom", 2400), "TOM");
		Set<Emplye> ks = trmap.keySet();
		for (Emplye key : ks) {
			System.out.println(key + " ==> " + trmap.get(key));
		}
	}
}

class MyNameComp implements Comparator<Emplye> {

	@Override
	public int compare(Emplye e1, Emplye e2) {
		return e1.getName().compareTo(e2.getName());
	}
}

class MySalaryComp implements Comparator<Emplye> {

	@Override
	public int compare(Emplye e1, Emplye e2) {
		if (e1.getSalary() > e2.getSalary()) {
			return 1;
		} else {
			return -1;
		}
	}
}

class Emplye {

	private String name;
	private int salary;

	public Emplye(String n, int s) {
		this.name = n;
		this.salary = s;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String toString() {
		return "Name: " + this.name + "-- Salary: " + this.salary;
	}

}
