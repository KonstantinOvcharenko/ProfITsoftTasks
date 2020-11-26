package ua.profitsoft.task_2;

import org.junit.jupiter.api.*;
import static ua.profitsoft.task_2.StringRecursion.interviewRecursionTest;

class StringRecursionTest {

	@Test
	void test1() {
		Assertions.assertEquals("h*e*ll*o", interviewRecursionTest("hello"));
	}

	@Test
	void test2() {
		Assertions.assertEquals("h*e*a*l*o", interviewRecursionTest("healo"));
	}

	@Test
	void test3() {
		Assertions.assertEquals("a*bc", interviewRecursionTest("abc"));
	}

	@Test
	void test4() {
		Assertions.assertEquals("o*a*b", interviewRecursionTest("oab"));
	}

	@Test
	void difficultWord() {
		Assertions.assertEquals("I*nt*e*ll*i*g*e*nc*e", interviewRecursionTest("Intelligence"));
	}
}
