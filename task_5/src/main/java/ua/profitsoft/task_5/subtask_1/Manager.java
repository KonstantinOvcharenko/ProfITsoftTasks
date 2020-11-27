package ua.profitsoft.task_5.subtask_1;

public class Manager extends Employee {
	public Manager(String name, String surname) {
		super(name, surname);
		role = false;
	}

	@Override
	public double calculateSalary() {
		if (getPercentageOfTimeWorked() >= 1.) {
			return getSalaryRate();
		}
		return getPercentageOfTimeWorked() * getSalaryRate();
	}
}
