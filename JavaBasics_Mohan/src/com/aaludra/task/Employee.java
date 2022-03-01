package com.aaludra.task;

public class Employee {

	private int empId;
	private String empName;
	private int phoneNumber;
	private int salary;

	public Employee(int empId, String empName, int phoneNumber, int salary) {
		this.empId = empId;
		this.empName = empName;
		this.phoneNumber = phoneNumber;
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmployeeNum(String empName) {
		this.empName = empName;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "employeeId=" + empId + ", employeeNum=" + empName + ", phoneNumber=" + phoneNumber + ", salary="
				+ salary + "";
	}

}
