package com.aaludra.task;

import java.util.List;

public class Constant {
	private List<Employee> empList;

	public List<Employee> getEmpList() {
		return empList;
	}

	public void setEmpList(List<Employee> empList) {
		this.empList = empList;
	}

	public void findId(int empId) throws DataNotFoundException {
		List<Employee> filterData = empList.stream().filter(emp -> emp.getEmpId() == empId).toList();

		if (filterData.isEmpty()) {
			throw new DataNotFoundException("Not in the List");
		} else {
			System.out.println(filterData);
		}
	}

	public void findPhoneNumber(int empId) throws DataNotFoundException {
		 List<Employee> filterData = empList.stream().filter(emp -> emp.getPhoneNumber() == empId).toList();

		if (filterData.isEmpty()) {
			throw new DataNotFoundException("Not in a List");
		} else {
			System.out.println(filterData);
		}
	}

	public void findEmpName(String empName) throws DataNotFoundException {
		List<Employee> filterData = empList.stream().filter(emp -> emp.getEmpName().equals(empName)).toList();

		if (filterData.isEmpty()) {
			throw new DataNotFoundException("Not in List");
		} else {
			System.out.println(filterData);

		}
	}
}
