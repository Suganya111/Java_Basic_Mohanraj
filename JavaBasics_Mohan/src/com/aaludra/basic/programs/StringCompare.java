package com.aaludra.basic.programs;

public class StringCompare {

	public static void main(String[] args) {
		String one = "Mohan";
		String two = "Raj";
		String three = "Mohan";
		
		boolean final1 = one.equals(two);
		System.out.println("Strings first and second are equal: " + final1);
		boolean final2 = one.equals(three);
		System.out.println("Strings first and third are equal: " + final2);
	}
}
