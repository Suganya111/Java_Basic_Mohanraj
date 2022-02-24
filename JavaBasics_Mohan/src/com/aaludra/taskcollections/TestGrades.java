package com.aaludra.taskcollections;

import com.aaludra.taskcollections.GradeEnumTask.GradeEnumTasks;

public class TestGrades {

	private String subject;
	private double mark;
	private String grade;

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

	public TestGrades(String subject, double mark) {
		this.subject = subject;
		this.mark = mark;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getGrad() {
		for (GradeEnumTasks val : GradeEnumTasks.values()) {
			if (mark >= val.g2 && mark <= val.g1) {
				return val.grade;
			}
		}
		return "Not a valid grade";

	}

}