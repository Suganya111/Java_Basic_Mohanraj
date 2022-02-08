package com.aaludra.abstraction;

public class AbstractSchoolNew extends AbstractSchool {

	@Override
	void getReady() {
		System.out.println("Wake Up");
		System.out.println("Take Bath");
		System.out.println("Take School Bag");

	}

	@Override
	void goToSchool() {
		System.out.println("Pick a Cab");

	}

	@Override
	void enterClass() {
		System.out.println("Open the door");
		System.out.println("Sit in your Place");

	}

}
