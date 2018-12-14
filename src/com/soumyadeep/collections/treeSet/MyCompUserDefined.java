package com.soumyadeep.collections.treeSet;

import java.util.Comparator;
import java.util.TreeSet;

public class MyCompUserDefined {

	public static void main(String[] args) {

		/*
		 * To implement your own sorting functionality with TreeSet on user defined
		 * objects, you have to pass Comparator object along with TreeSet constructor
		 * call. The Comparator implementation holds the sorting logic. You have to
		 * override compare() method to provide the sorting logic on user defined
		 * objects. Below example shows how to sort TreeSet using comparator with user
		 * defined objects.
		 */
		// By using name comparator (String comparison)
		TreeSet<Emplye> nameComp = new TreeSet<Emplye>(new MyNameComp1());
		nameComp.add(new Emplye("Ram", 3000));
		nameComp.add(new Emplye("John", 6000));
		nameComp.add(new Emplye("Crish", 2000));
		nameComp.add(new Emplye("Tom", 2400));
		for (Emplye e : nameComp) {
			System.out.println(e);
		}
		System.out.println("===========================");
		// By using salary comparator (int comparison)
		TreeSet<Emplye> salComp = new TreeSet<Emplye>(new MySalaryComp1());
		salComp.add(new Emplye("Ram", 3000));
		salComp.add(new Emplye("John", 6000));
		salComp.add(new Emplye("Crish", 2000));
		salComp.add(new Emplye("Tom", 2400));
		for (Emplye e : salComp) {
			System.out.println(e);
		}
	}
}

class MyNameComp1 implements Comparator<Emplye> {

	@Override
	public int compare(Emplye e1, Emplye e2) {
		return e1.getName().compareTo(e2.getName());
	}
}

class MySalaryComp1 implements Comparator<Emplye> {

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
