package com.aaludra.interfaces;

public class InterfaceTask1 implements InterfaceTask {

	@Override
	public void whileLoop(int n) {
		int c = 10;
		int i = 1;
		while (i <= n) {
			if (c % 2 == 0) {
				int j = 0;
				while (j < i) {
					System.out.print(c);
					j++;
				}
			}
			c--;
			System.out.println("");
			i++;

		}
	}

	@Override
	public void doWhileLoop(int n) {
		int c = 10;
		int k = 1;
		do {
			int j = 0;

			do {
				if (c % 2 != 0) {
					System.out.print(c);
				}
				j++;
			} while (j < k);
			c--;
			System.out.println("");
			k++;
		} while (k <= n);
	}

	@Override
	public void forLoop(int n) {
		int c = 10;
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < i; j++) {
				if (c % 2 == 0) {
					System.out.print(c);
				}
			}
			c--;
			System.out.println("");
		}

	}
}