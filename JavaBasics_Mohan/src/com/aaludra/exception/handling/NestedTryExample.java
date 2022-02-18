package com.aaludra.exception.handling;

public class NestedTryExample {
	public static void main(String args[]) {
		try {
			int[] a = { 1, 2, 3, 4, 5 };
			System.out.println(a[4]);
			try {
				System.out.println(a[2] / 0);
			} catch (ArithmeticException e2) {
				System.out.println("division by zero is not possible");
			}
		} catch (ArrayIndexOutOfBoundsException e1) {
			System.out.println("ArrayIndexOutOfBoundsException");
			System.out.println("Element at such index does not exists");
		}
	}
}