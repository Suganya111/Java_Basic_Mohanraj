package com.aaludra.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectInputEx {
	public static void main(String[] args) throws IOException {
		String s = "Java Learning";
		FileOutputStream outstream = new FileOutputStream("file1.txt");
		ObjectOutputStream objoutstream = new ObjectOutputStream(outstream);
		objoutstream.writeUTF(s);
		objoutstream.flush();
		ObjectInputStream objinstream = new ObjectInputStream(new FileInputStream("file1.txt"));
		byte[] bt = new byte[15];
		objinstream.readFully(bt);
		String str = new String(bt);
		System.out.println("" + str);
	}
}