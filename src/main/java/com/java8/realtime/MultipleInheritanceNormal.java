package com.java8.realtime;

interface I1 {
	public void m1();

	public void m2();

}

interface I2 {
	public void m2();
}

public class MultipleInheritanceNormal implements I1, I2 {
	public static void main(String[] args) {
		MultipleInheritanceNormal n = new MultipleInheritanceNormal();
		n.m1();
		n.m2();
	}

	@Override
	public void m1() {

		System.out.println("our own m1 method");

	}

	@Override
	public void m2() {
		System.out.println("our own m2 method");

	}

}
