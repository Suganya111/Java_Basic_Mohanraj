package com.aaludra.exception.handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Basic {
	public static void main(String[] args) {

		double a = 10;
		System.out.println("Enter Number");
		try {
			try {
				Scanner sc = new Scanner(System.in);
				double b = sc.nextInt();
				double c = a / b;
				System.out.println(c);
			} catch (ArithmeticException e) {
				System.out.println("Don't Enter zero");
			}
		} catch (InputMismatchException ime) {
			System.out.println("Don't enter Alphabet");
		} finally {
			System.out.println("Block Ended");
		}

	}
}
