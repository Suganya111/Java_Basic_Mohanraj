package com.aaludra.enums;

public class EnumGradeTask {
	enum Grade {
		G1("Grade1", 5000, 10000), G2("Grade2", 11000, 25000), G3("Grade3", 26000, 75000);

		String grades;
		int g1;
		int g2;

		Grade(String grades, int g1, int g2) {
			this.grades = grades;
			this.g1 = g1;
			this.g2 = g2;
		}

		public static boolean validateSalary(String s,int a) {
			for (Grade value : Grade.values()) {
			 if (value.name().equals(s)) {
				if ((value.g1 < a) && (value.g2 > a)) {
					return true;
				}
			}}
			return false;

		}
	}
}