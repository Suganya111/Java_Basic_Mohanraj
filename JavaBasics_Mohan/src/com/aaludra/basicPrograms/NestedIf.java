package com.aaludra.basicPrograms;

public class NestedIf {

	public static void main(String[] args) {
		int age = 18;
		int height = 6;

		if (age >= 25) {
			if (height > 6) {
				System.out.println("You are tall");
			} else {
				System.out.println("You are short ");
			}
		} else {
			System.out.println("Perfect Height");
		}
	}

}
