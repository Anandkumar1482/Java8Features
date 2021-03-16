package com.java8.consumerInterface;

import java.util.function.Consumer;

class Movie {
	String name;

	public Movie(String name) {
		super();
		this.name = name;
	}
}

public class ConsumerExample {
	public static void main(String[] args) {
		Consumer<Movie> c = m -> System.out.println("movie name is :" + m.name);
		Consumer<Movie> c1 = m -> System.out.println("movie realesed :" + m.name);
		Consumer<Movie> c2 = m -> System.out.println("movie flop " + m.name);
		Consumer<Movie> c3 = m -> System.out.println("Audience not intersted to see the movie : " + m.name);
		Consumer<Movie> cc = c1.andThen(c2).andThen(c3);
		Movie m = new Movie(" 1- Nenokkadine");
		cc.accept(m);
	}

}
