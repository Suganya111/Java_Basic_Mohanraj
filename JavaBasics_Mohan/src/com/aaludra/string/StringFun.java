package com.aaludra.string;

public class StringFun {

	public static void main(String[] args) {

		String course = "Java programming";
		String course2 = "Javascript";
		System.out.println("String: " + course);

		int length = course.length();
		System.out.println("Length: " + length);
		System.out.println("Equals: " + course.equals(course2));
		System.out.println("Char: " + course.charAt(5));
		System.out.println("UPPER CASE: " + course.toUpperCase());
		System.out.println("lower case: " + course2.toLowerCase());
		System.out.println("EndsWith: " + course2.endsWith("ing"));
		System.out.println("Trim: " + course.trim());
		System.out.println("Trim + Length: " + course.trim().length());
		System.out.println("StartsWith: " + course.startsWith("Jav"));
		System.out.println("Contains: " + course.contains("java"));
		System.out.println("Substring: " + course.substring(0, 7));
		System.out.println("Empty: " + course.isEmpty());
		System.out.println("Replace: " + course.replace("Java", "java"));
		System.out.println("Memory Address: " + course.hashCode());
	}
}
