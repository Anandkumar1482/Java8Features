package com.java8.features;

interface interf {
	public void m1();
}

/*
 * here no need to write a sepatrate class to implement interf class Demo
 * implements interf {
 * 
 * @Override public void m1() { System.out.println("hello");
 * 
 * }
 */

public class LambdaFunctinal {
	public static void main(String[] args) {
		interf i = () -> System.out.println("hello");
		i.m1();
	}
}
