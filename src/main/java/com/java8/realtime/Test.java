package com.java8.realtime;

class Te {
	public void add(int a, int b) {
		System.out.println("the sum is  " + (a + b));
	}
}

public class Test {
	public static void main(String[] args) {
		Te t = new Te();
		t.add(10, 20);
		// System.out.println(t);

	}
}
