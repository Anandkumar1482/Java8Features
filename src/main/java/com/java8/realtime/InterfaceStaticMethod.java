package com.java8.realtime;

interface Inf {
	public static void m1() {
		System.out.println("interface static m1()");
	}
}

public class InterfaceStaticMethod implements Inf {
	public static void main(String[] args) {
		Inf.m1();// 1
		//InterfaceStaticMethod i = new InterfaceStaticMethod();
		// i.m1();// 2
		// InterfaceStaticMethod.m1();// 3
		// m1();// 4

	}
}
