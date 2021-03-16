package com.java8.suplier;

import java.util.function.Supplier;

public class SupplierOtp {
	public static void main(String[] args) {
		Supplier<String> supplier = () -> {
			String otp = "";
			for (int i = 0; i < 6; i++) {
				otp = otp + (int) (Math.random() * 10);
			}
			return otp;
		};
		System.out.println(supplier.get());
	}
}