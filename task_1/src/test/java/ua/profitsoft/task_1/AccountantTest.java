package ua.profitsoft.task_1;

import java.util.ArrayList;
import org.junit.jupiter.api.*;
import static ua.profitsoft.task_1.Accountant.calculateTotalSalary;

class AccountantTest {

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	ArrayList<Employee> employeeList;

	Programmer p1 = new Programmer("Tom", "Jackson");
	Programmer p2 = new Programmer("Jessica", "Stone");

	Manager m1 = new Manager("Andrew", "Baker");
	Manager m2 = new Manager("Julia", "Mills");

	@BeforeEach
	void initializeEmployeeList() {

		employeeList = new ArrayList<Employee>();
		employeeList.add(p1);
		employeeList.add(p2);
		employeeList.add(m1);
		employeeList.add(m2);

	}

	@BeforeEach
	void setEmployees() {

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

	}

	@Test
	void testCalculationOfTotalSalary() {

		double expected = (147. / 160) * 1520 + (163. / 160) * 1850 + 760 + (154. / 160) * 920;

		Assertions.assertEquals(expected, calculateTotalSalary(employeeList));
	}

	@Test
	void testIsResultNoNull() {
		Assertions.assertTrue(calculateTotalSalary(employeeList) != 0);
	}

	@Test
	void testReturnType() {
		Assertions.assertTrue(Double.valueOf(calculateTotalSalary(employeeList)) instanceof Double);
	}

}
