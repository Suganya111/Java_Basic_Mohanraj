package com.aaludra.exception.handling;

public class TryCatchExample {
	public static void main(String[] args) {
		try {
			int[] myNumbers = { 1, 2, 3 };
			System.out.println(myNumbers[6]);
		} catch (Exception ex) {
			System.out.println("Something went wrong");
		}
	}
}