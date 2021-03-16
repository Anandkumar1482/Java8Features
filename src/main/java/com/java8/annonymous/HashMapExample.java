package com.java8.annonymous;

import java.util.HashMap;

public class HashMapExample {
	public static void main(String[] args) {
		HashMap<String, Integer> h = new HashMap<>();
		h.put("A", 1);
		h.put("B", 2);
		h.put("C", 3);
		System.out.println(h);
		System.out.println(h.hashCode());
	}
}
