package com.java8.predicate;

import java.util.function.Predicate;

public class PredicteOr {
	public static void main(String[] args) {
		int[] a = { 12, 34, 45, 14, 35, 78, 98 };
		Predicate<Integer> p = i -> i % 2 == 0;
		Predicate<Integer> p1 = i -> i > 30;
		System.out.println("the numbers are even or >30 ");
		for (int a1 : a) {
			if (p.or(p1).test(a1)) {
				System.out.println(a1);
			}
		}
	}
}
