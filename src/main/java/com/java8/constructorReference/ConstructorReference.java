package com.java8.constructorReference;

/*ClassName :: new
 * if we want perform some operation and the method return the object*/
class Temp {
	public Temp() {
		System.out.println("interface get() method refered "
				+ "to the Temp" + " Class Constructor");
	}
}

interface inf {
	public Temp get();
}

public class ConstructorReference {
	public static void main(String[] args) {
		inf i = Temp::new;
		i.get();
	}
}
