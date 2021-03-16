package com.java8.features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

class MyC implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		if (o1 > o2) {
			return -1;

		} else if (o1 < o2) {
			return +1;

		} else
			return 0;
	}

}

public class CollectionLambda2 {
	public static void main(String[] args) {

		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(4);
		l.add(20);
		l.add(34);
		l.add(21);
		l.add(11);

		System.out.println(l);
		Collections.sort(l);
		System.out.println(l);
		Comparator<Integer> comp = (i1, i2) -> (i1 > i2) ? -1 : (i1 < i2) ? +1 : 0;
		Collections.sort(l, comp);
		System.out.println(l);
		l.stream().forEach(System.out::println);
		java.util.List<Integer> l1 = l.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println(l1);

	}
}
