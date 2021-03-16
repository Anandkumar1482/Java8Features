package com.java8.features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class MyComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		// return o1.compareTo(o2);
		return -o1.compareTo(o2);
	}

}

public class CollectionLambda {
	public static void main(String[] args) {

		ArrayList<String> l = new ArrayList<String>();
		l.add("anand");
		l.add("ganesh");
		l.add("somesh");
		l.add("ravi");
		l.add("ramu");
		l.add("krish");
		System.out.println(l);
		Collections.sort(l);
		System.out.println(l);
		Comparator<String> comp = (s1, s2) -> -s1.compareTo(s2);
		Collections.sort(l, comp);
		System.out.println(l);
	}
}
