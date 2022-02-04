package com.aaludra.basic.programs;

public abstract class AbstractSchool {

	public void execute() {
	getReady();
	goToSchool();
	enterClass();
	}
	
	abstract void getReady();

	abstract void goToSchool();

	abstract void enterClass();
}
