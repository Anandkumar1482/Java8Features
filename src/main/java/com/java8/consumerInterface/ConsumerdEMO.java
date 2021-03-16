package com.java8.consumerInterface;

import java.util.function.Consumer;

public class ConsumerdEMO {
	public static void main(String[] args) {
		Consumer<String> c = s -> System.out.println(s);
		c.accept("hello");
	}
}
