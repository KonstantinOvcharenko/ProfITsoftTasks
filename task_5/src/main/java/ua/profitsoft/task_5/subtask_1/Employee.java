package ua.profitsoft.task_5.subtask_1;

public abstract class Employee {
	private int id;
	private String name;
	private String surname;

	private double salaryRate;
	private double workedHours;
	protected boolean role;

	protected static final double workingHours = 160;
	private static int lastId = 0;

	Employee(String name, String surname) {
		id = lastId++;
		this.name = name;
		this.surname = surname;
	}

	public void setSalaryRate(double value) {
		salaryRate = value;
	}

	public void setWorkedHours(double value) {
		workedHours = value;
	}

	protected double getPercentageOfTimeWorked() {
		return workedHours / workingHours;
	}

	public abstract double calculateSalary();

	protected double getSalaryRate() {
		return salaryRate;
	}

	private String getRole() {
		return role == true ? "Programmer" : "Manager";
	}

	@Override
	public String toString() {
		return "#" + id + " | " + name + " " + surname + " | " + getRole() + " | worked: "
				+ String.format("%.2f", workedHours) + "h of " + String.format("%.2f", workingHours) + "h | salary: "
				+ String.format("%.2f", calculateSalary()) + "$ of " + String.format("%.2f", salaryRate) + "$";
	}
}
