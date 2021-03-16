package com.java8.bipredicate;

import java.util.function.BiPredicate;

public class BiPredicateExample {
	public static void main(String[] args) {
		BiPredicate<Integer, Integer> bi = (a, b) -> (a + b) % 2 == 0;
		System.out.println(bi.test(10, 12));
	}
}
/*
 * Type Parameters:
 * <T> the type of the first argument to the predicate 
 * <U> the type of the second argument the predicate
 */