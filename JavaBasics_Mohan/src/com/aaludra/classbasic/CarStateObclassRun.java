package com.aaludra.classbasic;

public class CarStateObclassRun {

	public static void main(String[] args) {

		CarStateObClass audi = new CarStateObClass(); // Instances
		CarStateObClass bmw = new CarStateObClass();

		audi.run(); // Behavior
		bmw.run();

		audi.speed = 100;
		bmw.speed = 120;
		System.out.println(audi.speed);
		System.out.println(bmw.speed);
	}
}
	