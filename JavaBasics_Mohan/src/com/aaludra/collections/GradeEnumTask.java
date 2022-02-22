package com.aaludra.collections;

enum GradeEnumTask {
	G1("Grade1", 100, 80), G2("Grade2", 79, 50), G3("Grade3", 49, 30), G4("Grade4", 29, 0);

	String grade;
	int g1;
	int g2;

	GradeEnumTask(String grade, int g1, int g2) {
		this.grade = grade;
		this.g1 = g1;
		this.g2 = g2;
	}

	public static String getGrade(int a) {
		for (GradeEnumTask val : GradeEnumTask.values()) {

			if (val.g1 >= a && val.g2 <= a) {
				return val.grade;
			}
		}
		return "Not a valid grade";
	}
}
