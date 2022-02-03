package com.aaludra.basicPrograms;

public class CarClassStateOb { // CarClassStateOb is template 
	int speed; // instance varaible
	
	void Run() { // Run Method
		
		System.out.println("car is Best");
	}


		public class CarClassRun {

			public static void main(String[] args) {

				CarClassStateOb Audi = new CarClassStateOb(); // Instances
				CarClassStateOb Bmw = new CarClassStateOb();

				Audi.Run(); // behaviour
				Bmw.Run();
				
				Audi.speed = 100;
				Bmw.speed = 120;
	}
}
	}