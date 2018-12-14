package com.soumyadeep.collections.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyEmpMinSalary {

	public static void main(String[] args) {

		/*
		 * Collections.min() method returns the minimum element of the given collection,
		 * according to the natural ordering of its elements. All elements in the
		 * collection must implement the Comparable interface. Furthermore, all elements
		 * in the collection must be mutually comparable (that is, e1.compareTo(e2) must
		 * not throw a ClassCastException for any elements e1 and e2 in the collection).
		 * Below example shows how to get min salary from the given list of user defined
		 * objects.
		 */
		List<Empl2> emps = new ArrayList<Empl2>();
		emps.add(new Empl2(10, "Raghu", 25000));
		emps.add(new Empl2(120, "Krish", 45000));
		emps.add(new Empl2(210, "John", 14000));
		emps.add(new Empl2(150, "Kishore", 24000));
		Empl2 minSal = Collections.min(emps);
		System.out.println("Empl2oyee with min salary: " + minSal);
	}
}

class Empl2 implements Comparable<Empl2> {

	private int id;
	private String name;
	private Integer salary;

	public Empl2(int id, String name, Integer sal) {
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
	public int compareTo(Empl2 emp) {

		return this.salary.compareTo(emp.getSalary());
	}

	public String toString() {
		return id + "  " + name + "   " + salary;

	}

}
