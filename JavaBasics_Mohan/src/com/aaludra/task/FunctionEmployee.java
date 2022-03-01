package com.aaludra.task;

import java.util.ArrayList;
import java.util.List;

public class FunctionEmployee {
	public static void main(String[] args) {
		Constant functionEmp = new Constant();
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(101, "Ram", 98431, 2500));
		list.add(new Employee(102, "Kiran", 98432, 3500));
		list.add(new Employee(103, "Vinay", 98433, 4500));
		list.add(new Employee(104, "Ajith", 98434, 5500));
		list.add(new Employee(105, "Suriya", 98435, 6000));
		list.add(new Employee(106, "Karthi", 98436, 7500));
		list.add(new Employee(107, "Vimal", 98437, 9000));
		list.add(new Employee(108, "Lal", 98438, 10500));
		list.add(new Employee(109, "Niv", 98439, 12000));
		list.add(new Employee(110, "Vikram", 98440, 13500));
		functionEmp.setEmpList(list);
		try {
			functionEmp.findId(101);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		try {
			functionEmp.findPhoneNumber(98436);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		try {
			functionEmp.findEmpName("a");
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}

	}
}
