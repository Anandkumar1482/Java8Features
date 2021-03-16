package com.java8.predicate;

import java.util.Scanner;

public class EvenOrNot {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a NUmber");
		int a = sc.nextInt();
		System.out.println(evenOrNot(a));
		// System.out.println(a); 
	}

	private static boolean evenOrNot(int a) {
		if (a % 2 == 0) {
			return true;
		} else
			return false;
	}

}
