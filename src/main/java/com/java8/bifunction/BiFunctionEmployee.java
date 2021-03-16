package com.java8.bifunction;

import java.util.ArrayList;
import java.util.function.BiFunction;

public class BiFunctionEmployee {
	public static void main(String[] args) {
		ArrayList<Employee> e = new ArrayList<Employee>();
		BiFunction<Integer, String, Employee> bi = (id, name) -> new Employee(id, name);
		e.add(bi.apply(101, "dandi"));
		e.add(bi.apply(104, "jani"));
		e.add(bi.apply(106, "ram"));
		e.add(bi.apply(103, "bhoom"));
		// System.out.println(e);

		for (Employee employee : e) {
			System.out.println(employee.name);
			System.out.println(employee.id);
			System.out.println();
		}
	}
}
