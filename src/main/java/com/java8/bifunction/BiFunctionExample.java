package com.java8.bifunction;

import java.util.function.BiFunction;

import com.java8.realtime.Employee;

public class BiFunctionExample {
	public static void main(String[] args) {
		BiFunction<Integer, String, Employee> bi = (id, name) -> new Employee(id, name);
		System.out.println(bi.apply(101, "raju"));
	}
}
