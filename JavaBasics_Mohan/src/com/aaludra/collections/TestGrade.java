package com.aaludra.collections;

import java.util.ArrayList;
import java.util.List;

public class TestGrade {

	private String subject;
	private static double mark;

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

		public static String getGrade() {
			for (GradeEnumTask value : GradeEnumTask.values()) {
				if (value.g1 >= mark && value.g2 <= mark) {
					return value.grade;
				}
			}
			return "Not a valid grade";
		}
	}

	public TestGrade(String subject, double mark) {
		this.subject = subject;
		TestGrade.mark = mark;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public double getMark() {
		return mark;
	}

	public void setMark(double mark) {
		TestGrade.mark = mark;
	}

	public static void main(String[] args) {
		List<TestGrade> list = new ArrayList<>();
		list.add(new TestGrade("T1", 79));
		String s = GradeEnumTask.getGrade();
		for (TestGrade n : list) {
			System.out.println("Name: " + n.getSubject() + "Mark: " + n.getMark() + "Grade: " + s);
		}

	}
}