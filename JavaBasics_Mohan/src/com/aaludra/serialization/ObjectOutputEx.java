package com.aaludra.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputEx {
		public static void main(String args[]) throws IOException {
				Student s1 = new Student(211, "ravi");
				FileOutputStream fout = new FileOutputStream("f.txt");
				ObjectOutputStream out = new ObjectOutputStream(fout);
				out.writeObject(s1);
				out.flush();
				out.close();
				System.out.println("Java Learning");
				System.out.println(s1);

				
}
}
