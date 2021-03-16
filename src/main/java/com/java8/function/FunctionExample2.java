package com.java8.function;

import java.util.function.Function;

/*trim( )- can be used to remove the blank space from begin of the String and Ending 
 * of the String and not in-between of the String.
output :
SV COLLEGE*/
public class FunctionExample2 {
	public static void main(String[] args) {
		Function<String, String> f = s -> s.toUpperCase().trim();
		System.out.println(f.apply(" sv college"));
	}
}
