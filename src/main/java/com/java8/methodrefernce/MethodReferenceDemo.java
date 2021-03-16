package com.java8.methodrefernce;

/*method reference is nothing refer one method to already existing method
  no need to write a separate method for this requirement we have to make code 
  re-usability*/
/*method reference is alternative to Lambda expression.no need to write lambda 
 * expression we have to re-use already existing method*/

class Test {
	public void m1() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child thread");
		}
	}
}

public class MethodReferenceDemo {
	public static void main(String[] args) {
		Test t = new Test();
		Runnable r = t::m1;
		/*
		 * () -> { for (int i = 0; i < 10; i++) { System.out.println("Child thread"); }
		 */

		Thread thread = new Thread(r);
		thread.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("main thread");
		}

	}
}
