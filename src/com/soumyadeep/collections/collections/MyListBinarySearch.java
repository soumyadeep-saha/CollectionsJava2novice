package com.soumyadeep.collections.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyListBinarySearch {

	public static void main(String[] args) {

		/*
		 * The Collections.binarySearch() method searches the specified list for the
		 * specified user defined object using the binary search algorithm. The list
		 * must be sorted into ascending order according to the specified comparator (as
		 * by the sort(List, Comparator) method), prior to making this call. If it is
		 * not sorted, the results are undefined. If the list contains multiple elements
		 * equal to the specified object, there is no guarantee which one will be found.
		 */
		List<Emp1> Emp1List = new ArrayList<Emp1>();
		Emp1List.add(new Emp1(12, "Dinesh", 50000));
		Emp1List.add(new Emp1(146, "Tom", 20000));
		Emp1List.add(new Emp1(201, "John", 40000));
		Emp1List.add(new Emp1(302, "Krish", 44500));
		Emp1List.add(new Emp1(543, "Abdul", 10000));

		Emp1 searchKey = new Emp1(201, "John", 40000);
		int index = Collections.binarySearch(Emp1List, searchKey, new Emp1Comp());
		System.out.println("Index of the searched key: " + index);
	}
}

class Emp1Comp implements Comparator<Emp1> {

	public int compare(Emp1 e1, Emp1 e2) {
		if (e1.getEmp1Id() == e2.getEmp1Id()) {
			return 0;
		} else {
			return -1;
		}
	}
}

class Emp1 {

	private int Emp1Id;
	private String Emp1Name;
	private int Emp1Sal;

	public Emp1(int id, String name, int sal) {
		this.Emp1Id = id;
		this.Emp1Name = name;
		this.Emp1Sal = sal;
	}

	public int getEmp1Id() {
		return Emp1Id;
	}

	public void setEmp1Id(int Emp1Id) {
		this.Emp1Id = Emp1Id;
	}

	public String getEmp1Name() {
		return Emp1Name;
	}

	public void setEmp1Name(String Emp1Name) {
		this.Emp1Name = Emp1Name;
	}

	public int getEmp1Sal() {
		return Emp1Sal;
	}

	public void setEmp1Sal(int Emp1Sal) {
		this.Emp1Sal = Emp1Sal;
	}

	public String toString() {
		return Emp1Id + " : " + Emp1Name + " : " + Emp1Sal;
	}

}
