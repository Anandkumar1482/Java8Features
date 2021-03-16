package com.java8.predicate;

import java.util.function.Predicate;

public class BasedOnLength {
	public static void main(String[] args) {
		String[] s = { "anand", "kumar", "dandi", "venky", "ramesh", "guru", "rahul" };
		Predicate<String> p = str -> str.length() > 2;

		for (String string : s) {
			if (p.test(string)) {
				System.out.println(string);
			}
		}
	}

}
