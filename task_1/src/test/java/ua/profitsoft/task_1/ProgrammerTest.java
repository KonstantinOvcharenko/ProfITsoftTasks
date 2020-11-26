package ua.profitsoft.task_1;

import org.junit.jupiter.api.*;

class ProgrammerTest {

	Programmer p1 = new Programmer("Tom", "Jackson");
	Programmer p2 = new Programmer("Jessica", "Stone");

	@BeforeEach
	void setProgrammers() {

		// less than norm for programmer
		p1.setWorkedHours(147.);
		p1.setSalaryRate(1520.);

		// more than norm for programmer
		p2.setWorkedHours(163.);
		p2.setSalaryRate(1850.);
	}

	@Test
	void testUnderworkedProgrammer() {
		double expected = (147. / 160) * 1520;
		Assertions.assertEquals(expected, p1.calculateSalary());
	}

	@Test
	void testOverworkedProgrammer() {
		double expected = (163. / 160) * 1850;
		Assertions.assertEquals(expected, p2.calculateSalary());
	}

	@Test
	void testIsResultNoNull() {
		Assertions.assertTrue(p1.calculateSalary() != 0);
	}

	@Test
	void testReturnType() {
		Assertions.assertTrue(Double.valueOf(p2.calculateSalary()) instanceof Double);
	}
}
