package ua.profitsoft.task_1;

import org.junit.jupiter.api.*;

class ManagerTest {

	Manager m1 = new Manager("Andrew", "Baker");
	Manager m2 = new Manager("Julia", "Mills");

	@BeforeEach
	void setManagers() {

		// more than norm for manager
		m1.setWorkedHours(173.);
		m1.setSalaryRate(760.);

		// less than norm for manager
		m2.setWorkedHours(154.);
		m2.setSalaryRate(920.);
	}

	@Test
	void testOverworkedManager() {
		double expected = 760.;
		Assertions.assertEquals(expected, m1.calculateSalary());
	}

	@Test
	void testUnderworkedManager() {
		double expected = (154. / 160) * 920;
		Assertions.assertEquals(expected, m2.calculateSalary());
	}

	@Test
	void testIsResultNoNull() {
		Assertions.assertTrue(m1.calculateSalary() != 0);
	}

	@Test
	void testReturnType() {
		Assertions.assertTrue(Double.valueOf(m2.calculateSalary()) instanceof Double);
	}

}
