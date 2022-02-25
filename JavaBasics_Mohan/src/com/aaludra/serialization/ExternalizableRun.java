package com.aaludra.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ExternalizableRun {
	public static void main(String[] args) throws Exception {
		ExternalizableEx e = new ExternalizableEx();
		e.name = "Raja";
		e.age = 26;
		FileOutputStream fileOut = new FileOutputStream("test.txt");
		ObjectOutputStream out = new ObjectOutputStream(fileOut);
		out.writeObject(e);
		FileInputStream fileIn = new FileInputStream("test.txt");
		ObjectInputStream in = new ObjectInputStream(fileIn);
		e = (ExternalizableEx) in.readObject();
		System.out.println(e.name);
		System.out.println(e.age);

	}
}