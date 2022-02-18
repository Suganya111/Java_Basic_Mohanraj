package com.aaludra.collections;

public class Test {
	String subject;
	int mark;

	public String getSubject() {
		return subject;
	}

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Test(String subject, int mark) {
		this.subject = subject;
		this.mark = mark;
	}
}
