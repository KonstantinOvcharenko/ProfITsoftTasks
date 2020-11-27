package ua.profitsoft.task_5.subtask_1;

import java.util.ArrayList;

public class Demo {
	public static void main(String[] args) {

		ArrayList<Employee> employeeList = new ArrayList<Employee>();

		Programmer p1 = new Programmer("Tom", "Jackson");
		Programmer p2 = new Programmer("Jessica", "Stone");

		Manager m1 = new Manager("Andrew", "Baker");
		Manager m2 = new Manager("Julia", "Mills");

		// less than norm for programmer
		p1.setWorkedHours(147.);
		p1.setSalaryRate(1520.);

		// more than norm for programmer
		p2.setWorkedHours(163.);
		p2.setSalaryRate(1850.);

		// more than norm for manager
		m1.setWorkedHours(173.);
		m1.setSalaryRate(760.);

		// less than norm for manager
		m2.setWorkedHours(154.);
		m2.setSalaryRate(920.);

		employeeList.add(p1);
		employeeList.add(p2);
		employeeList.add(m1);
		employeeList.add(m2);

		for (Employee empl : employeeList) {
			System.out.println(empl);
		}

		System.out.println("\nTotal monthly salary: "
				+ String.format("%.2f", Accountant.calculateTotalSalary(employeeList)) + "$");
	}
}
