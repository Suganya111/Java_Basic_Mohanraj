package com.aaludra.enums;

public class EnumExample {

	enum Level {
		LOW, MEDIUM, HIGH
	}

	public static void main(String[] args) {
		Level myVar = Level.MEDIUM;
		System.out.println(myVar);
	}
}
