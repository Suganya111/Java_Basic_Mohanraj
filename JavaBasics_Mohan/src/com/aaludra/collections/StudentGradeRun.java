package com.aaludra.collections;

import java.util.ArrayList;
import java.util.List;

public class StudentGradeRun {

	public static void main(String[] args) {

		List<StudentGradeTask> list = new ArrayList<>();
		list.add(new StudentGradeTask("T1", 80));
		String s = GradeEnumTask.getGrade(90);
		for (StudentGradeTask n : list) {
			System.out.println("Name: " + n.getSubject() + "Mark: " + n.getMark() + "Grade: " + s);
		}

	}
}