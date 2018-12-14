package com.soumyadeep.collections.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyMaxUDOComparable {

	public static void main(String[] args) {

		/*
		 * Collections.max() method returns the maximum element of the given collection,
		 * according to the natural ordering of its elements. All elements in the
		 * collection must implement the Comparable interface. Furthermore, all elements
		 * in the collection must be mutually comparable (that is, e1.compareTo(e2) must
		 * not throw a ClassCastException for any elements e1 and e2 in the collection).
		 * Below example shows how to get max salary from the given list of user defined
		 * objects.
		 */
		List<Empl1> emps = new ArrayList<Empl1>();
		emps.add(new Empl1(10, "Raghu", 25000));
		emps.add(new Empl1(120, "Krish", 45000));
		emps.add(new Empl1(210, "John", 14000));
		emps.add(new Empl1(150, "Kishore", 24000));
		Empl1 maxSal = Collections.max(emps);
		System.out.println("Empl1oyee with max salary: " + maxSal);
	}
}

class Empl1 implements Comparable<Empl1> {

	private int id;
	private String name;
	private Integer salary;

	public Empl1(int id, String name, Integer sal) {
		this.id = id;
		this.name = name;
		this.salary = sal;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	@Override
	public int compareTo(Empl1 emp) {

		return this.salary.compareTo(emp.getSalary());
	}

	public String toString() {
		return id + "  " + name + "   " + salary;
	}
}
