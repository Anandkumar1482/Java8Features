package com.java8.predicate;

import java.util.function.Function;
import java.util.function.Predicate;

public class LengthPredicte {
	public static void main(String[] args) {
		Predicate<String> p = s -> s.length() > 5;
		Function<String, Integer> p1 = s -> s.length();
		System.out.println(p1.apply("anand"));
		System.out.println(p.test("anand dandi"));
	}
}
