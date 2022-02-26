package com.aaludra.polymorphism;

import com.aaludra.interfaces.ChessGame;
import com.aaludra.interfaces.InterfaceGaming;
import com.aaludra.interfaces.JumpGame;

public class PolymorphismExample {

	public static void main(String[] args) {

		InterfaceGaming[] games = { new JumpGame(), new ChessGame() };

		for (InterfaceGaming gaming : games) {

			gaming.up();
			gaming.down();
			gaming.left();
			gaming.right();
		}
	}

}
