package com.aaludra.polymorphism;

import com.basic.program.interfaces.ChessGame;
import com.basic.program.interfaces.InterfaceGaming;
import com.basic.program.interfaces.JumpGame;

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
