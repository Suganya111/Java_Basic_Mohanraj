package com.aaludra.collections;

public class StudentGradeTask {
		private String subject;
		private double mark;
		private String grades;
					
		public StudentGradeTask(String subject, double mark,String grades) {
			this.subject = subject;
			this.mark = mark;
			this.grades = grades;
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

		public String getGrades() {
			return grades;
		}

		public void setGrade(String grades) {
			this.grades = grades;
		}
	
	}
