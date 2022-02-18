package com.aaludra.collections;

public class CollectionTask1 {
	private String[] subjectName;
	private int[] mark;

	public int returnAvg() {
		int avg = 0;
		int sum = 0;
		for (int i = 0; i < mark.length; i++) {
			sum = sum + mark[i];
		}
		avg = sum/mark.length;
		return avg;
	}
	public void setName(String subjectName, int index) {
		this.subjectName[index] = subjectName;
	}
	public int[] getMark() {
		return mark;
	}
	public void setMark(int mark, int index) {
		this.mark[index] = mark;
	}
	public void setTotalSubject(int totalSubject) {
		subjectName = new String[totalSubject];
		mark = new int[totalSubject];
	}
}