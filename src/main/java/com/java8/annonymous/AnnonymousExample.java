package com.java8.annonymous;

public class AnnonymousExample {
	public static void main(String[] args) {
		Runnable r = new Runnable() {
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("child Thread " + i);
				}
			}
		};
		Thread t = new Thread(r);
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("child Thread " + i);
		}
	}
}
