package com.java8.predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee {
	String name;
	double salary;

	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}
}

public class EmployeeExample {
	public static void main(String[] args) {
		ArrayList<Employee> l = new ArrayList<Employee>();
		l.add(new Employee("anand", 10000));
		l.add(new Employee("ashok", 18297));
		l.add(new Employee("amurth", 76767));
		l.add(new Employee("anji", 89798));
		l.add(new Employee("ghouse", 876876));
		l.add(new Employee("vamsi", 8977));
		l.add(new Employee("salman", 1000));
		l.add(new Employee("kalki", 98787));
		l.add(new Employee("venkat", 77676));
		 Predicate<Employee> p = e -> e.salary > 80000;
		//Predicate<Employee> p = e -> e.name.length() > 2;
		for (Employee employee : l) {
			if (p.test(employee)) {
				System.out.println(employee.name + ":" + employee.salary);
			}
		}

	}
}
