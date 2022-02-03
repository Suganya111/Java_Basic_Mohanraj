package com.aaludra.basicPrograms;

public class CarClass {

	void Run() { // Run Method
		System.out.println("car is Best");
	}

	public class CarClassRun {

		public static void main(String[] args) {

			CarClass Audi = new CarClass(); // Instances
			CarClass Bmw = new CarClass();

			Audi.Run(); // behaviour
			Bmw.Run();
		}
	}

}