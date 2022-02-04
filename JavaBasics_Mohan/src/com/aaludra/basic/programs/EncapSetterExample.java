package com.aaludra.basic.programs;

public class EncapSetterExample {
	private int speed; // member variable

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if (speed > 0)
			this.speed = speed;
	}
	public void increaseSpeed(int howMuch) {
		this.speed = this.speed + howMuch;
	}

	void run() { // Run Method

		System.out.println("car is Best");

	}
}
