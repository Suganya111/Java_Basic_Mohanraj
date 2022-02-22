package com.aaludra.collections;

public class StudentGradeTask {
	private String subject;
	private double mark;

	public StudentGradeTask(String subject, double mark) {
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
}
