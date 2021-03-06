package ua.profitsoft.task_1;

public class Programmer extends Employee {
	public Programmer(String name, String surname) {
		super(name, surname);
		role = true;
	}

	@Override
	public double calculateSalary() {
		return getPercentageOfTimeWorked() * getSalaryRate();
	}
}
