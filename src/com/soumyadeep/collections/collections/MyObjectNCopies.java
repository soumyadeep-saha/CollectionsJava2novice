package com.soumyadeep.collections.collections;

import java.util.Collections;
import java.util.List;

public class MyObjectNCopies {

	public static void main(String[] args) {

		/*
		 * Collections.nCopies() method returns an immutable list consisting of n copies
		 * of the specified object. The newly allocated data object is tiny (it contains
		 * a single reference to the data object). This method is useful in combination
		 * with the List.addAll method to grow lists. The returned list is serializable.
		 * Below example shows how to create multiple copies of a user defined object
		 */
		String temp = "JAVA2NOVICE";
		List<String> tempCopies = Collections.nCopies(5, temp);
		System.out.println(tempCopies);
		Emp4 emp = new Emp4(10, "Raghu", 25000);
		List<Emp4> empCopies = Collections.nCopies(5, emp);
		for (Emp4 e : empCopies) {
			System.out.println(e);
		}
	}
}

class Emp4 {

	private int id;
	private String name;
	private Integer salary;

	public Emp4(int id, String name, Integer sal) {
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
