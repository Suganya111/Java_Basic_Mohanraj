package com.aaludra.enums;

import com.aaludra.enums.EnumGradeTask.Grade;

public class EnumGradeTaskRun {

	public static void main(String[] args) {
		boolean s = Grade.validateSalary("G1", 50000);
		System.out.println(s);
		// System.out.println("Name " + s.name());
		// System.out.println("Min Salary" +s.g1);
		// System.out.println("Max Salary" + s.g2);
	}
}