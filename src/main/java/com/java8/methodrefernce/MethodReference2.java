package com.java8.methodrefernce;

interface inf {
	public void add(int a, int b);
}

public class MethodReference2 {

	public static void main(String[] args) {
		inf i = (a, b) -> System.out.println("the sum of " + (a + b));
		i.add(10, 20);

		inf i1 = MethodReference2::m1;
		i1.add(12, 10);
	}

	public static void m1(int a, int b) {
		System.out.println("the sum of two " + (a + b));
	}
}
