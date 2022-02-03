package com.aaludra.basic.programs;

public class CarStateObClass {
	int speed; // instance varaible

	void run() { // Run Method

		System.out.println("car is Best");
	}

	public class CarClassRun {

		public static void main(String[] args) {
			CarStateObClass audi = new CarStateObClass(); // Instances
			CarStateObClass bmw = new CarStateObClass();

			audi.run(); // behaviour
			bmw.run();

			audi.speed = 100;
			bmw.speed = 120;
			System.out.println(audi.speed);
		}
	}
}