package com.java8.realtime;

interface Left {
	default void m1() {
		System.out.println("Left interface m1()");
	}
}

interface Right {
	default void m1() {
		System.out.println("Right interface m1()");
	}
}

public class MultipleInheritanceDefault implements Right, Left {
	public static void main(String[] args) {
		MultipleInheritanceDefault m = new MultipleInheritanceDefault();
		m.m1();
	}

	@Override
	public void m1() {
		Right.super.m1();
		Left.super.m1();
		System.out.println("our own method m1");
	}
}
