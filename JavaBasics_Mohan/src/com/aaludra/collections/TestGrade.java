package com.aaludra.collections;

import java.util.ArrayList;
import java.util.List;

public class TestGrade {

	private String subject;
	private double mark;
	private String grade;

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
	}

	public String getGrad() {
		for (GradeEnumTask val : GradeEnumTask.values()) {
			if (mark >= val.g2 && mark <= val.g1) {
				return val.grade;
			}
		}
		return "Not a Valid Grade";
	}

	public TestGrade(String subject, double mark) {
		this.subject = subject;
		this.mark = mark;
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
		this.mark = mark;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public static void main(String[] args) {
		List<TestGrade> list = new ArrayList<>();
		list.add(new TestGrade("T1", 50));
		list.add(new TestGrade("T2", 87));
		list.add(new TestGrade("T3", 45));
		list.add(new TestGrade("T4", 12));

		for (TestGrade t : list) {
			t.setGrade(t.getGrad());
		}
		for (TestGrade n : list) {
			System.out.println("Name: " + n.getSubject() + "Mark: " + n.getMark() + "Grade: " + n.getGrade());
		}
	}

}