package com.aaludra.collections;

public class BasicNew {
	private String name;
	private double mark;
	 BasicNew(double mark, String name) {
		this.mark = mark;
		this.name = name;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
}
