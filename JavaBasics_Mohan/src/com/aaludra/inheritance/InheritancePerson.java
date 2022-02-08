package com.aaludra.inheritance;

public class InheritancePerson { // by default extends Objects
	private String name;
	private String phoneNumber;
	private String mailId;

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

	public String toString() {
		return name + "#" + phoneNumber + "#" + mailId;// hierarchy Objects into sub Class
	}
}
