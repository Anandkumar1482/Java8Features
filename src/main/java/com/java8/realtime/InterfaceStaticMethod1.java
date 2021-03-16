package com.java8.realtime;

interface inf {
	public static void add(int a, int b) {
		System.out.println("the sum of two numbers " + (a + b));
	}
}

public class InterfaceStaticMethod1 {
	public static void main(String[] args) {
		inf.add(10, 20);
	}
}
