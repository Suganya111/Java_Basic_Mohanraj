package com.aaludra.collections;

enum GradeEnumTask {
	G1("Grade1", 100, 80), G2("Grade2", 79, 50), G3("Grade3", 49, 30), G4("Grade4", 29, 0);

	String grades;
	int g1;
	int g2;

	GradeEnumTask(String grades, int g1, int g2) {
		this.grades = grades;
		this.g1 = g1;
		this.g2 = g2;
		
	}

	public String getGrades() {
		return grades;
	}

	void setGrades(String grades) {
		this.grades = grades;
	}

	public int getG1() {
		return g1;
	}

	void setG1(int g1) {
		this.g1 = g1;
	}

	public int getG2() {
		return g2;
	}

	public void setG2(int g2) {
		this.g2 = g2;
	}

	@Override
	public String toString() {
		return "Grade:" + this.getGrades() + "Range:" + this.getG1() + "," + this.getG2();
	}
}