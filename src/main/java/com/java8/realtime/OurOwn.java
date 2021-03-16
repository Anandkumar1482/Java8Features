package com.java8.realtime;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class OurOwn {
	public static void main(String[] args) {
		ArrayList<Employee> l = new ArrayList<Employee>();
		l.add(new Employee(100, "anand"));
		l.add(new Employee(111, "reddy"));
		l.add(new Employee(101, "kuamr"));

		l.add(new Employee(121, "amith"));

		l.add(new Employee(109, "suku"));

		l.add(new Employee(120, "surabi"));

		l.add(new Employee(124, "rowdy"));

		l.add(new Employee(101, "jai"));
		System.out.println(l);
		// Comparator<Employee> com = (e1, e2) -> (e1.id < e2.id) ? +1 : (e1.id > e2.id)
		// ? -1 : 0;
		Comparator<Employee> com = (e1, e2) -> (e1.name).compareTo(e2.name);
		Collections.sort(l, com);
		System.out.println(l);
		l.stream().forEach(System.out::println);
	}

}
