package com.java8.predicate;

import java.util.function.Predicate;

public class EvenOrNotPredicate {
	public static void main(String[] args) {
		Predicate<Integer> p = i -> i % 2 == 0;
		System.out.println(p.test(10));
	}
}
