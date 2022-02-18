package com.aaludra.exception.handling;

public class MultipleCatchEx {
	public static void main(String[] args) {

		try {
			int[] a = new int[5];
			System.out.println(a[10]);
		} catch (ArithmeticException ex) {
			System.out.println("Arithmetic Exception occurs");
		} catch (ArrayIndexOutOfBoundsException ex1) {
			System.out.println("ArrayIndexOutOfBounds Exception occurs");
		} catch (Exception ex) {
			System.out.println("Exception occurs");
		}
		System.out.println("remaining code");
	}
}