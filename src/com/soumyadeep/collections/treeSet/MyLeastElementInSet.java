package com.soumyadeep.collections.treeSet;

import java.util.Comparator;
import java.util.TreeSet;

public class MyLeastElementInSet {

	public static void main(String[] args) {

		/*
		 * To get least value element of user design objects, we need to implement
		 * sorting logic on TreeSet. To implement your own sorting functionality with
		 * TreeSet on user defined objects, you have to pass Comparator object along
		 * with TreeSet constructor call. The Comparator implementation holds the
		 * sorting logic. You have to override compare() method to provide the sorting
		 * logic on user defined objects. Now you can get least value element from set
		 * by using first() method depending on your sorting logic.
		 */

		TreeSet<Empl1> salComp = new TreeSet<Empl1>(new MySalCompr());
		salComp.add(new Empl1("Ram", 3000));
		salComp.add(new Empl1("John", 6000));
		salComp.add(new Empl1("Crish", 2000));
		salComp.add(new Empl1("Tom", 2400));
		System.out.println("Least salary emp: " + salComp.first());
	}
}

class MySalCompr implements Comparator<Empl1> {

	@Override
	public int compare(Empl1 e1, Empl1 e2) {
		if (e1.getSalary() > e2.getSalary()) {
			return 1;
		} else {
			return -1;
		}
	}
}

class Empl1 {

	private String name;
	private int salary;

	public Empl1(String n, int s) {
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
