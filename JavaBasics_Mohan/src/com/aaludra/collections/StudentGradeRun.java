package com.aaludra.collections;

import java.util.ArrayList;
import java.util.List;

public class StudentGradeRun {
	public static void main(String[] args) {
		List<StudentGradeTask> list = new ArrayList<>();

		list.add(new StudentGradeTask("T1", 85, GradeEnumTask.G1.toString()));
		list.add(new StudentGradeTask("T2", 66, GradeEnumTask.G2.toString()));
		list.add(new StudentGradeTask("T3", 38, GradeEnumTask.G3.toString()));
		list.add(new StudentGradeTask("T4", 22, GradeEnumTask.G4.toString()));

		for (StudentGradeTask n : list) {
			System.out.println("Name:" + n.getSubject()+ "Mark:" + n.getMark() + n.getGrades());
		}
	}
}