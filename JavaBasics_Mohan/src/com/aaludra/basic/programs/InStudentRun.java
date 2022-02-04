package com.aaludra.basic.programs;

public class InStudentRun {

	public static void main(String[] args) {
		// InheritanceStudent students = new InheritanceStudent();
		// students.setCollege("Aaludra");
		// students.setMailId("new@gmail.com");
		// System.out.println(students.getCollege());
		// System.out.println(students.getMailId());
		InheritancePerson person = new InheritancePerson();
		person.setName("mohan");
		person.setPhoneNumber("123456");
		person.setMailId("new@gmail.com");
		String value = person.toString(); // overriding with toString()
		System.out.println(value);
		System.out.println(person);
	}

}
