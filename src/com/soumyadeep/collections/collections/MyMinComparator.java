package com.soumyadeep.collections.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyMinComparator {

	public static void main(String[] args) {

		/*
		 * Collections.min() method returns the minimum element of the given collection,
		 * according to the order induced by the specified comparator. All elements in
		 * the collection must be mutually comparable by the specified comparator (that
		 * is, comp.compare(e1, e2) must not throw a ClassCastException for any elements
		 * e1 and e2 in the collection). Below example shows how to get min salary from
		 * the given list of user defined objects by using comparator object.
		 */
		List<Emp3> emps = new ArrayList<Emp3>();
		emps.add(new Emp3(10, "Raghu", 25000));
		emps.add(new Emp3(120, "Krish", 45000));
		emps.add(new Emp3(210, "John", 14000));
		emps.add(new Emp3(150, "Kishore", 24000));
		Emp3 minSal = Collections.min(emps, new Emp3Comp());
		System.out.println("Employee with min salary: " + minSal);
	}
}

class Emp3Comp implements Comparator<Emp3> {

	@Override
	public int compare(Emp3 e1, Emp3 e2) {
		return e1.getSalary().compareTo(e2.getSalary());
	}
}

class Emp3 {

	private int id;
	private String name;
	private Integer salary;

	public Emp3(int id, String name, Integer sal) {
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

	public String toString() {
		return id + "  " + name + "   " + salary;
	}

}
