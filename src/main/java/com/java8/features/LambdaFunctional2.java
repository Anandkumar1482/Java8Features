package com.java8.features;

interface inf {
	public void m1(int a, int b);
}

/*
 * class Demo1 implements inf {
 * 
 * @Override public void m1(int a, int b) { System.out.println("the sum of " +
 * (a + b));
 * 
 * }
 * 
 * }
 */

public class LambdaFunctional2 {
	public static void main(String[] args) {
		inf i = (a, b) -> System.out.println("the sum of " + (a + b));
		i.m1(12, 12);
		i.m1(20, 40);
	}
}
