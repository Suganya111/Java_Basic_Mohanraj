package com.aaludra.basic.programs;

public class EncapSetterRun {

	public static void main(String[] args) {
		EncapSetterExample audi = new EncapSetterExample(); // Instances
		EncapSetterExample bmw = new EncapSetterExample();

		audi.run(); // Behavior
		bmw.run();

		audi.setSpeed(100);
		audi.increaseSpeed(100);
		System.out.println(audi.getSpeed());
		bmw.setSpeed(120);
		bmw.increaseSpeed(150);
		System.out.println(bmw.getSpeed());
	}

}
