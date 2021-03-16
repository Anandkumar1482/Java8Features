package com.java8.realtime;

class P1 {
	public static void m1() {
		System.out.println("p1 -method");
	}
}

class P2 {
	public static void m1() {
		System.out.println("p2 -method");
	}
}

public class MultpleInheritance extends P1 {

	public static void main(String[] args) {
		MultpleInheritance i = new MultpleInheritance();
		i.m1();
	}
}
