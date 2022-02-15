package com.exception.handling;

public class FinallyExample {
	public static void main(String args[]) {
		try {
			System.out.println("inside try block");
			System.out.println(34 / 0);
		} catch (ArithmeticException e) {

			System.out.println("Number not divided by zero");
		} finally {

			System.out.println("finally : i execute always.");

		}
	}
}
