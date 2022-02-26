package com.aaludra.thread;

public class ThreadJoining extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 2; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Current Thread: " + Thread.currentThread().getName());
			System.out.println(i);
		}
	}

	public static void main(String[] args) throws Exception {

		ThreadJoining t1 = new ThreadJoining();
		ThreadJoining t2 = new ThreadJoining();
		ThreadJoining t3 = new ThreadJoining();

		// thread t1 starts
		t1.start();

		// starts second thread after when
		// first thread t1 has died.
		System.out.println("Current Thread: " + Thread.currentThread().getName());
		t1.join();

		t2.start();

		// starts t3 after when thread t2 has died.

		System.out.println("Current Thread: " + Thread.currentThread().getName());

		t3.start();
	}
}