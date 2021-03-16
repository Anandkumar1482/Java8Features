package com.java8.suplier;

public class NoramlOpt {
	public static void main(String[] args) {
		String str = "";
		for (int i = 0; i < 6; i++) {
			str = str + (int) (Math.random() * 10);
		}
		System.out.println(str);
	}
}
