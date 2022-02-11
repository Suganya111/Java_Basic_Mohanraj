package com.aaludra.enums;

public class EnumTaskExRun {

	public static void main(String[] args) {
		Grade s = Grade.getGrade(7000);
		System.out.println("Grade " + s.grades);
		System.out.println("Name " + s.name());
		System.out.println("Min Salary" + s.g1);
		System.out.println("Max Salary" + s.g2);
	}
}
