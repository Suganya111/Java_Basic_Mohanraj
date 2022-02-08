package com.aaludra.constructor;

public class ConstructorRun {

	public static void main(String[] args) {
		ConstructorExample audi = new ConstructorExample(100); // Instances
		ConstructorExample bmw = new ConstructorExample(100);

		audi.run(); // Behavior
		bmw.run();

		// audi.setSpeed(100);
		audi.increaseSpeed(100);
		System.out.println(audi.getSpeed());
		// bmw.setSpeed(120);
		bmw.increaseSpeed(150);
		System.out.println(bmw.getSpeed());
	}

}