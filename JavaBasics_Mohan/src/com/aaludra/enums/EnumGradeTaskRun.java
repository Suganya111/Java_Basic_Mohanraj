package com.aaludra.enums;

import com.aaludra.enums.EnumGradeTask.Grade;

public class EnumGradeTaskRun {

	public static void main(String[] args) {
		Grade s = Grade.getGrade(40000);
        System.out.println("Grade "+s.grades);
        System.out.println("Name " + s.name());
        System.out.println("Min Salary" +s.g1);
        System.out.println("Max Salary" + s.g2);
	}
}