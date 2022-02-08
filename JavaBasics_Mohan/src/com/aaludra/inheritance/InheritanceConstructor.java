package com.aaludra.inheritance;

public class InheritanceConstructor {
	private String name;
	private String phoneNumber;
	private String mailId;
	
	public InheritanceConstructor(String name) {
		System.out.println("Person Constructor");
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}


}
