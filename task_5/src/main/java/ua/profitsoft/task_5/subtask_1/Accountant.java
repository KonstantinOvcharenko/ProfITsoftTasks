package ua.profitsoft.task_5.subtask_1;

import java.util.ArrayList;

public class Accountant {
	public static double calculateTotalSalary(ArrayList<Employee> employeeList) {
		double totalSalary = 0;
		for (Employee empl : employeeList) {
			totalSalary += empl.calculateSalary();
		}
		return totalSalary;
	}
}
