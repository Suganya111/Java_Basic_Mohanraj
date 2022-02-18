package com.aaludra.exception.handling;

public class FinallyEx {
	public static void main(String args[]) {

		int a = 20;
		int b = 30;
		try {
			int sum = a + b;
			System.out.println("Sum: " + sum);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("finally block must be executed");
		}
		System.out.println("Java Learning");
	}
}